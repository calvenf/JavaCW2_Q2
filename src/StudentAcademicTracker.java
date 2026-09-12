import java.util.Scanner;
public class StudentAcademicTracker {
    public static void main(String[] args) {
        // Create input scanner
        Scanner input = new Scanner(System.in);
        
        // Create an object for Student class
        Student s1 = new Student(); 
        
        // Request user enter student info
        System.out.print("Your studentID: ");
        String studentID = input.nextLine();
        System.out.print("Your name: ");
        String name = input.nextLine();
        
        // Use setter to set student information
        s1.setStudentInfo(studentID, name);
        
        
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
        


        
        // Use method to calculate averageGPA
        s1.averageGPA();
        
        // Use method to determine classification of degree based on average GPA
        s1.determineDegree();
        
         System.out.println("----------------------------------------");
         System.out.println("Academic Performance Report");
         System.out.println("----------------------------------------");
         System.out.println("Student's details: ");
         System.out.println("StudentID: "+s1.getID());
         System.out.println("Name: "+s1.getName());
         System.out.printf("average GPA: %.1f %n",s1.getAverageGPA());
         System.out.println("Degree classification: "+s1.getDegree());
         System.out.println("----------------------------------------");
    }
}
