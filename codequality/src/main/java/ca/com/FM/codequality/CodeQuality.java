package ca.com.FM.codequality;

import com.sun.istack.internal.logging.Logger;

import java.util.logging.Level;

/* *
 * Used to learn quality
 * #author: Moytri
 */
public class CodeQuality {
    /* *
     * Used for Logger
     */
    private static final Logger LOGGER = Logger.getLogger(CodeQuality.class.getName());
    /* *
     * This is main method
     * #author: Moytri
     */
    public static void main(String[] args) {
        Integer b = 0;

        // System.out.println("Commented Code");
        if (b >= 0 && b <= 5 && b >= 3 && b == 4) {
             LOGGER.log(Level.FINE, "b is equal to 4");
        }

        try {
            String myVariable = "";

            if (args.length > 0) {
                myVariable = args[0];
            }

            if (myVariable.equals("sonarQube")) {
                LOGGER.log(Level.FINE, "I found " + myVariable);
            } else if (!myVariable.equals("")) {
                LOGGER.log(Level.FINE, "I found other value" + myVariable);
            } else {
                LOGGER.log(Level.FINE, "I found no value");
            }
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Something Wrong" + ex.getStackTrace());
        }

    }
}
