public class Student extends Person{
    private int year;
    private double fee;
    private static double incomingValue = 0;

    public Student(String name, String address, int year){
        super(name,address);
        this.year = year;
        this.fee = 2900 + (year*100);
        Student.incomingValue += fee/2;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public static double getIncomingValue(){
        return incomingValue;
    }

    public static Student createStudentInstance(String name, String address, int year){
        return new Student(name,address,year);
    }

    @Override
    public String toString(int index) {
        return super.toString(index) + ", year = " + year + ", fee = $" + String.format("%.2f",fee);
    }
}