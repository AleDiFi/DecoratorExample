package logic;

abstract class Responsible implements Employee{

    protected Employee employeeResponsible;

    protected Responsible(Employee employee){
        employeeResponsible = employee;
    }
    public String getName() {
        return employeeResponsible.getName();
    }
    public String getOffice() {
        return employeeResponsible.getOffice();
    }
    public void whoAmI() {
        employeeResponsible.whoAmI();
    }

}
