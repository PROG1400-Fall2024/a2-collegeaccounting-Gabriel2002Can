public class Student extends Person{
    private int year;
    private double fee;

    //Is a class property
    private static double incomingValue = 0;

    public Student(String name, String address, int year){
        super(name,address);
        this.year = year;
        this.fee = 2900 + (year*100);
        Student.incomingValue += calculatingIncValue(fee);
    }

    private double calculatingIncValue(double feeValue){
        return feeValue/2;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    //Incoming is a property of the class itself. So it is a static method. Same for the getter method
    public static double getIncomingValue(){
        return incomingValue;
    }

    ////Auto instantiating method
    public static Student createStudentInstance(String name, String address, int year){
        return new Student(name,address,year);
    }

    @Override
    public String toString(int index) {
        return super.toString(index) + ", year = " + year + ", fee = $" + String.format("%.2f",fee);
    }
}