package logic;


public class DecoratorExample {

    public static void main(String[] args) {

        String whoAreYou = "Who are you?";
        Employee thisWillBeBoss = new Engineer( " John Doe",
                " Programming Department" );
        System.out.println(whoAreYou);
        thisWillBeBoss.whoAmI();

        thisWillBeBoss = new AdministrativeManager( thisWillBeBoss );
        System.out.println(whoAreYou);
        thisWillBeBoss.whoAmI();

        thisWillBeBoss = new ProjectManager( thisWillBeBoss, "Project ISPW" );
        System.out.println(whoAreYou);
        thisWillBeBoss.whoAmI();

        thisWillBeBoss = new ProjectManager( thisWillBeBoss,
                "Project DB" );
        System.out.println(whoAreYou);
        thisWillBeBoss.whoAmI();
    }

}
