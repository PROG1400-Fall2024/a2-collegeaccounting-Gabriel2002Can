import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        //Declaring initial variables
        boolean initContinueConfirmation = true;
        int initialChoice;
        int studentCounter = 0;
        int staffCounter = 0;
        String stringOutput = "";

        String studentName;
        String studentAddress;
        int studentYearInt;

        String staffName;
        String staffAddress;
        int staffServiceInt = 0;

        //Declaring object arrays for students and staff
        Student[] studentsList = new Student[100];
        Staff[] staffList = new Staff[100];

        //Options for JOption
        Object[] initialOptions = {"Student","Staff","Finish"};

        //Will loop until finish is clicked
        do {
           initialChoice = JOptionPane.showOptionDialog(null,"Select Student or Staff.","Accounting App",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,initialOptions,initialOptions[0]);

           //If Finished
           if(initialChoice == 2){
               initContinueConfirmation = false;
               continue;
           }

           //If Student
            if(initialChoice == 0){
                boolean studentNameConfirmation = true;
                boolean studentAddressConfirmation = true;
                boolean studentYearConfirmation = true;

                //Validation for Student Name
                do {
                    studentName = JOptionPane.showInputDialog("Enter Student Name:");

                    if(studentName == ""){
                        JOptionPane.showMessageDialog(null,"Please enter valid information.");
                        continue;
                    }
                    studentNameConfirmation = false;

                }while(studentNameConfirmation);

                //Validation for Student Address
                do {
                    studentAddress = JOptionPane.showInputDialog("Enter Student Address:");
                    if(studentAddress == ""){
                        JOptionPane.showMessageDialog(null,"Please enter valid information.");
                        continue;
                    }
                    studentAddressConfirmation = false;

                }while(studentAddressConfirmation);

                //Validation for Student Year
                do{
                    String studentYearString = JOptionPane.showInputDialog("Enter Student year(1-4):");

                    //If not a number
                    for(int letter = 0; letter < studentYearString.length(); letter++ ){
                        if(!Character.isDigit(studentYearString.charAt(letter))){
                            JOptionPane.showMessageDialog(null,"Please enter a number.");
                            continue;
                        }
                    }
                    studentYearInt = Integer.parseInt(studentYearString);

                    if(studentYearInt > 4 || studentYearInt < 1){
                        JOptionPane.showMessageDialog(null,"Out of range. The years should be between 1 and 4.");
                        continue;
                    }

                    studentYearConfirmation = false;
                }while(studentYearConfirmation);

                //Create instance of Student
                studentsList[studentCounter] = Student.createStudentInstance(studentName,studentAddress,studentYearInt);
                studentCounter++;
            }

            //If Staff
            if(initialChoice == 1){
                boolean StaffNameConfirmation = true;
                boolean StaffAddressConfirmation = true;
                boolean StaffServiceConfirmation = true;

                //Validation for Staff Name
                do {
                    staffName = JOptionPane.showInputDialog("Enter Staff Name:");

                    if(staffName == ""){
                        JOptionPane.showMessageDialog(null,"Please enter valid information.");
                        continue;
                    }
                    StaffNameConfirmation = false;

                }while(StaffNameConfirmation);

                //Validation for Staff Address
                do {
                    staffAddress = JOptionPane.showInputDialog("Enter Staff Address:");
                    if(staffAddress == ""){
                        JOptionPane.showMessageDialog(null,"Please enter valid information.");
                        continue;
                    }
                    StaffAddressConfirmation = false;

                }while(StaffAddressConfirmation);

               
                do {
                    String staffserviceString = JOptionPane.showInputDialog("Enter Staff years of service:");

                    try {
                        
                        staffServiceInt = Integer.parseInt(staffserviceString);

                        if (staffServiceInt < 1 || staffServiceInt > 30) {
                            JOptionPane.showMessageDialog(null, "Out of range. The Service years should be between 1 and 30.");
                            continue;
                        }

               
                        StaffServiceConfirmation = false;

                    } catch (NumberFormatException e) {
                     
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }

                } while (StaffServiceConfirmation);

                //Create instance of Student
                staffList[staffCounter] = Staff.createStaffInstance(staffName,staffAddress,staffServiceInt);
                staffCounter++;
            }

        //Instantiating process ended
        }while(initContinueConfirmation);

        //Starting report:

        //Students
        stringOutput += "Students:[Total:" + studentCounter + "]\n";

        //Using toString() method to write on the output variable
        for(int index = 0; index < studentCounter; index++){
            stringOutput += studentsList[index].toString(index+1) + "\n";
        }

        //Staff
        stringOutput += "\n" + "Staff:[Total:" + staffCounter + "]\n";

        //Using toString() method to write on the output variable
        for(int index = 0; index < staffCounter; index++){
            stringOutput += staffList[index].toString(index+1) + "\n";
        }

        //Results report
        stringOutput += "\n\nResults:\n";

        //Outgoing
        stringOutput += "Outgoing:$" + String.format("%.2f",Staff.getOutgoingValue()) + "\n";

        //Incoming
        stringOutput += "Incoming:$" + String.format("%.2f",Student.getIncomingValue()) + "\n";

        //Total
        stringOutput += "Total:$" + String.format("%.2f",Student.getIncomingValue() - Staff.getOutgoingValue()) + "\n";

        //Printing
        JOptionPane.showMessageDialog(null,stringOutput);

        //End of program
        }
    }

