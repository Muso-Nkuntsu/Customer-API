package za.ac.cput.util;

import za.ac.cput.Domain.Customer;
import za.ac.cput.factory.CustomerFactory;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("Enter Customer ID: ");
        String firstName = JOptionPane.showInputDialog("Enter first Name: ");
        String lastName = JOptionPane.showInputDialog("Enter Last Name: ");
        String email = JOptionPane.showInputDialog("Enter Email Address: ");

        Customer newCustomer = CustomerFactory.createCustomer(id,firstName,lastName,email);

        if(newCustomer != null){
            JOptionPane.showMessageDialog(null, "Customer created successfuly!\n" + newCustomer.toString(),"SUCCESS",JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "FAILED TO CREATE CUSTOMER","ERROR!",JOptionPane.ERROR_MESSAGE);
        }
    }
}
