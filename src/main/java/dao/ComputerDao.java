package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Computer;
import entity.ComputerXML;
import utils.FileUtils;

public class ComputerDao {
    private static final String COMPUTER_FILE_NAME = "computer.xml";
    private List<Computer> listComputers;

    public ComputerDao(){
        this.listComputers = readListComputers();
        if (listComputers == null){
            listComputers = new ArrayList<Computer>();
        }
    }

    public void writeListComputer(List<Computer> computers){
        ComputerXML computerXML = new ComputerXML();
        computerXML.setComputer(computers);
        FileUtils.writeXMLtoFile(COMPUTER_FILE_NAME, computerXML);
    }

    public List<Computer> readListComputers(){
        List<Computer> list = new ArrayList<Computer>();
        ComputerXML computerXML = (ComputerXML) FileUtils.readXMLFile(COMPUTER_FILE_NAME, ComputerXML.class);
        if (computerXML != null){
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
    
}
