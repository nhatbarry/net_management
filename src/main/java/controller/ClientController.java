package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        view.addListStudentSelectionListener(new ListClientSelectionListener());
    }

    public void showClientView(){
        List<Client> clientList = clientDao.getListClients();
        clientView.setVisible(true);
        clientView.showListClients(clientList);
    }

    class AddClientListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Client client = clientView.getClientInfo();
            if (client != null){
                clientDao.add(client);
                clientView.showClient(client);
                clientView.showListClients(clientDao.getListClients());
                clientView.showMessage("Đã thêm");
            }
        }
        
    }

    class EditClientListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Client client = clientView.getClientInfo();
            if (client != null){
                clientDao.edit(client);
                clientView.showClient(client);
                clientView.showListClients(clientDao.getListClients());
                clientView.showMessage("Đã cập nhật");
            }
        }
        
    }

    class DeleteClientListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Client client = clientView.getClientInfo();
            if (client != null){
                clientDao.delete(client);
                clientView.clearClientInfo();
                clientView.showListClients(clientDao.getListClients());
                clientView.showMessage("Đã xóa");
            }
        }
    }

    class ClearClientListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            clientView.clearClientInfo();
        }
        
    }

    class ListClientSelectionListener implements ListSelectionListener{
        public void valueChanged(ListSelectionEvent e){
            clientView.fillClientfromSelectedRow();
        }
    }
    
}
