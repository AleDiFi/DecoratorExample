package logic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Engineer implements Employee {

    Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private String name;
    private String office;

    public Engineer(String n, String off){
        name = n;
        office = off;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOffice() {
        return office;
    }

    @Override
    public void whoAmI() {
        logger.log(Level.INFO, "I am" + getName() + " and i am with" + getOffice() + ".");
    }
}
