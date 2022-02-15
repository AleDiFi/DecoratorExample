package logic;

abstract class Responsible implements Employee{

    protected Employee EmployeeResponsible;

    protected Responsible(Employee employee){
        EmployeeResponsible = employee;
    }
    public String getName() {
        return EmployeeResponsible.getName();
    }
    public String getOffice() {
        return EmployeeResponsible.getOffice();
    }
    public void whoAmI() {
        EmployeeResponsible.whoAmI();
    }

}
