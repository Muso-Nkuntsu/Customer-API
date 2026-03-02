package za.ac.cput.util;

public class ValidationUtil {
    public static void requiredNotNullorEmpty(String value, String fieldName) {
      if(value == null || value.trim().isEmpty()){
          throw new IllegalArgumentException(fieldName+ "is required");
      }
    }
    public  static void requiredNotNegative(int value, String fieldName){
        if(value < 0){
            throw new IllegalArgumentException(fieldName + "Should not be negative");
        }
    }
}
