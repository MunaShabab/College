import java.util.ArrayList;
public class GraduateStudent extends Student{
    public GraduateStudent(String argFirstName, String argLastName, int argStudentNumber, String argResidencyCode, ArrayList<Course> argCourseList){
        super(argFirstName,argLastName,argStudentNumber,argResidencyCode,argCourseList);
    }
    public GraduateStudent(String argFirstName,String argLastName,int argStudentNumber,ArrayList<Course> argCourseList){
        super(argFirstName,argLastName,argStudentNumber,argCourseList);
    }

    public double CalculateTuition(){
        double tuition;
        tuition=2*super.CalculateTuition();
        return tuition;
    }
    

}