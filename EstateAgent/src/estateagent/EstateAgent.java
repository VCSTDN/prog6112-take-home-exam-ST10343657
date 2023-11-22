/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estateagent;

/**
 *
 * @author 27842
 */
public class EstateAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Question one 
} 
abstract class BaseEstateAgent extends EstateAgent { 
private final String agentName; 
private final double propertyPrice; 
public BaseEstateAgent(String 
agentName, double propertyPrice) { 
this.agentName = agentName; 
this.propertyPrice = propertyPrice; 
} 
public String getAgentName() { 
return agentName; 
} 
public double getPropertyPrice() {
 return propertyPrice; 
} 
public double getAgentCommission() { 
return 0.20 * propertyPrice; 
} 
} 
class EstateAgentSales extends 
BaseEstateAgent { 
public EstateAgentSales(String 
agentName, double propertySaleAmount) { 
super(agentName, 
propertySaleAmount); 
} 
public void printPropertyReport() { 
System.out.println("Estate AgentName: " + getAgentName()); 
System.out.println("Property Sale Price: $" + getPropertyPrice()); 
System.out.println("Estate Agent Commission: $" + getAgentCommission()); 
} 
}
public class RunApplication { 
public static void main(String[] args) 
{ 
EstateAgentSales estateAgent;
    estateAgent = newEstateAgentSales 
                ("John Doe", 250000.0);
estateAgent.printPropertyReport(); 

    } 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody;

        private static EstateAgentSales newEstateAgentSales(String johnDoe, double d) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
           
        }
} 
    

