import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        double[]defaultGPA = {0,0,0,0,0,0};
        StudentAcademicTracker s1 = new StudentAcademicTracker("None","None",defaultGPA,90); 
        
        int option;
        boolean confirm = false;
        
        // Prompt to confirm info
        do{
            System.out.println("----------------------------------------------");
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
            input.nextLine();    // To solve prompt skipping problem
            System.out.print("\n");
            
            switch(option){
                case 1:
                    confirm = true;
                    break;
                    
                case 2:
                    // Request user enter
                        System.out.print("Your studentID: ");
                        String studentID = input.nextLine();
                        s1.setID(studentID);
                            
                        System.out.print("Your name: ");
                        String name = input.nextLine();
                        s1.setName(name);
       
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
  
                        System.out.print("Your total credits: ");
                        int credits = input.nextInt();
                        s1.setCredits(credits);
                        System.out.print("\n");
                    break;
                    
                default:
                    System.out.printf("%nERROR:Invalid option%n");
                    System.out.print("Please enter option Again:");
                    
            }
        }while(!confirm);
        
        // Print academic performance report
         System.out.println("----------------------------------------");
         System.out.println("Academic Performance Report");
         System.out.println("----------------------------------------");
         System.out.println("StudentID: "+s1.getID());
         System.out.println("Name: "+s1.getName());
         System.out.printf("average GPA: %.1f %n",s1.averageGPA());
         System.out.println("Degree classi fication: "+s1.determineDegree());
         System.out.println("----------------------------------------");
    }
}
