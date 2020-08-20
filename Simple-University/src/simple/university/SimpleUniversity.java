
package simple.university;

import java.util.Scanner;
import java.util.ArrayList;
class Person{
    //attribute of person
    public String firstName;
    public String lastName;
    public String phone;
    public int age;
    public char sex;
    public String fieldOf;
    public int ID;
    
//the constractor
    public Person(){
    }
    public Person(String ID,String firstName,String lastName,String phone,int age,char sex,String fieldOf){
        int chID=checkID(ID);
        if (chID==0){
            this.ID=0;
        }
        else{
            this.ID=chID;
        }
        this.firstName=firstName;
        this.lastName=lastName;
        this.phone=phone;
        this.age=age;
        this.sex=sex;
        this.fieldOf=fieldOf;
    }
    
    //sets functions
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public void setFieldOf(String fieldOf) {
        this.fieldOf = fieldOf;
    }
    public void setID(String ID) {
        int check=checkID(ID);
        if (check!=0){
            this.ID=check;
        }
        else{
            System.out.println("error in ID");
        }
    }
    
    //Gets functions
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }
    public char getSex() {
        return sex;
    }
    public String getFieldOf() {
        return fieldOf;
    }
    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return String.format("ID=%d firstName=%s lastName=%s phone=%s age=%d sex=%s fieldOf=%s",ID, firstName, lastName, phone , age,sex , fieldOf  );
    }
    
    public int checkID(String ID){
        if (ID.startsWith("0"))
        {
            System.out.println("the ID mustn't start by 0");
            return 0;}
        else{
        int digits=ID.length();
        if (digits>7){
            System.out.println("the ID is long you must enter ID between 5 and 7 digits ");
            return 0;
        }
        else if (digits<5){
        System.out.println("the ID is short you must enter ID between 5 and 7 digits");
        return 0;
    }
        else {return Integer.parseInt(ID);}
        
        
        }
    }
}

//class student inherit from person class
class Student extends Person{
    
//attribute of students
    public String email;
    public double GPA;
    public ArrayList<Subject> studentSubject=new ArrayList<Subject>();
    
    //the constractor
    public Student(){    
    }
    public Student(String ID,String firstName,String lastName,String phone,int age,char sex,String fieldOf,String email,double GPA,ArrayList<Subject> studentSubject){

        super( ID, firstName, lastName, phone, age, sex, fieldOf);
        boolean checkEmail=checkOfEmail(email);
        if(checkEmail){
        this.email=email;}
        else{
            this.email="";
        }
        this.GPA=GPA;
        this.studentSubject=studentSubject;
    }
    public void AddStudentSubject(Subject s){
        if (s.ID!=0){
        this.studentSubject.add(s);}
        else{
            System.out.println("you can't add this subject");
        }
    }
    public void DeleteStudentSubject(Subject s){
        this.studentSubject.remove(s);
    }

    //sets functions
    public void setEmail(String email) {
        boolean check=checkOfEmail(email);
        if(check){
            this.email = email;
        }
        else {
            System.out.println("this Email is innvalid");
        }
        
    }
    public void setStudentSubject(ArrayList<Subject> studentSubject) {
        this.studentSubject = studentSubject;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    //Gets functions
    public String getEmail() {
        return email;
    }
    public double getGPA() {
        return GPA;
    }
    public ArrayList<Subject> getStudentSubject() {
        return studentSubject;
    }

    @Override
    public String toString() {
        return super.toString()+ " email=" + email + " GPA=" + GPA+" Subjects ="+studentSubject ;
    }

    public boolean checkOfEmail(String email){
        boolean check=email.contains("@");
        if (check){
            return true;
        }
        else {
            return false;
        }
    }
    
}
class Teacher extends Person{
    public String positions;
    public ArrayList<Subject> teacherSubject=new ArrayList<Subject>();
    public Teacher(){
    }
    public Teacher(String ID,String firstName,String lastName,String phone,int age,char sex,String fieldOf,String positions,ArrayList<Subject> teacherSubject){
        super(ID, firstName, lastName, phone, age, sex, fieldOf);
        this.positions=positions;
        this.teacherSubject=teacherSubject;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }
    public void setTeacherSubject(ArrayList<Subject> teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    public String getPositions() {
        return positions;
    }
    public ArrayList<Subject> getTeacherSubject() {
        return teacherSubject;
    }

    @Override
    public String toString() {
        return super.toString()+" positions=" + positions+" Subjects= "+teacherSubject ;
    }
    public void AddTeacherSubject(Subject s){
        if(s.ID!=0){
        this.teacherSubject.add(s);}
        else{
            System.out.println("you can't add this subject");
        }
    }
    public void DeleteTeacherSubject(Subject s){
        this.teacherSubject.remove(s);
    }
  
}
class Subject{
    //attributs
    public int ID;
    public String name;
    public int hours;
    public String fieldOf;
    
    //the constractor
    public Subject(){
    }
    public Subject(String ID, String name,int hours,String fieldOf){
        int chID=checkID(ID);
        if (chID==0){
            this.ID=0;
        }
        else{
            this.ID=chID;
        }
        this.name=name;
        this.hours=hours;
        this.fieldOf=fieldOf;
    }

    //Sets functions
    public void setID(String ID) {
        int chID=checkID(ID);
        if (chID==0){
            this.ID=0;
        }
        else{
            this.ID=chID;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setFieldOf(String fieldOf) {
        this.fieldOf = fieldOf;
    }

    //Gets functoins
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getHours() {
        return hours;
    }
    public String getFieldOf() {
        return fieldOf;
    }

    @Override
    public String toString() {
        return String.format("ID=" + ID + ", name=" + name + ", hours=" + hours + ", fieldOf=" + fieldOf );
    }
    public int checkID(String ID){
        if (ID.startsWith("0"))
        {
            System.out.println("the ID mustn't start by 0");
            return 0;}
        else{
        int digits=ID.length();
        if (digits>7){
            System.out.println("the ID is long you must enter ID between 5 and 7 digits ");
            return 0;
        }
        else if (digits<5){
        System.out.println("the ID is short you must enter ID between 5 and 7 digits");
        return 0;
    }
        else {return Integer.parseInt(ID);}
        
        
        }
    }
    
}

public class SimpleUniversity {
    static  ArrayList<Subject> subjects=new ArrayList<Subject>();
    static  ArrayList<Student> students=new ArrayList<Student>();
    static ArrayList<Teacher> teachers=new ArrayList<Teacher>();
      
    public static void AddSubjectsList(Subject s){
           if (s.ID==0){
               System.out.println("You can't add this subject you must edit the ID");
           }
           else{
               subjects.add(s);
           }}
    public static void AddTeachersList(Teacher t){
           if (t.ID==0){
               System.out.println("You can't add this teacher you must edit the ID");
           }
           else{
               teachers.add(t);
           }}
    public static void AddStudentsList(Student s){
           if (s.ID==0){
               System.out.println("You can't add this subject you must edit the ID");
           }
           else{
               students.add(s);
           }}
    public static void main(String[] args) {
        //Scanner input=new Scanner(System.in);
        
        //create empty lists
        ArrayList<Subject> studentSubjects=new ArrayList<Subject>();
        ArrayList<Subject> teacherSubjects=new ArrayList<Subject>();
        
        //create lists of subjects & Students & Teachers

        

        
       Subject math=new Subject("41","math",3,"math");
        Subject software=new Subject("05442","software",3,"CS");
        Subject database=new Subject("4322222","DataBase",3,"CS");
        Subject web=new Subject("441689","Web",4,"CS");

        AddSubjectsList(math);
        AddSubjectsList(software);
        AddSubjectsList(database);
        AddSubjectsList(web);
        System.out.println(subjects);
       
        //create students and add subjects
        Student s1=new Student("55545","Ahmad","Salman","0598648715",25,'m',"cs","as.ahmad.salman@gmail.com",4.79,studentSubjects);
        s1.AddStudentSubject(math);
        s1.AddStudentSubject(web);
        System.out.println("the  s1 Subjects"+ s1.getStudentSubject());
        System.out.println("all Information of s1 "+s1.toString());
        
        //edit the age s1
        s1.setAge(26);
        
        //delete subject 
        s1.DeleteStudentSubject(math);
        System.out.println(s1.toString());
        
        //add s1 to StudentsList
        students.add(s1);
        System.out.println("Students:\n"+students);
        
       //create teacher and add subjects
        Teacher t1=new Teacher("5222222","ali","mohammad","052346789",30,'m',"cs","PDH",teacherSubjects);
        Teacher t2=new Teacher("052","ali2","mohammad","052346789",30,'m',"cs","PDH",teacherSubjects);
        System.out.println(t1.toString());
        t1.AddTeacherSubject(software);
        t1.AddTeacherSubject(database);
        System.out.println(t2.toString());
        
        //add t1 to TeacherList
        AddTeachersList(t1);
        AddTeachersList(t2);
        System.out.println("Teachers:\n"+teachers);

        
       }
} 

