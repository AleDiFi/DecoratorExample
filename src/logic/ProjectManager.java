package logic;

public class ProjectManager extends Responsible {

    private String project;

    public ProjectManager( Employee empl, String proj ) {
        super(empl);
        project = proj;
    }
    public void whoAmI() {
        super.whoAmI();
        System.out.println("I am the Manager of the Project:" + project);
    }
}

