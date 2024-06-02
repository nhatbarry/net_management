package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dao.ClientDao;
import entity.Client;
import view.ClientView;

public class ClientController {
    private ClientDao clientDao;
    private ClientView clientView;

    public ClientController(ClientView view) {
        this.clientView = view;
        clientDao = new ClientDao();

        view.addAddClientListener(new AddClientListener());
        view.addEditClientListener(new EditClientListener());
        view.addDeleteClientListener(new DeleteClientListener());
        view.addClearListener(new ClearClientListener());
        view.addSortClientNameListener(new SortClientNameListener());
        view.addSortClientIDListener(new SortClientIDListener());
        view.addListClientSelectionListener(new ListClientSelectionListener());
        view.addSearchListener(new SearchNameListener());
        view.addRemainSearchListener(new SearchRemainListener());
    }

    public void showClientView() {
        List<Client> clientList = clientDao.getListClients();
        clientView.setVisible(true);
        clientView.showListClients(clientList);
    }

    class AddClientListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Client client = clientView.getClientInfo();
            if (client != null) {
                clientDao.add(client);
                clientView.showClient(client);
                clientView.showListClients(clientDao.getListClients());
                clientView.showMessage("Đã thêm");
            }
        }

    }

    class EditClientListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Client client = clientView.getClientInfo();
            if (client != null) {
                clientDao.edit(client);
                clientView.showClient(client);
                clientView.showListClients(clientDao.getListClients());
                clientView.showMessage("Đã cập nhật");
            }
        }

    }

    class DeleteClientListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Client client = clientView.getClientInfo();
            if (client != null) {
                clientDao.delete(client);
                clientView.clearClientInfo();
                clientView.showListClients(clientDao.getListClients());
                clientView.showMessage("Đã xóa");
            }
        }
    }

    class ClearClientListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            clientView.clearClientInfo();
        }

    }

    class SortClientNameListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            clientDao.sortClientByName();
            clientView.showListClients(clientDao.getListClients());
        }

    }

    class SortClientIDListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            clientDao.sortClientByID();;
            clientView.showListClients(clientDao.getListClients());
        }
        
    }

    class SearchNameListener implements ActionListener {
        private List<Client> clientList = clientDao.getListClients();

        @Override
        public void actionPerformed(ActionEvent e) {
            String searchField = clientView.getNameSearchField();
            List<Client> searchResults = new ArrayList<Client>();
            boolean isFound = false;

            for (Client client : clientList) {
                if (client.getName().contains(searchField)) {
                    searchResults.add(client);
                    isFound = true;
                } 
            }
            if (isFound) {
                clientView.showListClients(searchResults);
            }
            else {
                clientView.showMessage("Không tìm thấy");
            }

        }
    }

    class SearchRemainListener implements ActionListener{
        private List<Client> clientList = clientDao.getListClients();

        @Override
        public void actionPerformed(ActionEvent e) {
            Double remainSearchField1 = Double.parseDouble(clientView.getRemainSearchField1());
            Double remainSearchField2 = Double.parseDouble(clientView.getRemainSearchField2());
            List<Client> results = new ArrayList<Client>();
            boolean isFound = false;

            for (Client client : clientList){
                if(client.getRemain() < remainSearchField2 && client.getRemain() > remainSearchField1){
                    results.add(client);
                    isFound = true;
                }
            }
            if (isFound) {
                clientView.showListClients(results);
            }
            else {
                clientView.showMessage("Không tìm thấy");
            }
        }
        
    }

    class ListClientSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            clientView.fillClientfromSelectedRow();
        }
    }

}
