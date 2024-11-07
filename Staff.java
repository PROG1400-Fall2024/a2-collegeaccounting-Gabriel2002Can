public class Staff extends Person{
    private int year;

    public Staff(String name, String address, int year) {
        super(name, address);
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public static Staff createStaffInstance(String name, String address, int year){
        return new Staff(name,address,year);
    }
}
