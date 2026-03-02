package za.ac.cput.factory;

import za.ac.cput.Domain.Customer;


public class CustomerFactory {
    public static Customer createCustomer(String customerID,String firstName, String lastName, String emailAddress){
     if (customerID == null || emailAddress == null){
         return null;
     }
     return new Customer.Builder().createCustomer(customerID,emailAddress)
             .setFirstName(firstName)
             .setLastName(lastName)
             .build();
    }
}

