import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        boolean initContinueConfirmation = true;
        int initialChoice;
        int personCounter;

        Student[] studentsList = new Student[100];
        Staff[] staffList = new Staff[100];

        Object[] initialOptions = {"Student","Staff","Finish"};

        do {
           initialChoice = JOptionPane.showOptionDialog(null,"Select Student or Staff.","Accounting App",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,initialOptions,initialOptions[0]);
           if(initialChoice == 2){
               initContinueConfirmation = false;
           }

        }while(initContinueConfirmation);

        }
    }

