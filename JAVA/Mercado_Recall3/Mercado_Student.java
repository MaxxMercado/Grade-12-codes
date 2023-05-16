package Mercado_Recall3;


public class Mercado_Student {
    
          
        private String studentName;
        private double studentGrade;

        //setter


        public void setStudents(String studentName, double studentGrade){
            this.studentName = studentName;
            this.studentGrade = studentGrade;
        }

        public void setstudentName(String studentName){
            this.studentName = studentName;
        }

        public void setstudentGrade(double studentGrade){
            this.studentGrade = studentGrade;
        }

        //getter 
        public String getstudentName(){
            return this.studentName;
        }

        public double getstudentGrade(){
            return this.studentGrade;
        }
}

