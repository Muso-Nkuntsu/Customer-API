package za.ac.cput.factory;

import za.ac.cput.Domain.Customer;
import za.ac.cput.util.EmailValidator;
import za.ac.cput.util.ValidationUtil;


public class CustomerFactory {
    public static Customer createCustomer(String customerID,String firstName, String lastName, String emailAddress){
     if(!EmailValidator.isValidEmail(emailAddress)){
         System.out.println("Log: Invalid email format provided.");
         return null;
     }

     try{
         ValidationUtil.requiredNotNullorEmpty(customerID, "CustomerID");
         ValidationUtil.requiredNotNullorEmpty(emailAddress, "EmailAddress");
         EmailValidator.isValidEmail(emailAddress);
     } catch (IllegalArgumentException e){
         System.out.println("Log: "+ e.getMessage());
         return null;
     }
     return new Customer.Builder()
             .createCustomer(customerID,emailAddress)
             .setFirstName(firstName)
             .setLastName(lastName)
             .build();
    }
}

