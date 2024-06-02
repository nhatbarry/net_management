package dao;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entity.Client;
import entity.ClientXML;
import utils.FileUtils;

public class ClientDao {
    private static final String CLIENT_FILE_NAME = "client.xml";
    private List<Client> listClients;

    public ClientDao(){
        this.listClients = readListClient();
        if (listClients == null){
            listClients = new ArrayList<Client>();
        }
    }

    public void writeListClient(List<Client> clients){
        ClientXML clientXML = new ClientXML();
        clientXML.setClient(clients);
        FileUtils.writeXMLtoFile(CLIENT_FILE_NAME, clientXML);
    }

    public List<Client> readListClient(){
        List<Client> list = new ArrayList<Client>();
        ClientXML clientXML = (ClientXML) FileUtils.readXMLFile(CLIENT_FILE_NAME, ClientXML.class);
        if (clientXML != null){
            list = clientXML.getClient();
        }
        return list;
    }

    public void add(Client client){
        int id = 1;
        if (listClients != null && listClients.size() > 0){
            id = listClients.size() + 1;
        }
        client.setId(id);
        listClients.add(client);
        writeListClient(listClients);
    }

    public void edit(Client client){
        int size = listClients.size();
        for (int i = 0; i < size; i++){
            if (listClients.get(i).getId() == client.getId()) {
                listClients.get(i).setName(client.getName());
                listClients.get(i).setAge(client.getAge());
                listClients.get(i).setRemain(client.getRemain());
                listClients.get(i).setDiscount(client.getDiscount());
                writeListClient(listClients);
                break;
            }
        }
    }

    public boolean delete(Client client){
        boolean isFound = false;
        int size = listClients.size();
        for (int i = 0; i < size; i++){
            if (listClients.get(i).getId() == client.getId()){
                client = listClients.get(i);
                isFound = true;
                break;
            }
        }
        if(isFound){
            listClients.remove(client);
            writeListClient(listClients);
            return true;
        }
        return false;
    }

    public void sortClientByName(){
        Collections.sort(listClients, new Comparator<Client>() {
            public int compare(Client client1, Client client2){
                return client1.getName().compareTo(client2.getName());
            }
        });
    }

    public List<Client> getListClients() {
        return listClients;
    }

    public void setListClients(List<Client> listClients) {
        this.listClients = listClients;
    }

}
