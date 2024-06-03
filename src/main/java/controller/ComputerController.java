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
    }

    public void showComputerView() {
        List<Computer> computerList = computerDao.getListComputers();
        clientView.setVisible(true);
        clientView.showListComputers(computerList);
    }
}