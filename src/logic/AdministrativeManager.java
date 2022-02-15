package logic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AdministrativeManager extends Responsible{
    Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public AdministrativeManager(Employee employee){
        super(employee);
    }

    public void whoAmI(){
        sayIamAdministrative();
        super.whoAmI();
    }

    private void sayIamAdministrative(){
        logger.log(Level.SEVERE,"I'm an Administrative Manager,");
    }

}
