public class Student {
    //variable
    String studentID;
    String name;
    double[]gpa = new double[6];
    double a_gpa;
    String degree;
    
    //method
    void averageGPA(){
        double sum=0;
        for (int i=0;i<6;i++){
            sum=sum+gpa[i];
        }
        a_gpa = sum/6;
    }
    
    void determineDegree(){
           if(a_gpa<0 || a_gpa>4){
            IO.println("Invalid Average GPA");
            return;
        }
 
            if (a_gpa<2.5){
                degree = "Third"; 
            }
            else if (a_gpa>2.5 && a_gpa<3.49) {
                degree = "Second";
            }
            else{
                degree = "First";
            }        if(a_gpa<0 || a_gpa>4){
            IO.println("Invalid Average GPA");
            return;
        }
 
            if (a_gpa<2.5){
                degree = "Third"; 
            }
            else if (a_gpa>2.5 && a_gpa<3.49) {
                degree = "Second";
            }
            else{
                degree = "First";
            }
    }
}
