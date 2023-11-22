/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esateagentcommissionapplicationtest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author 27842
 */
public class EsateAgentCommissionApplicationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Question 2 

    @Test
    void calculateCommission_CalculatedSuccessfully() {
        EstateAgent estateAgent = new EstateAgent();
        double propertyPrice = 250000; // Example property price
        double commissionPercentage = 5; // Example commission percentage

        double expectedCommission = 12500; // Expected commission value for given inputs
        double actualCommission = estateAgent.calculateCommission(propertyPrice, commissionPercentage);

        assertEquals(expectedCommission, actualCommission, 0.01); // Using delta for double comparison
    }

    @Test
    void calculateCommission_CalculatedUnsuccessfully() {
        EstateAgent estateAgent = new EstateAgent();
        double propertyPrice = 250000; // Example property price
        double commissionPercentage = 5; // Example commission percentage

        double expectedCommission = 15000; // Incorrect expected commission value
        double actualCommission = estateAgent.calculateCommission(propertyPrice, commissionPercentage);

        assertNotEquals(expectedCommission, actualCommission, 0.01); // Using delta for double comparison
    }

    @Test
    void validateData_ValidationTest() {
        EstateAgent estateAgent = new EstateAgent();
        // Example valid data
        String validLocation = "Cape Town";
        String validName = "John Doe";
        double validPropertyPrice = 250000;
        double validCommissionPercentage = 5;

        // Testing valid data, should return true
        assertTrue(estateAgent.validateData(validLocation, validName, validPropertyPrice, validCommissionPercentage));

        // Testing invalid data (e.g., empty name), should return false
        assertFalse(estateAgent.validateData(validLocation, "", validPropertyPrice, validCommissionPercentage));
    }
}
    }
    

