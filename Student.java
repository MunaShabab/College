import java.util.ArrayList;
// class Student 

public class Student{
    //Attributes
    private String firstName;
    private String lastName;
    private int studentNumber;
    private String residencyCode;
    private ArrayList<Course> courseList;

    //class constuctor that takes 5 arguments 
    public Student (String argFirstName, String argLastName, int argStudentNumber, String argResidencyCode, ArrayList<Course> argCourseList){
        firstName=argFirstName;
        lastName=argLastName;
        studentNumber=argStudentNumber;
        residencyCode=argResidencyCode;
        courseList=argCourseList;
    }

    //class constuctor that takes 4 arguments and sets the residencyCode to "IC" in county
    public Student(String argFirstName,String argLastName,int argStudentNumber,ArrayList<Course> argCourseList){
        firstName=argFirstName;
        lastName=argLastName;
        studentNumber=argStudentNumber;
        residencyCode="IC";
        courseList=argCourseList;
       
    }

    //get and set methods for the class attributes
    public void setFirstName(String arg){
        firstName= arg;

    }
    public void setLastName(String arg){
        lastName=arg;
    }
    public void setStudentNumber (int arg){
        studentNumber=arg;
    }
    public void setResidencyCode(String arg){
        residencyCode=arg;
    }

    public void setCourseList(ArrayList<Course> arg){
        courseList=arg;
    }

    public String getFirstName (){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public int getStudentNumber (){
        return studentNumber;
    }
    public String getResidencyCode(){
        return residencyCode;
    }

    //method to get the Student total credit hours
    public int GetStudentCreditHours(){
        int totalCreditHours=0;
        for(Course c:courseList){
           totalCreditHours= totalCreditHours + c.getCreditHours();
        }
        return totalCreditHours;
    }

    public ArrayList<Course> getCourseList(){
        return courseList;
    }

    // a method to determine the rate for the object
    public double CheckRate(){
        double rate;
        double ICRate= 149.04;
        double OCRate= 174.22;
        double OSRate= 325.79;
        if(residencyCode.equals("IC")){
            rate= ICRate;
        }
        else if(residencyCode.equals("OC")){
            rate=OCRate;
        }
        else{
            rate=OSRate;
        }
        return rate;
        
    }

    // a method to calculate the tuition
    public double CalculateTuition(){
        double tuition;
        double tuitionRate=CheckRate();
        if ((GetStudentCreditHours()>18)){
                tuition=(GetStudentCreditHours()-5)*tuitionRate;
                
            }
            else if(GetStudentCreditHours()>13){
                tuition=13*tuitionRate;
                
            }
            else {
                tuition=GetStudentCreditHours()*tuitionRate;
            }
        
        return tuition;

    }

    // A mehtod to add a course 

    public String AddCourse(Course argCourse){
        String message;
        if(courseList.contains(argCourse)){
            message= argCourse.getCourseName() +" is already on the course List";
        }
        else{
            courseList.add(argCourse);
            message="The course has been added successfully";

        }
        return message;
        
    }
    

}