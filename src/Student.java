public class Student {
    // 1. variable
        private String studentID;
        private String name;
        double[]gpa = new double[6];
        private double a_gpa;
        private String degree;
    
    
    // 2. setter
        // Set student information
            public void setStudentInfo(String studentID, String name){
                    this.studentID = studentID;
                    this.name = name;
            }

        // Set GPA value for 6 semesters
            public boolean setGPA(double[]gpa,int index){
                if(gpa[index]>=0 && gpa[index]<=4){
                    this.gpa[index]=gpa[index];
                    return true;
                } 
                else {
                    return false;
                }
            }
        
    // 3. getter
        // Get student id
            public String getID(){
                    return studentID;
            }

        // Get student name
            public String getName(){
                    return name;
            }
            
        // Get average GPA for 6 semesters
            public double getAverageGPA(){
                    return a_gpa;
            }
            
        // Get average GPA for 6 semesters
            public String getDegree(){
                    return degree;
            }


    // 4. method
        // Calculate average GPA for 6 semesters
            public void averageGPA(){
                double sum=0;
                for (int i=0;i<6;i++){
                    sum=sum+gpa[i];
                }
                a_gpa = sum/6;
            }

        // Determine degree classification based on average GPA
            public void determineDegree(){
                    if (a_gpa<2.5){
                        degree = "Third Class"; 
                    }
                    else if (a_gpa>2.5 && a_gpa<3.49) {
                        degree = "Second Class";
                    }
                    else{
                        degree = "First Class";
                    }
            }

}
