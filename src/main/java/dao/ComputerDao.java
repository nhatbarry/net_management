package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Client;
import entity.Computer;
import entity.ComputerXML;
import utils.FileUtils;
import dao.ClientDao;

public class ComputerDao {
    private static final String COMPUTER_FILE_NAME = "computer.xml";
    private List<Computer> listComputers;
    private List<Client> listClients;

    public ComputerDao() {
        this.listComputers = readListComputers();
        if (listComputers == null) {
            listComputers = new ArrayList<Computer>();
        }
    }

    public void writeListComputer(List<Computer> computers) {
        ComputerXML computerXML = new ComputerXML();
        computerXML.setComputer(computers);
        FileUtils.writeXMLtoFile(COMPUTER_FILE_NAME, computerXML);
    }

    public List<Computer> readListComputers() {
        List<Computer> list = new ArrayList<Computer>();
        ComputerXML computerXML = (ComputerXML) FileUtils.readXMLFile(COMPUTER_FILE_NAME, ComputerXML.class);
        if (computerXML != null) {
            list = computerXML.getComputer();
        }
        return list;
    }

    public List<Computer> getListComputers() {
        return listComputers;
    }

    public void setListComputers(List<Computer> listComputers) {
        this.listComputers = listComputers;
    }

    public void add(Computer computer) {
        int id = 1;
        if (listComputers != null && listComputers.size() > 0) {
            id = listComputers.size() + 1;
        }
        computer.setId(id);
        listComputers.add(computer);
        writeListComputer(listComputers);
    }

    public void edit(Computer computer) {
        int size = listComputers.size();
        for (int i = 0; i < size; i++) {
            if (listComputers.get(i).getId() == computer.getId()) {
                listComputers.get(i).setModel(computer.getModel());
                listComputers.get(i).setPrice(computer.getPrice());
                listComputers.get(i).setUsedTime(computer.getUsedTime());
                listComputers.get(i).setClientName(computer.getClientName());
                writeListComputer(listComputers);
                break;
            }
        }
    }

    public boolean delete(Computer computer) {
        boolean isFound = false;
        int size = listComputers.size();
        for (int i = 0; i < size; i++) {
            if (listComputers.get(i).getId() == computer.getId()) {
                computer = listComputers.get(i);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            listComputers.remove(computer);
            writeListComputer(listComputers);
            return true;
        }
        return false;
    }

    public boolean returnCom(Computer computer){
        boolean isFound = false;
        int size = listComputers.size();
        for (int i = 0; i < size; i++) {
            if (listComputers.get(i).getId() == computer.getId()) {
                computer = listComputers.get(i);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            computer.setUsed(false);
            computer.setClientName("");
            writeListComputer(listComputers);
            return true;
        }
        return false;
    }

    public boolean rentCom(Computer computer, String clientName, double time){
        boolean isFound = false;
        boolean isFound2 = false;
        boolean remainCheck = false;
        Client client = null;
        int size = listComputers.size();
        for (int i = 0; i < size; i++) {
            if (listComputers.get(i).getId() == computer.getId()) {
                computer = listComputers.get(i);
                isFound = true;
                break;
            }
        }
        ClientDao clientDao = new ClientDao();
        listClients = clientDao.readListClient();
        int size2 = listClients.size();
        for (int i = 0; i < size2; i++) {
            if (listClients.get(i).getName().equals(clientName)) {
                client = listClients.get(i);
                isFound2 = true;
                break;
            }
        }
        double bill = time * computer.getPrice() - time * computer.getPrice() * (client.getDiscount() / 100);
        if((client.getRemain() - bill) >= 0){
            remainCheck = true;
        }

        if (isFound && remainCheck && isFound2) {
            computer.setUsed(true);
            computer.setClientName(clientName);
            computer.setUsedTime(time);
            client.setRemain(client.getRemain() - bill);
            clientDao.writeListClient(listClients);
            writeListComputer(listComputers);
            return true;
        }
        return false;
    }
}
