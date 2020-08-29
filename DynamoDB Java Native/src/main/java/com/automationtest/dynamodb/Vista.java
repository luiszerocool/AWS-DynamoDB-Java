package com.automationtest.dynamodb;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.model.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LuisAngel
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);//para centrar la ventana
            AWSCredentials credentials = new PropertiesCredentials(
                    DynamoDBClient.class
                            .getResourceAsStream("AwsCredentials.properties"));
            client = new AmazonDynamoDBClient(credentials);
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            txtArea2.setText(ex.getMessage());
        }
    }

    private String tableName = "ProductCatalog";
    private AmazonDynamoDBClient client = null;

    public void logMessage(String msg) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        txtArea2.setText(sdf.format(new Date()) + " ==> " + msg);
    }

    public void logMessagePrincipal(String msg) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        txtArea.setText(sdf.format(new Date()) + " ==> " + msg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCrearTabla = new javax.swing.JButton();
        btnDescribirTabla = new javax.swing.JButton();
        btnActualizarTabla = new javax.swing.JButton();
        btnListarTablas = new javax.swing.JButton();
        btnEliminarTabla = new javax.swing.JButton();
        btnAgregarDato = new javax.swing.JButton();
        btnActualizarDato = new javax.swing.JButton();
        btnEliminarDato = new javax.swing.JButton();
        btnListarDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Laboratorio de DynamoDB con Java");

        btnCrearTabla.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCrearTabla.setText("Crear Tabla");
        btnCrearTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTablaActionPerformed(evt);
            }
        });

        btnDescribirTabla.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDescribirTabla.setText("Describir Tabla");
        btnDescribirTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescribirTablaActionPerformed(evt);
            }
        });

        btnActualizarTabla.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnActualizarTabla.setText("Actualizar Tabla");
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });

        btnListarTablas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnListarTablas.setText("Listar Tablas");
        btnListarTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTablasActionPerformed(evt);
            }
        });

        btnEliminarTabla.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminarTabla.setText("Eliminar Tabla");
        btnEliminarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTablaActionPerformed(evt);
            }
        });

        btnAgregarDato.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregarDato.setText("Agregar Datos");
        btnAgregarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDatoActionPerformed(evt);
            }
        });

        btnActualizarDato.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnActualizarDato.setText("Actualizar Datos");
        btnActualizarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatoActionPerformed(evt);
            }
        });

        btnEliminarDato.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminarDato.setText("Eliminar Datos");
        btnEliminarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDatoActionPerformed(evt);
            }
        });

        btnListarDatos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnListarDatos.setText("Listar Datos");
        btnListarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDatosActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        txtArea2.setColumns(20);
        txtArea2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtArea2.setRows(5);
        jScrollPane2.setViewportView(txtArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearTabla)
                            .addComponent(btnListarTablas))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarTabla)
                            .addComponent(btnDescribirTabla))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListarDatos)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarDato)
                                .addGap(27, 27, 27)
                                .addComponent(btnActualizarDato)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarDato)
                                .addGap(29, 29, 29)
                                .addComponent(btnActualizarTabla))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnCrearTabla))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDescribirTabla)
                            .addComponent(btnAgregarDato)
                            .addComponent(btnActualizarDato)
                            .addComponent(btnEliminarDato)
                            .addComponent(btnActualizarTabla))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarTablas)
                    .addComponent(btnEliminarTabla)
                    .addComponent(btnListarDatos))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTablaActionPerformed
        logMessage("Creando Tabla " + tableName);

        ArrayList<AttributeDefinition> attributeDefinitions = new ArrayList<AttributeDefinition>();
        attributeDefinitions.add(new AttributeDefinition().withAttributeName(
                "Id").withAttributeType("N"));

        ArrayList<KeySchemaElement> ks = new ArrayList<KeySchemaElement>();
        ks.add(new KeySchemaElement().withAttributeName("Id").withKeyType(
                KeyType.HASH));

        ProvisionedThroughput provisionedThroughput = new ProvisionedThroughput()
                .withReadCapacityUnits(10L).withWriteCapacityUnits(10L);

        CreateTableRequest request = new CreateTableRequest()
                .withTableName(tableName)
                .withAttributeDefinitions(attributeDefinitions)
                .withKeySchema(ks)
                .withProvisionedThroughput(provisionedThroughput);

        CreateTableResult result = client.createTable(request);
        
        while (!"ACTIVE".equalsIgnoreCase(getTableStatus())) {
            try {
                logMessagePrincipal("Esperando a que se cree la tabla. Espere 10 segundos");
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                txtArea2.setText(ex.getMessage());
            }
        }
        logMessagePrincipal("Tabla Creada Correctamente "
                + result.getTableDescription().getTableName());
    }//GEN-LAST:event_btnCrearTablaActionPerformed

    private void btnDescribirTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescribirTablaActionPerformed
        logMessage("Describiendo Tabla " + tableName);
        TableDescription tableDescription = client.describeTable(
                new DescribeTableRequest().withTableName(tableName)).getTable();
        String desc = String.format(
                "%s: %s \t Unidades de Capacidad de Lectura: %d \t Unidades de Capacidad de Escritura: %d",
                tableDescription.getTableStatus(), tableDescription
                .getTableName(), tableDescription
                        .getProvisionedThroughput().getReadCapacityUnits(),
                tableDescription.getProvisionedThroughput()
                        .getWriteCapacityUnits());
        logMessagePrincipal(desc);
    }//GEN-LAST:event_btnDescribirTablaActionPerformed

    private void btnAgregarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDatoActionPerformed
        putItems();
    }//GEN-LAST:event_btnAgregarDatoActionPerformed

    private void btnActualizarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatoActionPerformed
        Map<String, AttributeValueUpdate> updateItems = new HashMap<String, AttributeValueUpdate>();
        logMessage("Escribiendo Dato Después de Actualizarlos...");
        listItems();//////mostrar datos antes de actualizarse
        HashMap<String, AttributeValue> key = new HashMap<String, AttributeValue>();
        key.put("Id", new AttributeValue().withN("201"));

        // Add two new authors to the list.
        updateItems
                .put("Color",
                        new AttributeValueUpdate().withAction(
                                AttributeAction.ADD).withValue(
                                        new AttributeValue().withSS("White", "Gold")));
        ReturnValue returnValues = ReturnValue.ALL_NEW;

        UpdateItemRequest updateItemRequest = new UpdateItemRequest()
                .withTableName(tableName).withKey(key)
                .withAttributeUpdates(updateItems)
                .withReturnValues(returnValues);

        UpdateItemResult result = client.updateItem(updateItemRequest);

        // Check the response.

        logMessage("Dato Actualizado: "+printItem(result.getAttributes()));
    }//GEN-LAST:event_btnActualizarDatoActionPerformed

    private void btnEliminarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDatoActionPerformed
        Map<String, ExpectedAttributeValue> expectedValues = new HashMap<String, ExpectedAttributeValue>();
        HashMap<String, AttributeValue> key = new HashMap<String, AttributeValue>();
        key.put("Id", new AttributeValue().withN("205"));

        expectedValues.put("Gender", new ExpectedAttributeValue()
                .withValue(new AttributeValue().withS("B")));

        ReturnValue returnValues = ReturnValue.ALL_OLD;

        DeleteItemRequest deleteItemRequest = new DeleteItemRequest()
                .withTableName(tableName).withKey(key)
                .withExpected(expectedValues).withReturnValues(returnValues);

        DeleteItemResult result = client.deleteItem(deleteItemRequest);

        // Check the response.
        logMessage("Escribiendo Dato Eliminado...");
        logMessagePrincipal(printItem(result.getAttributes()));
    }//GEN-LAST:event_btnEliminarDatoActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        updateTable();
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void btnListarTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTablasActionPerformed
        logMessage("Listando Tablas");
        // Initial value for the first page of table names.
        String lastEvaluatedTableName = null, tablas ="";
        do {

            ListTablesRequest listTablesRequest = new ListTablesRequest()
                    .withLimit(10).withExclusiveStartTableName(
                    lastEvaluatedTableName);

            ListTablesResult result = client.listTables(listTablesRequest);
            lastEvaluatedTableName = result.getLastEvaluatedTableName();

            for (String name : result.getTableNames()) {
                tablas = tablas + name + "\t";
            }
        } while (lastEvaluatedTableName != null);
        logMessagePrincipal(tablas);
    }//GEN-LAST:event_btnListarTablasActionPerformed

    private void btnEliminarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTablaActionPerformed
        logMessage("Eliminando Tabla " + tableName);

        DeleteTableRequest deleteTableRequest = new DeleteTableRequest()
                .withTableName(tableName);
        DeleteTableResult result = client.deleteTable(deleteTableRequest);

        try {
            while ("DELETING".equalsIgnoreCase(getTableStatus())) {
                logMessagePrincipal("Esperando a que se elimine la tabla. Espere 10 segundos");
                Thread.sleep(10000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            txtArea2.setText(ex.getMessage());
        }

        logMessage("Tabla Eliminada "
                + result.getTableDescription().getTableName());
    }//GEN-LAST:event_btnEliminarTablaActionPerformed

    private void btnListarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDatosActionPerformed
        listItems();
    }//GEN-LAST:event_btnListarDatosActionPerformed

    //////////METODOS COMUNES\\\\\\\\\\\\\\\
    public void updateTable() {
        logMessage("Actualizando Tabla " + tableName);
        ProvisionedThroughput provisionedThroughput = new ProvisionedThroughput()
                .withReadCapacityUnits(5L).withWriteCapacityUnits(10L);

        UpdateTableRequest updateTableRequest = new UpdateTableRequest()
                .withTableName(tableName).withProvisionedThroughput(
                provisionedThroughput);

        UpdateTableResult result = client.updateTable(updateTableRequest);

        while ("UPDATING".equalsIgnoreCase(getTableStatus())) {
            logMessagePrincipal("Esperando a que se actualice la tabla. Espere 10 segundos ");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                txtArea2.setText(ex.getMessage());
            }
        }

        logMessagePrincipal("Tabla Actualizada "
                + result.getTableDescription().getTableName());
    }

    public void putItems() {
        logMessage("Agregando Datos a la Tabla " + tableName);
        Map<String, AttributeValue> item = new HashMap<String, AttributeValue>();

        // Add bikes.
        item.put("Id", new AttributeValue().withN("201"));
        // Size, followed by some title.
        item.put("Title", new AttributeValue().withS("18-Bike-201"));
        item.put("Description", new AttributeValue().withS("201 Description"));
        item.put("BicycleType", new AttributeValue().withS("Road"));
        item.put("Brand", new AttributeValue().withS("Mountain A")); // Trek,
        // Specialized.
        item.put("Price", new AttributeValue().withN("100"));
        item.put("Gender", new AttributeValue().withS("M")); // Men's
        item.put("Color",
                new AttributeValue().withSS(Arrays.asList("Red", "Black")));
        item.put("ProductCategory", new AttributeValue().withS("Bicycle"));

        PutItemRequest itemRequest = new PutItemRequest().withTableName(
                tableName).withItem(item);
        client.putItem(itemRequest);
        item.clear();

        item.put("Id", new AttributeValue().withN("202"));
        item.put("Title", new AttributeValue().withS("21-Bike-202"));
        item.put("Description", new AttributeValue().withS("202 Description"));
        item.put("BicycleType", new AttributeValue().withS("Road"));
        item.put("Brand", new AttributeValue().withS("Brand-Company A"));
        item.put("Price", new AttributeValue().withN("200"));
        item.put("Gender", new AttributeValue().withS("M"));
        item.put("Color",
                new AttributeValue().withSS(Arrays.asList("Green", "Black")));
        item.put("ProductCategory", new AttributeValue().withS("Bicycle"));

        itemRequest = new PutItemRequest().withTableName(tableName).withItem(
                item);
        client.putItem(itemRequest);
        item.clear();

        item.put("Id", new AttributeValue().withN("203"));
        item.put("Title", new AttributeValue().withS("19-Bike-203"));
        item.put("Description", new AttributeValue().withS("203 Description"));
        item.put("BicycleType", new AttributeValue().withS("Road"));
        item.put("Brand", new AttributeValue().withS("Brand-Company B"));
        item.put("Price", new AttributeValue().withN("300"));
        item.put("Gender", new AttributeValue().withS("W")); // Women's
        item.put("Color", new AttributeValue().withSS(Arrays.asList("Red",
                "Green", "Black")));
        item.put("ProductCategory", new AttributeValue().withS("Bicycle"));

        itemRequest = new PutItemRequest().withTableName(tableName).withItem(
                item);
        client.putItem(itemRequest);
        item.clear();

        item.put("Id", new AttributeValue().withN("204"));
        item.put("Title", new AttributeValue().withS("18-Bike-204"));
        item.put("Description", new AttributeValue().withS("204 Description"));
        item.put("BicycleType", new AttributeValue().withS("Mountain"));
        item.put("Brand", new AttributeValue().withS("Brand-Company B"));
        item.put("Price", new AttributeValue().withN("400"));
        item.put("Gender", new AttributeValue().withS("W"));
        item.put("Color", new AttributeValue().withSS(Arrays.asList("Red")));
        item.put("ProductCategory", new AttributeValue().withS("Bicycle"));

        itemRequest = new PutItemRequest().withTableName(tableName).withItem(
                item);
        client.putItem(itemRequest);
        item.clear();

        item.put("Id", new AttributeValue().withN("205"));
        item.put("Title", new AttributeValue().withS("20-Bike-205"));
        item.put("Description", new AttributeValue().withS("205 Description"));
        item.put("BicycleType", new AttributeValue().withS("Hybrid"));
        item.put("Brand", new AttributeValue().withS("Brand-Company C"));
        item.put("Price", new AttributeValue().withN("500"));
        item.put("Gender", new AttributeValue().withS("B")); // Boy's
        item.put("Color",
                new AttributeValue().withSS(Arrays.asList("Red", "Black")));
        item.put("ProductCategory", new AttributeValue().withS("Bicycle"));

        itemRequest = new PutItemRequest().withTableName(tableName).withItem(
                item);
        client.putItem(itemRequest);
        listItems();////muestra los datos agregados
        logMessage("Datos creados correctamente");
    }

    public void listItems() {
        ScanRequest scanRequest = new ScanRequest().withTableName(tableName);
        String items="";
        ScanResult result = client.scan(scanRequest);
        for (Map<String, AttributeValue> item : result.getItems()) {
            items = items + printItem(item)+"\n";
        }
        logMessagePrincipal(items);
    }

    private String printItem(Map<String, AttributeValue> attributeList) {
        String itemString = new String();
        for (Map.Entry<String, AttributeValue> item : attributeList.entrySet()) {
            if (!itemString.equals("")) {
                itemString += ", ";
            }
            String attributeName = item.getKey();
            AttributeValue value = item.getValue();
            itemString += attributeName
                    + ""
                    + (value.getS() == null ? "" : "=\"" + value.getS() + "\"")
                    + (value.getN() == null ? "" : "=\"" + value.getN() + "\"")
                    + (value.getB() == null ? "" : "=\"" + value.getB() + "\"")
                    + (value.getSS() == null ? "" : "=\"" + value.getSS()
                    + "\"")
                    + (value.getNS() == null ? "" : "=\"" + value.getNS()
                    + "\"")
                    + (value.getBS() == null ? "" : "=\"" + value.getBS()
                    + "\" \n");
        }
        return itemString;
    }

    public String getTableStatus() {
        TableDescription tableDescription = client.describeTable(
                new DescribeTableRequest().withTableName(tableName)).getTable();
        return tableDescription.getTableStatus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDato;
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnAgregarDato;
    private javax.swing.JButton btnCrearTabla;
    private javax.swing.JButton btnDescribirTabla;
    private javax.swing.JButton btnEliminarDato;
    private javax.swing.JButton btnEliminarTabla;
    private javax.swing.JButton btnListarDatos;
    private javax.swing.JButton btnListarTablas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextArea txtArea2;
    // End of variables declaration//GEN-END:variables
}
