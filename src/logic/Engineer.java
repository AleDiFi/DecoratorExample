package logic;

public class Engineer implements Employee {

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
        System.out.println("I am" + getName() + " and i am with" + getOffice() + ".");
    }
}
