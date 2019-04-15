/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivesdatatype;
import java.util.Scanner; 
/**
 *
 * @author David Lopez
 */
public class PrimitivesDataType {

    
    public static void main(String[] args) {
                           
    byte recordNumber = 101;
    char code = 'a';
    boolean isUser;
    String newUser;
    String userName;
    int userAge; 
    long creditNumber;
    short monthExpiration;
    short yearExpiration;
    short csvNumber; 
    float monthlySubscription = 17.5f;
    float quaterlySubscription = 35.5f;
    float yearlySubscription = 60.5f;
    double totalCost;
    
    String invalidValues ="Insert valid values ";
    int digitsLength; //Number of digits contained in a string 
    
    Scanner userData = new Scanner(System.in);
    
    System.out.println("Are you a new user: (Answer Yes or No)");
    newUser = userData.nextLine();
    
    boolean flag=false;
    while (flag==false){
        if(newUser.equals("Yes")||newUser.equals("No")){
           flag=true;
        }
        else{
        System.out.println(invalidValues);
        System.out.println("Are you a new user: (Answer Yes or No)");
        newUser = userData.nextLine();
        }
    }
    
    switch (newUser) {
            case "Yes":
                System.out.println("Please answer these questions");
                isUser=true;
                break;
            case "No":
                System.out.println("Redirectioning to LOG-IN page....");
                isUser=false;
                break;
            default:   
                isUser=false;
                break;
        }
        
        if(isUser==true){
        System.out.println("Enter your First and Last Name: ");
        userName = userData.nextLine();
        System.out.println("Enter your age: ");
        userAge = userData.nextInt();
            digitsLength = String.valueOf(userAge).length();
            while(digitsLength>2){
                System.out.println(invalidValues);
                System.out.println("Enter your age: (only 2 digits)");
                userAge = userData.nextInt();
                digitsLength = String.valueOf(userAge).length();
            }
        
        System.out.println("Enter your credit card number: ");
        creditNumber = userData.nextLong();
            digitsLength = String.valueOf(creditNumber).length();
            while(digitsLength!=16){
                System.out.println(invalidValues);
                System.out.println("Enter your credit card number: (16 digits)");
                creditNumber = userData.nextLong();
                digitsLength = String.valueOf(creditNumber).length();
            }
       
        System.out.println("Enter expiration date..");
        System.out.println("Month:");
        monthExpiration = userData.nextShort();
            digitsLength = String.valueOf(monthExpiration).length();
            while(digitsLength!=2&&monthExpiration>12){
                System.out.println(invalidValues);
                System.out.println("Month: (2 digits)");
                monthExpiration = userData.nextByte();
                digitsLength = String.valueOf(monthExpiration).length();
            }
            
        System.out.println("Year:");
        yearExpiration = userData.nextShort();
            digitsLength = String.valueOf(yearExpiration).length();
            while(digitsLength!=4&&monthExpiration>2030){
                System.out.println(invalidValues);
                System.out.println("Year: (4 digits)");
                yearExpiration = userData.nextShort();
                digitsLength = String.valueOf(yearExpiration).length();
            }
       
        System.out.println("Enter CSV: ");
        csvNumber = userData.nextShort();
            digitsLength = String.valueOf(csvNumber).length();
            while(digitsLength!=3){
                System.out.println(invalidValues);
                System.out.println("Enter CSV: (3 digits)");
                csvNumber = userData.nextShort();
                digitsLength = String.valueOf(csvNumber).length();
            }
        
            
        byte option;    
        System.out.println("**********************************************");
        System.out.println("INFORMATION PROCESSING");
        System.out.println("Please pick your plan");
        System.out.println("1. 1 Month Susbcription: $"+monthlySubscription+" +imp");
        System.out.println("2. 3 Months Susbcription: $"+quaterlySubscription+ " +imp");    
        System.out.println("3. 1 year Susbcription: $"+yearlySubscription+ " +imp");    
        option = userData.nextByte();
        
          switch (option) {
            case 1:
                totalCost= monthlySubscription*1.50;
                break;
            case 2:
                totalCost= quaterlySubscription*1.30;
                break;
            case 3:
                totalCost= yearlySubscription*1.10;
                break;
            default:   
                System.out.println("Datos Incorrectos");
                totalCost=0;
                break;
        }
        
    
        System.out.println("**********************************************");
        System.out.println("Your register information:\n");
        System.out.println("Record Number: " + recordNumber+code); 
        System.out.println("Name: " + userName); 
        System.out.println("Age: " + userAge);
        System.out.println("Card Number: " + creditNumber);
        System.out.println("Expiration Date: "+monthExpiration+"/"+yearExpiration);
        System.out.println("CSV: " + csvNumber);
        System.out.println("Total cost: " + totalCost);
       }   
    }
}
