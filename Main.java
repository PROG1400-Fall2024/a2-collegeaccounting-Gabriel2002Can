import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        boolean initContinueConfirmation = true;
        int initialChoice;
        int studentCounter = 0;
        int staffCounter = 0;

        String studentName;
        String studentAddress;
        int studentYearInt;

        String staffName;
        String staffAddress;
        int studentYearInt;
;

        Student[] studentsList = new Student[100];
        Staff[] staffList = new Staff[100];

        Object[] initialOptions = {"Student","Staff","Finish"};

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
                studentsList[studentCounter].createStudentInstance(studentName,studentAddress,studentYearInt);
                studentCounter++;
            }

            //If Staff
            if(initialChoice == 1){
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
                studentsList[studentCounter].createStudentInstance(studentName,studentAddress,studentYearInt);
                studentCounter++;
            }

        }while(initContinueConfirmation);

        }
    }

