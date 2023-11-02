package Firstpack;

public class School {
    private String schoolName;
    public School(String name){
        this.schoolName=name;
    }
    public void enrollStudent(teacher Teacher, Student student ){
       System.out.println("Enrolling "  + student.getName() + " " + schoolName);
       System.out.println( student.getName() + " teacher name  " + " is " + Teacher.getTeacherName() );
        ;
    }
    public static void main (String []args){
        School mySchool= new School("olom");
        Student student1=new Student("susan");
        teacher teacher1=new teacher("mwende");
        mySchool.enrollStudent(teacher1,student1);
    }


}
