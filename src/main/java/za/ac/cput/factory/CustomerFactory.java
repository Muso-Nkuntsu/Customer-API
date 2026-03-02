package za.ac.cput.factory;

import za.ac.cput.Domain.Customer;
import za.ac.cput.util.EmailValidator;
import za.ac.cput.util.ValidationUtil;


public class CustomerFactory {
    public static Customer createCustomer(String customerID,String firstName, String lastName, String emailAddress){
     try{
         ValidationUtil.requiredNotNull0orEmpty(customerID, "CustomerID");
         ValidationUtil.requiredNotNull0orEmpty(emailAddress, "EmailAddress");
         EmailValidator.isValidEmail(emailAddress);
     } catch (IllegalArgumentException e){
         return null;
     }
     return new Customer.Builder()
             .createCustomer(emailAddress, customerID)
             .setFirstName(firstName)
             .setLastName(lastName)
             .build();
    }
}

