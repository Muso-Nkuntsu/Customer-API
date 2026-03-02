import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.Domain.Customer;
import za.ac.cput.factory.CustomerFactory;
import za.ac.cput.util.EmailValidator;
import za.ac.cput.util.ValidationUtil;

class CustomerTest {

    @Test
    void testEmailScenarios() {
        assertTrue(EmailValidator.isValidEmail("test@cput.ac.za"), "Should be valid");
        assertFalse(EmailValidator.isValidEmail("bad-email"), "Should be invalid (no @)");
        assertFalse(EmailValidator.isValidEmail("user@.com"), "Should be invalid (no domain)");
    }

    @Test
    void testNameValidation() {
        assertDoesNotThrow(() -> ValidationUtil.requiredNotNullorEmpty("John", "Name"));
        assertThrows(IllegalArgumentException.class, () -> ValidationUtil.requiredNotNullorEmpty("", "Name"));
    }

    @Test
    void testCustomerCreation() {
        Customer c = CustomerFactory.createCustomer("101", "Monkey", "Luffy", "luffy@gear5.com");
        assertNotNull(c);
        assertTrue(c.toString().contains("Luffy"));
    }
}
