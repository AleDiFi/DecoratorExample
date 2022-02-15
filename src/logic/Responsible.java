package logic;

abstract class Responsible implements Employee{

    protected Employee responsible;

    public Responsible(Employee employee){
        responsible = employee;
    }
    public String getName() {
        return responsible.getName();
    }
    public String getOffice() {
        return responsible.getOffice();
    }
    public void whoAmI() {
        responsible.whoAmI();
    }

}
