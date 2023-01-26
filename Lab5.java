import java.util.ArrayList;
// a class to test the student calss
public class Lab5{
    public static void main (String [] args){
        //student1 is in county and taking 10 credit hours
        //student2 is in county and taking 13 credit hours
        //student3 is in county and taking 19 credit hours
        //student4 is out of county and taking 3 credit hours
        //student5 is out of county and taking 15 credit hours
        //student6 is out of county and taking 22 credit hours
        //student7 is out of state and taking 1 credit hours
        //student8 is out of state and taking 18 credit hours
        //student9 is out of state and taking 19 credit hours
        //student10 is in county and taking 5 credit hours
        //student11 is in county and taking 18 credit hours
        //student12 is in county and taking 20 credit hours

        //an Array list to hold the Student objects
        ArrayList<Student> studentList=new ArrayList<Student>();

        //create course objects
        Course math1=new Course("Math161","Calculus1",4);
        Course math2= new Course("Math162","Calculus2",4);
        Course math3=new Course("Math165","Algebra");
        Course english1=new Course("Engl151","Composition");
        Course english2=new Course("Engl161","literature");
        Course english3=new Course("Engl172","Business Writing");
        Course computer1=new Course("Comp151","Intro to Programming",4);
        Course computer2= new Course("Comp165","C-Sharp");
        Course computer3=new Course("Comp181","Advanced C Sharp",4);
        Course computer4=new Course("Comp212","Intro to Java",4);
        Course philosophy1 =new Course("Phil151","Intro to Philosphy");
        Course philosophy2=new Course("Phil161","Intro to Ethics");
        Course business1=new Course("Badm151","Intro to Business");
        Course business2=new Course("Badm","Intro To Management");
        Course art1=new Course("Art151","Drawing 1",4);
        Course art2=new Course("Art161","Drawing 2",4);
        Course art3=new Course("Art181","Painting 1",4);
        Course art4=new Course("Art185","Painting 2",4);

 
        ArrayList<Course> courseList1=new ArrayList<Course>();
        courseList1.add(math1);
        courseList1.add(english1);
        courseList1.add(computer1);
        courseList1.add(philosophy1);
        ArrayList<Course> courseList2=new ArrayList<Course>();
        courseList2.add(math2);
        courseList2.add(english2);
        courseList2.add(business1);
        ArrayList<Course> courseList3=new ArrayList<Course>();
        courseList3.add(art1);
        courseList3.add(philosophy1);
        courseList3.add(business2);
        ArrayList<Course> courseList4=new ArrayList<Course>();
        courseList4.add(computer2);
        courseList4.add(math2);
        courseList4.add(english2);
        ArrayList<Course> courseList5=new ArrayList<Course>();
        courseList5.add(art2);
        courseList5.add(computer2);
        courseList5.add(math3);
        courseList5.add(business1);
        ArrayList<Course> courseList6=new ArrayList<Course>();
        courseList6.add(philosophy1);
        courseList6.add(business2);
        courseList6.add(english2);
        ArrayList<Course> courseList7=new ArrayList<Course>();
        courseList7.add(art4);
        courseList7.add(computer3);
        ArrayList<Course> courseList8=new ArrayList<Course>();
        courseList8.add(philosophy1);
        courseList8.add(computer2);
        ArrayList<Course> courseList9=new ArrayList<Course>();
        courseList9.add(art4);
        ArrayList<Course> courseList10=new ArrayList<Course>();
        courseList10.add(english1);
        courseList10.add(math1);
        courseList10.add(business1);
        ArrayList<Course> courseList11=new ArrayList<Course>();
        courseList11.add(computer2);
        courseList11.add(math3);
        courseList11.add(english3);
        ArrayList<Course> courseList12=new ArrayList<Course>();
        courseList12.add(art2);
        courseList12.add(art4);
        courseList12.add(math3);
        courseList12.add(business2);
        ArrayList<Course> courseList13=new ArrayList<Course>();
        ArrayList<Course> courseList14=new ArrayList<Course>();
        ArrayList<Course> courseList15=new ArrayList<Course>();
        ArrayList<Course> courseList16=new ArrayList<Course>();

        System.out.println("Course math is " + math1.getCourseID()+" , " +math1.getCourseName()+" ,and " +math1.getCreditHours()+" credit hours");
        System.out.println("Course english is " + english1.getCourseID()+" , " +english1.getCourseName()+" ,and " +english1.getCreditHours()+" credit hours");

        //create the student objects and them to the ArrayList studentList
        Student student1=new Student("John","Dawson",123765,"IC",courseList1);
        System.out.println(student1.getFirstName()+" "+student1.getLastName()+" is taking the following courses: ");

        //test the new constructor and display the course ArrayList
        for(Course c:courseList1){
            System.out.println(c.getCourseName());
        }

        studentList.add(student1);

        Student student2=new Student("Lisa","Hans",987345,"IC",courseList2);

        //test the AddCourse method and the GetStudentCreditHours methods
        student2.AddCourse(english1);
        System.out.println( student2.getFirstName()+" "+student2.getLastName()+ " is taking "+student2.GetStudentCreditHours()+ " credit hours");
        System.out.println(student2.AddCourse(math1));
        System.out.println( student2.getFirstName()+" "+student2.getLastName()+ " is taking "+student2.GetStudentCreditHours()+ " credit hours");
        System.out.println(student2.AddCourse(math1));
        System.out.println( student2.getFirstName()+" "+student2.getLastName()+ " is taking "+student2.GetStudentCreditHours()+ " credit hours");


        studentList.add(student2);

        Student student3=new Student("Jason","wang",345234,"IC",courseList3);

        studentList.add(student3);

        Student student4=new Student("Devon","Snow",109345,"OC",courseList4);

        studentList.add(student4);

        Student student5=new Student("Jennifer","Wood",345254,"OC",courseList5);

        studentList.add(student5);

        Student student6=new Student("David","Park",674933,"OC",courseList6);

        studentList.add(student6);

        Student student7=new Student("Donna","Mason",783234,"OS",courseList7);

        studentList.add(student7);

        Student student8=new Student("Kaily","Andrews",122034,"OS",courseList8);

        studentList.add(student8);
       
        Student student9=new Student("Sara","Yon",129778,"OS",courseList9);

        studentList.add(student9);

        Student student10=new Student("Paul","Phillips",239102,courseList10);

        studentList.add(student10);

        Student student11=new Student("Holly","Faidal",127329,courseList11);

        studentList.add(student11);

        Student student12=new Student("Larry","Poluk",225863,courseList12);

        studentList.add(student12);

        //create two GraduteStudent objects with a Student reference and add them to the student list

        Student student13=new GraduateStudent("Donald","Rice",235869,courseList12);

        studentList.add(student13);

        Student student14=new GraduateStudent("Amy","Watkin",134078,"OS",courseList8);

        studentList.add(student14);

        //get the class for student14

        System.out.println(student14.getFirstName()+ " " +student14.getLastName()+ " is a " + student14.getClass());

         System.out.println("-----------------------------------------------------------------------------------------");

        //for each student object in studentList display the attributes and the tuition
        for(Student student: studentList){

            System.out.println("student " + student.getStudentNumber()+" "+ student.getFirstName() +" " +student.getLastName()+" takes " +student.GetStudentCreditHours() 
        + " credit hours,residency = " + student.getResidencyCode()+", Tuition = " +String.format("%.2f",student.CalculateTuition()));;

            System.out.println("-----------------------------------------------------------------------------------------");

        }


    }
}