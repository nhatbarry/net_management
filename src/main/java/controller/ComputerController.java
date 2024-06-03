package controller;

import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dao.ComputerDao;
import entity.Computer;
import view.ClientView;

public class ComputerController {
    public ComputerDao computerDao;
    public ClientView view;

    public ComputerController(ClientView view) {
        this.view = view;
        computerDao = new ComputerDao();

        view.addListIdleCompSelectionListener(new ListIdleCompSelectionListener());
        view.addListUsingCompSelectionListener(new ListUsingSelectionListener());

    }

    public void showIdleCompView() {
        List<Computer> computersList = computerDao.getListComputers();
        view.setVisible(true);
        view.showListIdleComputers(computersList);
    }
    public void showUsingCompView() {
        List<Computer> computersList = computerDao.getListComputers();
        view.setVisible(true);
        view.showListUsingComputers(computersList);
    }

    class ListIdleCompSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            view.fillFromSelectedRowIdle();
        }
    }
    class ListUsingSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            view.fillFromSelectedRowUsing();
        }
    }
}
