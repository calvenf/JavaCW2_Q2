import java.util.Scanner;
public class StudentAcademicTracker {
    public static void main(String[] args) {
        // Create input scanner
        Scanner input = new Scanner(System.in);
        
        // 
        Student s1 = new Student(); 
        
        // Request user enter student's details
        System.out.print("Your studentID: ");
        s1.studentID = input.nextLine();
        System.out.print("Your name: ");
        s1.name = input.nextLine();
        
        // Request user to enter GPA values
        for (int i=0;i<6;i++){
            System.out.print("GPA values of subject "+(i+1)+":");
            s1.gpa[i]=input.nextDouble();
        }
        

        
        


         System.out.println("----------------------------------------");
         System.out.println("Academic Performance Report");
         System.out.println("----------------------------------------");
         System.out.println("Student's details: ");
         System.out.println("StudentID: "+s1.studentID);
         System.out.println("Name: "+s1.name);
         System.out.println("average GPA: "+s1.a_gpa);
         System.out.println("Degree classification: "+s1.degree+" class");
         System.out.println("----------------------------------------");
    }
}
