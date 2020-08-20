
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
    public void setID(int ID) {
        this.ID = ID;
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
        this.studentSubject.add(s);
    }
    public void DeleteStudentSubject(Subject s){
        this.studentSubject.remove(s);
    }
    

    public void setStudentSubject(ArrayList<Subject> studentSubject) {
        this.studentSubject = studentSubject;
    }

    public ArrayList<Subject> getStudentSubject() {
        return studentSubject;
    }
        
            
            
        
    
    //sets functions
    public void setEmail(String email) {
        this.email = email;
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

    public String getPositions() {
        return positions;
    }

    @Override
    public String toString() {
        return super.toString()+" positions=" + positions+" Subjects= "+teacherSubject ;
    }
    public void AddTeacherSubject(Subject s){
        this.teacherSubject.add(s);
    }
    public void DeleteTeacherSubject(Subject s){
        this.teacherSubject.remove(s);
    }
    

    public void setTeacherSubject(ArrayList<Subject> studentSubject) {
        this.teacherSubject = studentSubject;
    }

    public ArrayList<Subject> getTeacherSubject() {
        return teacherSubject;
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
    public Subject(int ID, String name,int hours,String fieldOf){
        this.ID=ID;
        this.name=name;
        this.hours=hours;
        this.fieldOf=fieldOf;
    }

    //Sets functions
    public void setID(int ID) {
        this.ID = ID;
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
        public int checkdigit(int ID){
        String stringOfID=Integer.toString(ID);
        if (stringOfID.startsWith("0"))
        {
            System.out.println("the ID mustn't start by 0");
            return 0;}
        else{
        int digits=stringOfID.length();
        if (digits>7){
            System.out.println("the ID is long you must enter ID between 5 and 7 digits ");
            
        }
        else if (digits<5){
        System.out.println("the ID is short you must enter ID between 5 and 7 digits");
        
    }
        else {return ID;}
        return 0;
        
        }
    }
    
}

public class SimpleUniversity {

    public static void main(String[] args) {
        //Scanner input=new Scanner(System.in);
        
        //create empty lists
        ArrayList<Subject> studentSubjects=new ArrayList<Subject>();
        ArrayList<Subject> teacherSubjects=new ArrayList<Subject>();
        
        //create lists of subjects & Students & Teachers
        ArrayList<Subject> subjects=new ArrayList<Subject>();
        ArrayList<Student> students=new ArrayList<Student>();
        ArrayList<Teacher>teachers=new ArrayList<Teacher>();
        

        
        Subject math=new Subject(41,"math",3,"math");
        Subject software=new Subject(42,"software",3,"CS");
        Subject database=new Subject(43,"DataBase",3,"CS");
        Subject web=new Subject(44,"Web",4,"CS");
        subjects.add(math);
        subjects.add(software);
        subjects.add(database);
        subjects.add(web);
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
        System.out.println("Students:/n"+students);
        
        //create teacher and add subjects
        Teacher t1=new Teacher("5222222","ali","mohammad","052346789",30,'m',"cs","PDH",teacherSubjects);
        System.out.println(t1.toString());
        t1.AddTeacherSubject(software);
        t1.AddTeacherSubject(database);
        System.out.println(t1.toString());
        
        //add t1 to TeacherList
        teachers.add(t1);
        System.out.println("Teachers:/n"+teachers);

        
    }
    
    
}
