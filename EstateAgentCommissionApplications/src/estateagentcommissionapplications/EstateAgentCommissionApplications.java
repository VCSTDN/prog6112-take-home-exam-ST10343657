/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estateagentcommissionapplications;
 import javax.swing.*;
import java.awt.event.*;
import java.io.*;
/**
 *
 * @author 27842
 */
public class EstateAgentCommissionApplications extends JFrame {

String[]EstateAgent = {"Joe Bloggs", "Jane Doe"};
   
     
   
    private final JComboBox<String> locationComboBox;
    private final JTextField agentNameField;
    private final JTextField propertyPriceField;
    private final JTextField commissionPercentageField;
    private final JTextArea reportTextArea;

    public EstateAgentCommissionApplications() {
        setTitle("Estate Agent Commission Report");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // ComboBox for estate agent location
        locationComboBox = new JComboBox<>(new String[]{"Cape Town", "Durban", "Pretoria"});
        locationComboBox.setBounds(20, 20, 150, 25);
        add(locationComboBox);

        // Text fields
        agentNameField = new JTextField();
        agentNameField.setBounds(20, 60, 150, 25);
        add(agentNameField);

        propertyPriceField = new JTextField();
        propertyPriceField.setBounds(20, 100, 150, 25);
        add(propertyPriceField);

        commissionPercentageField = new JTextField();
        commissionPercentageField.setBounds(20, 140, 150, 25);
        add(commissionPercentageField);

        // Text area for report display
        reportTextArea = new JTextArea();
        reportTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(reportTextArea);
        scrollPane.setBounds(200, 20, 160, 220);
        add(scrollPane);

        // Menu bar and items
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        JMenu toolsMenu = new JMenu("Tools");
        JMenuItem processReportMenuItem = new JMenuItem("Process Report");
        processReportMenuItem.addActionListener((ActionEvent e) -> {
            processReport();
        });
        JMenuItem clearMenuItem = new JMenuItem("Clear");
        clearMenuItem.addActionListener((ActionEvent e) -> {
            clearFields();
        });
        JMenuItem saveReportMenuItem = new JMenuItem("Save Report");
        saveReportMenuItem.addActionListener((ActionEvent e) -> {
            saveReportToFile();
        });
        toolsMenu.add(processReportMenuItem);
        toolsMenu.add(clearMenuItem);
        toolsMenu.add(saveReportMenuItem);
        menuBar.add(toolsMenu);
    }

     public void processReport() {
    String location = (String) locationComboBox.getSelectedItem();
    String agentName = agentNameField.getText();
    String propertyPriceStr = propertyPriceField.getText();
    String commissionPercentageStr = commissionPercentageField.getText();

    try {
        double propertyPrice = Double.parseDouble(propertyPriceStr);
        double commissionPercentage = Double.parseDouble(commissionPercentageStr);
        double commissionEarned = (propertyPrice * commissionPercentage) / 100;

       
     String report = 
              " Location:" + location + "\n" +
                "Agent Name: " + agentName + "\n" +
                "Property Price: $" + propertyPrice + "\n" +
                "Commission Percentage: " + commissionPercentage + "%\n" +
                "Commission Earned: $" + commissionEarned;
     
        reportTextArea.setText(report);
    } catch (NumberFormatException e) {
        reportTextArea.setText("Error: Please enter valid numeric values.");
    }
    
    }

    private void clearFields() {
        agentNameField.setText("");
        propertyPriceField.setText("");
        commissionPercentageField.setText("");
        reportTextArea.setText("");
    }

    private void saveReportToFile() {
        String report = reportTextArea.getText();

        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (FileWriter writer = new FileWriter(selectedFile)) {
                writer.write(report);
                JOptionPane.showMessageDialog(null, "Report saved successfully!");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error saving report: " + e.getMessage());
            }
        }
    }
       public static void main(String[] args) {
       
        SwingUtilities.invokeLater(new Runnable() {
           
            public void run() {
                new EstateAgentCommissionApplications () .setVisible (true);
            }
        }); 
       }
}
            
            
    



    
    
   
    