package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dao.ComputerDao;
import entity.Computer;
import view.ClientView;


public class ComputerController {
    private ComputerDao computerDao;
    private ClientView clientView;

    public ComputerController(ClientView clientView) {
        this.clientView = clientView;
        computerDao = new ComputerDao();

        clientView.addAddComListener(new AddComListener());
        clientView.addEditComListener(new EditComListener());
        clientView.addClearComListener(new ClearComListener());
        clientView.addDeleteComListener(new DeleteComListener());
        clientView.addListComSelectionListener(new ListComSelectionListener());
        clientView.addSortIdleComListener(new SortIdleListener());
        clientView.addSortUsingComListener(new SortUsingListener());
        clientView.addRentComListener(new RentComListener());
    }

    public void showComputerView() {
        List<Computer> computerList = computerDao.getListComputers();
        clientView.setVisible(true);
        clientView.showListComputers(computerList);
    }

    class AddComListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Computer computer = clientView.getComputerInfo();
            if (computer != null) {
                computerDao.add(computer);
                clientView.showCom(computer);
                clientView.showListComputers(computerDao.getListComputers());
                clientView.showMessage("Đã thêm");
            }
        }

    }

    class EditComListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Computer computer = clientView.getComputerInfo();
            if (computer != null) {
                computerDao.edit(computer);
                clientView.showCom(computer);
                clientView.showListComputers(computerDao.getListComputers());
                clientView.showMessage("Đã cập nhật");
            }
        }
        
    }

    class DeleteComListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Computer computer = clientView.getComputerInfo();
            if (computer != null) {
                computerDao.delete(computer);
                clientView.clearComInfo();
                clientView.showListComputers(computerDao.getListComputers());
                clientView.showMessage("Đã xóa");
            }
        }
    }

    class RentComListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Computer computer = clientView.getComputerInfo();
            computerDao.rentCom(computer, clientView.getUserCom(), clientView.getTimeRented());
            if(computerDao.rentCom(computer, clientView.getUserCom(), clientView.getTimeRented())){
                clientView.showMessage("Đã cho thuê máy");
            }
            else{
                clientView.showMessage("Không thể cho thuê máy");
            }
            clientView.showListComputers(computerDao.getListComputers());
        }
        
    }

    class ClearComListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            clientView.clearComInfo();
        }
    }

    class SortIdleListener implements ActionListener {
        private List<Computer> computerList = computerDao.getListComputers();

        @Override
        public void actionPerformed(ActionEvent e) {
            List<Computer> searchResults = new ArrayList<Computer>();
            boolean isFound = false;

            for (Computer computer : computerList) {
                if (!computer.isUsed()) {
                    searchResults.add(computer);
                    isFound = true;
                } 
            }
            if (isFound) {
                clientView.showListComputers(searchResults);
            }
            else {
                clientView.showMessage("Không có máy trống");
            }

        }
    }

    class SortUsingListener implements ActionListener {
        private List<Computer> computerList = computerDao.getListComputers();

        @Override
        public void actionPerformed(ActionEvent e) {
            List<Computer> searchResults = new ArrayList<Computer>();
            boolean isFound = false;

            for (Computer computer : computerList) {
                if (computer.isUsed()) {
                    searchResults.add(computer);
                    isFound = true;
                } 
            }
            if (isFound) {
                clientView.showListComputers(searchResults);
            }
            else {
                clientView.showMessage("Không có máy đang dùng");
            }

        }
    }

    class ListComSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            clientView.fillComputerfromSelectedRow();
        }
    }
}