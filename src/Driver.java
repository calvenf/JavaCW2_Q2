import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        // Create input scanner
        Scanner input = new Scanner(System.in);
        
        
        
        // Create an object for Student class
        double[]defaultGPA = {0,0,0,0,0,0};
        StudentAcademicTracker s1 = new StudentAcademicTracker("None","None",defaultGPA,90); 
        
        // Create option
        int option;
        boolean confirm = false;
        
        // Prompt to confirm info
        while(!confirm){
            System.out.println("StudentID: "+s1.getID());
            System.out.println("Student name: "+s1.getName());
            System.out.println("GPA:");
                for(int i=0 ; i<6 ; i++)
                System.out.printf("\tSemester "+(i+1)+": %.1f\n",s1.getGpa(i));
            System.out.println("Total Credits: "+s1.getCredits());
            System.out.println("----------------------------------------------");
            System.out.println("Please confirm your information");
            System.out.println("1. Yes, Please generate my academic performance report");
            System.out.println("2. No, I want to edit it");
            System.out.print("Your option: ");
            option = input.nextInt();
            
            switch(option){
                case 1:
                    confirm = true;
                    break;
                    
                case 2:
                    confirm = false;
                    
                    // Request user enter studentID
                    System.out.print("Your studentID: ");
                    String studentID = input.nextLine();

                    // Request user enter student name
                    System.out.print("Your name: ");
                    String name = input.nextLine();
                    
                    // Use setter to set studentID
                    s1.setID(studentID);
                    // Use setter to set student name
                    s1.setName(name);

                    // Request user to enter GPA values
                    double[]gpa = new double[6];
                    for (int i=0; i<gpa.length;i++){
                            System.out.print("GPA for semester "+(i+1)+":");
                            gpa[i]=input.nextDouble();   
                    // Use setter verify and set student's GPA for 6 semesters       
                            while(!s1.setGPA(gpa,i)){
                                System.out.printf("%nERROR:Invalid GPA value detected%n");
                                System.out.print("Please enter GPA value for semester "+(i+1)+" Again:");
                                gpa[i]=input.nextDouble();
                            }
                    }
                    break;
                    
                default:
                    System.out.printf("%nERROR:Invalid option%n");
                    System.out.print("Please enter option Again:");
                    
            }
        }
         System.out.println("----------------------------------------");
         System.out.println("Academic Performance Report");
         System.out.println("----------------------------------------");
         System.out.println("Student's details: ");
         System.out.println("StudentID: "+s1.getID());
         System.out.println("Name: "+s1.getName());
         System.out.printf("average GPA: %.1f %n",s1.averageGPA());
         System.out.println("Degree classification: "+s1.determineDegree());
         System.out.println("----------------------------------------");
    }
}
