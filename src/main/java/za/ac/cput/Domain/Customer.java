package za.ac.cput.Domain;

public class Customer {
    private String customerID;
    private String firstName;
    private String lastName;
    private String emailAddress;


    public Customer(Builder builder) {
        this.customerID = builder.customerID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.emailAddress = builder.emailAddress;
    }
    @Override
    public String toString() {
        return "customerID='" + customerID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\''
                ;
    }
    public static class Builder {
        private String customerID;
        private String firstName;
        private String lastName;
        private String emailAddress;


        public Builder createCustomer(String customerID, String emailAddress) {
            this.customerID = customerID;
            this.emailAddress = emailAddress;

            return this;
        }
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Customer build() {
            return new Customer(this);
        }
    }
}
