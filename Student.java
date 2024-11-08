public class Student extends Person{
    private int year;
    private int fee;

    public Student(String name, String address, int year){
        super(name,address);
        this.year = year;
        this.fee = 2700 + (year*100);
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public static Student createStudentInstance(String name, String address, int year){
        return new Student(name,address,year);
    }

}
