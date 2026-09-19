public class StudentAcademicTracker {
    // 1. variable
        private String studentID;
        private String name;
        private double[]gpa = new double[6];
        private int credits = 90;

    // Constructor
        public StudentAcademicTracker(String studentID, String name, double[] gpa,int credits) {
            this.studentID = studentID;
            this.name = name;
            this.gpa=gpa;
            this.credits=credits;
        }
   
    // 2. setter
    
        // Set studentID
            public void setID(String studentID) {
                this.studentID = studentID;
            }
        // Set student name
            public void setName(String name) {
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
        // Set credits value
            public void setCredits(int credits) {
                this.credits = credits;
            }
        
    // 3. getter
            
        // Get student id
            public String getID() {
                return studentID;
            }

        // Get student name
            public String getName(){
                    return name;
            }

        // Get gpa
            public double getGpa(int i) {
                return gpa[i];
            }

        // Get credits
            public int getCredits() {
                return credits;
            }
            
    // 4. method
            
        // Calculate average GPA for 6 semesters
            public double averageGPA(){
                double sum=0;
                for (int i=0;i<6;i++){
                    sum=sum+(gpa[i]*(credits/6));
                }
                return sum/credits;
            }

        // Determine degree classification based on average GPA
            public String determineDegree(){
                    if (averageGPA()<2.5){
                        return "Third Class"; 
                    }
                    else if (averageGPA()>2.5 && averageGPA()<3.49) {
                        return "Second Class";
                    }
                    else{
                        return "First Class";
                    }
            }

}
