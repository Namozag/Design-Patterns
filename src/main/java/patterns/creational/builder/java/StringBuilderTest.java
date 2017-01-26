package patterns.creational.builder.java;

/**
 *
 * @author Hany
 */
public class StringBuilderTest {
    
    public static void main(String[] args) {
        
        String message = 
            new StringBuilder("Welcome ")   // Welcome
                    .append("to ")          // Welcome to
                    .append("Egypt")        // Welcome to Egypt
                    .delete(0, 11)          // Egypt
                    .insert(0, "bye ")      // bye Egypt
                    .insert(0, "Good ")     // Good bye Egypt
                    .toString();
        
        System.out.println(message);
    }
    
}
