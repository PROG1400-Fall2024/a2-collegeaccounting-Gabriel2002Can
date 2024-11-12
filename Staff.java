public class Staff extends Person{
    private int yearsOfService;
    private double salary;

    //Is a class property
    private static double outgoingValue = 0;

    public Staff(String name, String address, int yearsOfService) {
        super(name, address);
        this.yearsOfService = yearsOfService;
        this.salary = 50000 + (yearsOfService*500);
        Staff.outgoingValue += salary/26;
    }

    public int getYearsOfService(){
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService){
        this.yearsOfService = yearsOfService;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Auto instantiating method
    public static Staff createStaffInstance(String name, String address, int yearsOfService){
        return new Staff(name,address,yearsOfService);
    }

    public double getSalary(){
        return salary;
    }

    //Outgoing is a property of the class itself. So it is a static method. Same for the getter method
    public static double getOutgoingValue(){
        return outgoingValue;
    }

    @Override
    public String toString(int index) {
        return super.toString(index) + ", years = " + yearsOfService + ", pay = $" + String.format("%.2f",salary);
    }
}