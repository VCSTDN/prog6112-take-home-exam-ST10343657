/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propertysales;

/**
 *
 * @author 27842
 */
public class PropertySales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Question 1 
        int[][] sales = {
            {800000, 1500000, 2000000},
            {700000, 1200000, 1600000}
        };

        String[] agents = {"Joe Bloggs", "Jane Doe"};

        // Calculate total sales and commission for each agent
        int[] totalSales = new int[agents.length];
        double[] commission = new double[agents.length];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                totalSales[i] += sales[i][j];
            }
            commission[i] = totalSales[i] * 0.02; // 2% commission
        }

        // Print total sales and commission for each agent
        System.out.println("Total property sales and commission earned:");
        for (int i = 0; i < agents.length; i++) {
            System.out.println(agents[i] + ":");
            System.out.println("Total sales: R " + totalSales[i]);
            System.out.println("Commission earned: R " + commission[i]);
            System.out.println();
        }

        // Determine top-selling estate agent
        int topAgentIndex = 0;
        int maxSales = totalSales[0];
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                topAgentIndex = i;
            }
        }
        System.out.println("Top-selling estate agent: " + agents[topAgentIndex]);
    }
}
   
    
