package logic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DecoratorExample {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        Employee thisWillBeBoss = new Engineer( " John Doe",
                " Programming Department" );
        logger.log(Level.SEVERE, "Who are you?");
        thisWillBeBoss.whoAmI();

        thisWillBeBoss = new AdministrativeManager( thisWillBeBoss );
        logger.log(Level.SEVERE, "Who are you?");
        thisWillBeBoss.whoAmI();

        thisWillBeBoss = new ProjectManager( thisWillBeBoss, "Project ISPW" );
        logger.log(Level.SEVERE, "Who are you now?");
        thisWillBeBoss.whoAmI();

        thisWillBeBoss = new ProjectManager( thisWillBeBoss,
                "Project DB" );
        logger.log(Level.SEVERE, "Who are you now?");
        thisWillBeBoss.whoAmI();
    }

}
