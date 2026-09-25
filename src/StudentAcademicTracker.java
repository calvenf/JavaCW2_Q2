public class StudentAcademicTracker {
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
   
    // setter
    
            public void setID(String studentID) {
                this.studentID = studentID;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean setGPA(double[]gpa,int index){
                if(gpa[index]>=0 && gpa[index]<=4){
                    this.gpa[index]=gpa[index];
                    return true;
                } 
                else {
                    return false;
                }
            }

            public void setCredits(int credits) {
                this.credits = credits;
            }
        
    // getter
            

            public String getID() {
                return studentID;
            }


            public String getName(){
                    return name;
            }


            public double getGpa(int i) {
                return gpa[i];
            }


            public int getCredits() {
                return credits;
            }
            
    // method

            public double averageGPA(){
                double sum=0;
                for (int i=0;i<6;i++){
                    sum=sum+gpa[i];
                }
                return sum;
            }

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
