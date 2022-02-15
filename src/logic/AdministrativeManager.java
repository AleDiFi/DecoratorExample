package logic;

public class AdministrativeManager extends Responsible{

    public AdministrativeManager(Employee employee){
        super(employee);
    }

    public void whoAmI(){
        sayIamAdministrative();
        super.whoAmI();
    }

    private void sayIamAdministrative(){
        System.out.println("I'm an Administrative Manager,");
    }

}
