package vip;

//import jdk.nashorn.internal.parser.Scanner;
import java.util.Arrays;

import java.util.Scanner;

public class Vip {
    //Main Class
//public class Main 
//{
 //Password Validation Function
   
 public static boolean isValidPassword(String password) {
     char[] pass = password.toCharArray();
//Converting String given to array
// Taking some Local Variables
  int size = 0;
  int smallAlpha = 0;
  int largeAlpha = 0;
  int symbol = 0;
  int digits = 0;
// Loop for counting conditions
for (int i = 0; i < pass.length ; i++) {
      if(pass[i] != 32) { // Checking for spaces
         size++;
         if (pass[i] >= 97 && pass[i] <= 122) 
// Checking for lowercase alphabets
             smallAlpha++;
         else if (pass[i] >= 65 && pass[i] <= 90) 
// Checking for uppercase alphabets
             largeAlpha++;
         else if (pass[i] >= 48 && pass[i] <= 57) // Checking for digits
             digits++;
         else    
        // Checking for symbols
             symbol++;
            }
        }
// System.out.println(Arrays.toString(pass));
// For Testing
// Validation conditions
if(size > 10) { // Checking for Condition 1
    if (smallAlpha >= 1 && largeAlpha >= 1) {
 // Checking for Condition 2
        if (digits >= 2) { 
// Checking for Condition 3
            return true;
        }
        else if (symbol >= 1) { // Checking for Condition 
            return true;
        }
        else {
            return false;
        }
    } 
else {
        return false;
    }
}
else {
    return false;
}
}
// Main Function
public static void main(String[] args) {
// Taking User Input
    Scanner cin = new Scanner(System.in);
    System.out.println("Enter the password: ");
    String password = cin.nextLine();
// Checking for password validation
    if( isValidPassword(password) ) {
        System.out.println("Password is correct. ");
    }
    else {
    System.out.println("Password is incorrect. ");
    }
} 
}
