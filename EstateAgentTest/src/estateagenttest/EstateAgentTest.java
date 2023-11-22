/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estateagenttest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstateAgentTest {

   
    public static void main(String[] args) {
        // Question one 
    @Test
    public void calculateTotalSales_ReturnsTotalSales() {
        EstateAgent agent = new EstateAgent();
        double[] sales = {800000, 1500000, 2000000};
        double expectedTotalSales = 4300000;
        assertEquals(expectedTotalSales, agent.estateAgentSales(sales));
    }

    @Test
    public void calculateTotalCommission_ReturnsCommission() {
        EstateAgent agent = new EstateAgent();
        double propertySales = 500000;
        double expectedCommission = 10000;
        assertEquals(expectedCommission, agent.estateAgentCommission(propertySales));
    }

    @Test
    public void topAgent_ReturnsTopPosition() {
        EstateAgent agent = new EstateAgent();
        double[][] totalSales = {
                {800000, 1500000, 2000000},
                {700000, 1200000, 1600000}
        };
        int expectedTopAgentIndex = 0;
        assertEquals(expectedTopAgentIndex, agent.topEstateAgent(totalSales));
    }
}    
    }
    

