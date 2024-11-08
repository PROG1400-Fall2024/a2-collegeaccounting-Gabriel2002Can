public class Staff extends Person{
    private int yearsOfService;
    private int salary;

    public Staff(String name, String address, int yearsOfService) {
        super(name, address);
        this.yearsOfService = yearsOfService;
        this.salary = 50000 + (yearsOfService*500);
    }

    public int getYearsOfService(){
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService){
        this.yearsOfService = yearsOfService;
    }

    public static Staff createStaffInstance(String name, String address, int yearsOfService){
        return new Staff(name,address,yearsOfService);
    }

    public int getSalary(){
        return salary;
    }

}
