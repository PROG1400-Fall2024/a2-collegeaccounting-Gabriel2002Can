public class Student extends Person{
    private int yearsOfService;

    public Student(String name, String address, int yearsOfService){
        super(name,address);
        this.yearsOfService = yearsOfService;
    }

    public int getYearsOfService(){
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService){
        this.yearsOfService = yearsOfService;
    }

    public static Student createStudentInstance(String name, String address, int yearsOfService){
        return new Student(name,address,yearsOfService);
    }
}
