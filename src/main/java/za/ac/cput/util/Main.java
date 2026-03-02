package za.ac.cput.util;

import za.ac.cput.Domain.Customer;
import za.ac.cput.factory.CustomerFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Customer customer = CustomerFactory.createCustomer()
                .setFirstName("Muso")
                .setLastName("tuks").build();

        System.out.print(customer);
    }
}
