// Course class that will have three attributes 
// courseID, courseName, and creditHours
public class Course{
    //attributes
    private String courseID;
    private String courseName;
    private int creditHours;

    //class constructor that takes three arguments for all the class attributes
    public Course(String argCourseID, String argCourseName, int argCreditHours){
        courseID=argCourseID;
        courseName=argCourseName;
        creditHours=argCreditHours;
    }

    //class constructor that takes tow arguments for courseID and courseName and sets credit hours to 3 
    public Course(String argCourseID, String argCourseName){
        courseID=argCourseID;
        courseName=argCourseName;
        creditHours=3;
    }
    
    //get and set methods for the class attributes

    public void setCourseID(String arg){
        courseID=arg;
    }

    public String getCourseID(){
        return courseID;
    }

    public void setCourseName(String arg){
        courseName=arg;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCreditHours(int arg){
        creditHours=arg;
    }

    public int getCreditHours(){
        return creditHours;
    }
}