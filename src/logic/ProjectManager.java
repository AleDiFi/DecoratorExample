package logic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjectManager extends Responsible {

    Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private String project;

    public ProjectManager( Employee empl, String proj ) {
        super(empl);
        project = proj;
    }
    public void whoAmI() {
        super.whoAmI();
        logger.log(Level.SEVERE, "I am the Manager of the Project:" + project);
    }
}

