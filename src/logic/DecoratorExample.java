package logic;

public class DecoratorExample {

    public static void main(String arg[]) {
        Employee thisWillBeBoss = new Engineer( " John Doe",
                " Programming Department" );
        System.out.println( "Who are you?");
        thisWillBeBoss.whoAmI();

        thisWillBeBoss = new AdministrativeManager( thisWillBeBoss );
        System.out.println( "Who are you now?");
        thisWillBeBoss.whoAmI();

        thisWillBeBoss = new ProjectManager( thisWillBeBoss, "Project ISPW" );
        System.out.println( "Who are you now?");
        thisWillBeBoss.whoAmI();

        thisWillBeBoss = new ProjectManager( thisWillBeBoss,
                "Project DB" );
        System.out.println( "Who are you now?");
        thisWillBeBoss.whoAmI();
    }

}
