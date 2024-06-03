
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import entity.Client;

public class ClientView extends javax.swing.JFrame {

    /**
     * Creates new form ClientView
     */
    private String[] columnNames = new String[] {
            "ID", "Tên", "Tuổi", "Tài khoản", "Giảm giá"
    };
    Client x;

    public ClientView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        remainLabel = new javax.swing.JLabel();
        discountLabel = new javax.swing.JLabel();
        discountField = new javax.swing.JTextField();
        remainField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        addClientBtn = new javax.swing.JButton();
        editClientBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        deleteClientBtn = new javax.swing.JButton();
        sortClientNameBtn = new javax.swing.JButton();
        sortClientIDBtn = new javax.swing.JButton();
        staticBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        remainSearchField1 = new javax.swing.JTextField();
        nameSearchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        remainSearchField2 = new javax.swing.JTextField();
        remainSearchBtn = new javax.swing.JButton();
        nameSearchBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("quản lý khách hàng"); // NOI18N
        setResizable(false);

        idLabel.setText("ID");

        nameLabel.setText("Tên");

        ageLabel.setText("Tuổi");

        remainLabel.setText("Tài khoản");

        discountLabel.setText("Giảm giá");

        discountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountFieldActionPerformed(evt);
            }
        });

        remainField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remainFieldActionPerformed(evt);
            }
        });

        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        clientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên", "Tuổi", "Tài khoản", "Giảm giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(clientTable);

        addClientBtn.setText("Thêm");
        addClientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientBtnActionPerformed(evt);
            }
        });

        editClientBtn.setText("Sửa");
        editClientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClientBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        deleteClientBtn.setText("Xóa");
        deleteClientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClientBtnActionPerformed(evt);
            }
        });

        sortClientNameBtn.setText("Sắp xếp theo tên");
        sortClientNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortClientNameBtnActionPerformed(evt);
            }
        });

        sortClientIDBtn.setText("Sắp xếp theo ID");
        sortClientIDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortClientIDBtnActionPerformed(evt);
            }
        });

        staticBtn.setText("Thống kê");
        staticBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("From");

        remainSearchField1.setText("0");
        remainSearchField1.setToolTipText("Nhập tên cần tìm");
        remainSearchField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remainSearchField1ActionPerformed(evt);
            }
        });

        nameSearchField.setToolTipText("Nhập tên cần tìm");
        nameSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSearchFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("To");

        remainSearchField2.setToolTipText("Nhập tên cần tìm");
        remainSearchField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remainSearchField2ActionPerformed(evt);
            }
        });

        remainSearchBtn.setText("Search by money");

        nameSearchBtn.setText("Search by name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(remainSearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(remainSearchField2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nameSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameSearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(remainSearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(remainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(remainField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(discountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(discountField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(staticBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addGap(17, 17, 17))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(addClientBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(editClientBtn))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(deleteClientBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clearBtn))
                                    .addComponent(sortClientNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sortClientIDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(remainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remainField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addClientBtn)
                            .addComponent(editClientBtn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteClientBtn)
                            .addComponent(clearBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sortClientNameBtn)
                        .addGap(18, 18, 18)
                        .addComponent(sortClientIDBtn)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameSearchBtn)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(staticBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remainSearchField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(remainSearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(remainSearchBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Khách hàng", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Máy tính", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sortClientIDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortClientIDBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortClientIDBtnActionPerformed

    private void remainSearchField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remainSearchField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remainSearchField1ActionPerformed

    private void remainSearchField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remainSearchField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remainSearchField2ActionPerformed

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public double findMaxRemaining(List<Client> list){
        int size = list.size();
        double max = 0;
        for(int i = 0; i < size; i++){
            if (list.get(i).getRemain() > max){
                max = list.get(i).getRemain();
            }
        }
        return max;
    }

    public void showListClients(List<Client> list) {
        int size = list.size();
        Object[][] clients = new Object[size][5];
        for (int i = 0; i < size; i++) {
            clients[i][0] = list.get(i).getId();
            clients[i][1] = list.get(i).getName();
            clients[i][2] = list.get(i).getAge();
            clients[i][3] = list.get(i).getRemain();
            clients[i][4] = list.get(i).getDiscount();
        }
        clientTable.setModel(new DefaultTableModel(clients, columnNames));
        this.remainSearchField2.setText("" + findMaxRemaining(list));
    }

    public void fillClientfromSelectedRow() {
        int row = clientTable.getSelectedRow();
        if (row >= 0) {
            idField.setText(clientTable.getModel().getValueAt(row, 0).toString());
            nameField.setText(clientTable.getModel().getValueAt(row, 1).toString());
            ageField.setText(clientTable.getModel().getValueAt(row, 2).toString());
            remainField.setText(clientTable.getModel().getValueAt(row, 3).toString());
            discountField.setText(clientTable.getModel().getValueAt(row, 4).toString());
            editClientBtn.setEnabled(true);
            deleteClientBtn.setEnabled(true);
            addClientBtn.setEnabled(false);
        }
    }

    public void clearClientInfo() {
        idField.setText("");
        nameField.setText("");
        ageField.setText("");
        remainField.setText("");
        discountField.setText("");
        editClientBtn.setEnabled(false);
        deleteClientBtn.setEnabled(false);
        addClientBtn.setEnabled(true);
    }

    public void showClient(Client client) {
        fillClientfromSelectedRow();
        idField.setText("" + client.getId());
        nameField.setText(client.getName());
        ageField.setText("" + client.getAge());
        remainField.setText("" + client.getRemain());
        discountField.setText("" + client.getDiscount());
        editClientBtn.setEnabled(true);
        deleteClientBtn.setEnabled(true);
        addClientBtn.setEnabled(false);
    }

    public Client getClientInfo() {
        if (!validateName() || !validateAge() || !validateRemain() || !validateDiscount())
            return null;

        try {
            Client client = new Client();
            if (idField.getText() != null && !"".equals(idField.getText())) {
                client.setId(Integer.parseInt(idField.getText()));
            }
            client.setName(nameField.getText());
            client.setAge(Integer.parseInt(ageField.getText()));
            client.setRemain(Double.parseDouble(remainField.getText()));
            client.setDiscount(Double.parseDouble(discountField.getText()));
            return client;
        } catch (Exception e) {
            // Handle the exception appropriately
            e.printStackTrace(); // Print the stack trace for debugging
            // Or display an error message to the user
            showMessage("An error occurred while creating the client");
        }
        return null;
    }

    public String getNameSearchField() {
        return this.nameSearchField.getText();
    }

    public String getRemainSearchField1(){
        return this.remainSearchField1.getText();
    }

    public String getRemainSearchField2(){
        return this.remainSearchField2.getText();
    }

    private boolean validateName() {
        String name = nameField.getText();
        if (name == null || "".equals(name.trim())) {
            nameField.requestFocus();
            showMessage("Name không được trống.");
            return false;
        }
        return true;
    }

    private boolean validateAge() {
        try {
            Integer age = Integer.parseInt(ageField.getText().trim());
            if (age < 0 || age > 100) {
                ageField.requestFocus();
                showMessage("Age không hợp lệ, age nên trong khoảng 0 đến 100.");
                return false;
            }
        } catch (Exception e) {
            ageField.requestFocus();
            showMessage("Age không hợp lệ!");
            return false;
        }
        return true;
    }

    private boolean validateRemain() {
        try {
            Double remain = Double.parseDouble(remainField.getText().trim());
            if (remain < 0) {
                ageField.requestFocus();
                showMessage("Remain không hợp lệ, số tiền phải lớn hơn 0.");
                return false;
            }
        } catch (Exception e) {
            remainField.requestFocus();
            showMessage("Remain không hợp lệ!");
            return false;
        }
        return true;
    }

    private boolean validateDiscount() {
        try {
            Double discount = Double.parseDouble(discountField.getText().trim());
            if (discount < 0 || discount > 100) {
                ageField.requestFocus();
                showMessage("Discount không hợp lệ, discount phải lớn hơn 0 và nhỏ hơn 100.");
                return false;
            }
        } catch (Exception e) {
            discountField.requestFocus();
            showMessage("Discount không hợp lệ!");
            return false;
        }
        return true;
    }

    public void actionPerformed(ActionEvent e) {
    }

    public void valueChanged(ListSelectionEvent e) {
    }

    public void addAddClientListener(ActionListener listener) {
        addClientBtn.addActionListener(listener);
    }

    public void addEditClientListener(ActionListener listener) {
        editClientBtn.addActionListener(listener);
    }

    public void addDeleteClientListener(ActionListener listener) {
        deleteClientBtn.addActionListener(listener);
    }

    public void addClearListener(ActionListener listener) {
        clearBtn.addActionListener(listener);
    }

    public void addSortClientNameListener(ActionListener listener) {
        sortClientNameBtn.addActionListener(listener);
    }

    public void addSortClientIDListener(ActionListener listener){
        sortClientIDBtn.addActionListener(listener);
    }

    public void addListClientSelectionListener(ListSelectionListener listener) {
        clientTable.getSelectionModel().addListSelectionListener(listener);
    }

    public void addSearchListener(ActionListener listener) {
        nameSearchBtn.addActionListener(listener);
    }

    public void addRemainSearchListener(ActionListener listener){
        remainSearchBtn.addActionListener(listener);
    }

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_idFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_nameFieldActionPerformed

    private void addClientBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addClientBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_addClientBtnActionPerformed

    private void editClientBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editClientBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_editClientBtnActionPerformed

    private void nameSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_searchFieldActionPerformed

    private void deleteClientBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteClientBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_deleteClientBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_clearBtnActionPerformed

    private void sortClientNameBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sortClientNameBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_sortClientNameBtnActionPerformed

    private void staticBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_serviceBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_serviceBtnActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ageFieldActionPerformed

    private void remainFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_remainFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_remainFieldActionPerformed

    private void discountFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_discountFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_discountFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClientBtn;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTable clientTable;
    private javax.swing.JButton deleteClientBtn;
    private javax.swing.JTextField discountField;
    private javax.swing.JLabel discountLabel;
    private javax.swing.JButton editClientBtn;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton nameSearchBtn;
    private javax.swing.JTextField nameSearchField;
    private javax.swing.JTextField remainField;
    private javax.swing.JLabel remainLabel;
    private javax.swing.JButton remainSearchBtn;
    private javax.swing.JTextField remainSearchField1;
    private javax.swing.JTextField remainSearchField2;
    private javax.swing.JButton sortClientIDBtn;
    private javax.swing.JButton sortClientNameBtn;
    private javax.swing.JButton staticBtn;
    // End of variables declaration//GEN-END:variables
}
