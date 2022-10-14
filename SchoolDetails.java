package Project1;

import task2.Student;

import java.util.*;

public class SchoolDetails {
    int schoolId;
    String schoolName;
    static String ClassName;
    static String ClassTeacher;
    static String ClassMoniter;
    static int ClassId;
    static String StudentName;
    static int StudentFee;
    String note;
    static Boolean isAvailable;
    static int Studentid;

    static Scanner dog = new Scanner(System.in);
    static Scanner cat = new Scanner(System.in);
    static Scanner anil = new Scanner(System.in);
    public String toString() {
        return " ClassName: "+ ClassName +" "+ " ClassTeacher: " + ClassTeacher+" "+"ClassMoniter"+ClassMoniter+" "+"ClassId"+ClassId ;
    }

    SchoolDetails(String className, String ClassTeacher, String ClassMoniter, int ClassId) {
        this.ClassName = className;
        this.ClassTeacher = ClassTeacher;
        this.ClassMoniter = ClassMoniter;
        this.ClassId = ClassId;
    }

    public SchoolDetails(String studentName, int studentFee, Boolean isAvailable, int studentid) {
        this.StudentName = StudentName;
        this.StudentFee = StudentFee;
        this.isAvailable = isAvailable;
        this.Studentid = Studentid;
    }

    static void createClass() {

    }

    public static int getClassId() {
        return ClassId;
    }

    public static int getStudentid() {
        return Studentid;
    }

    void createStudent() {


    }
    static Scanner lot = new Scanner(System.in);

    public static void main(String[] args) {

        List<SchoolDetails> s = new ArrayList<>();
        List<SchoolDetails> T = new ArrayList<>();
        //Map <Long, List<SchoolDetails>> studentDeatilsWithClass = new HashMap<>();
        System.out.println("\t\t\t\t\t\tWelcome to School Details API");
        System.out.println("enter the School ID: ");
        int schoolid = dog.nextInt();
        System.out.println("enter the School name: ");
        String Schoolname = cat.nextLine();
        int ch;
        do {
            System.out.println("1.Create class");
            System.out.println("2.Read Class");
            System.out.println("3.Delete Class");
            System.out.println("4.Update Class");
            System.out.println("5.Create Students");
            System.out.println("6.Read Students");
            System.out.println("7.Delete Students");
            System.out.println("8.Update Students");
            System.out.println("enter your choice");

            ch = dog.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("enter the class name: ");
                    ClassName = cat.nextLine();
                    System.out.println("enter the class Teacher: ");
                    ClassTeacher = cat.nextLine();
                    System.out.println("enter the class moniter: ");
                    ClassMoniter = cat.nextLine();
                    System.out.println("enter the class Id: ");
                    ClassId = dog.nextInt();
                    s.add(new SchoolDetails(ClassName, ClassTeacher, ClassMoniter, ClassId));
                    break;
                case 2:
                    System.out.println(s.size());
                    s.forEach(v -> System.out.println(v));
                    Iterator<SchoolDetails> i = s.iterator();
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("enter the id to delete: ");
                    int clasid = dog.nextInt();
                    i = s.iterator();
                    while (i.hasNext()) {
                        SchoolDetails e = i.next();
                        if (e.getClassId() == clasid) {
                            i.remove();
                            found = true;
                        }
                    }
                    break;
                case 4:
                    found = false;
                    System.out.println("enter the Student id to Update: ");
                    clasid = dog.nextInt();
                    ListIterator<SchoolDetails> li = s.listIterator();
                    while (li.hasNext()) {
                        SchoolDetails e = li.next();
                        if (e.getClassId() == clasid) {
                            System.out.println("Enter the new ClassName");
                            ClassName = cat.nextLine();

                            System.out.println("enter the new ClassTeacher");
                            ClassTeacher = cat.nextLine();

                            System.out.println("enter the new ClassMoniter");
                            ClassMoniter = cat.nextLine();

                            System.out.println("enter the new ClassId");
                            ClassId = dog.nextInt();

                            li.set(new SchoolDetails(ClassName,ClassTeacher, ClassMoniter, ClassId));
                            found = true;
                        }

                    }
                    break;
                case 5:

                    System.out.println("enter the Student name: ");
                    StudentName = cat.nextLine();
                    System.out.println("enter the Student fee: ");
                    StudentFee = dog.nextInt();
                    System.out.println("enter true if available or false: ");
                    isAvailable = anil.nextBoolean();
                    System.out.println("enter the Student id: ");
                    Studentid = dog.nextInt();
                    T.add(new SchoolDetails(StudentName, StudentFee, isAvailable, Studentid));

                   // T.forEach(t -> System.out.println(t));
                    break;
                case 6:
                    T.forEach(v -> System.out.println(v));
                    break;
                case 7:
                    System.out.println("enter the id to delete: ");
                    int Stdentid = dog.nextInt();
                    i = s.iterator();
                    while (i.hasNext()) {
                        SchoolDetails e = i.next();
                        if (e.getStudentid() == Stdentid) {
                            i.remove();
                            found = true;
                        }
                    }
                    break;
                case 8:
                    System.out.println("enter the Student id to Update: ");
                    Stdentid = dog.nextInt();
                    ListIterator<SchoolDetails> lie = s.listIterator();
                    while (lie.hasNext()) {
                        SchoolDetails e = lie.next();
                        if (e.getStudentid() == Stdentid) {
                            System.out.println("Enter the new StudentName");
                            StudentName = cat.nextLine();

                            System.out.println("enter the new StudentFee");
                            StudentFee = dog.nextInt();

                            System.out.println("enter the new isAvailable");
                            isAvailable = anil.nextBoolean();

                            System.out.println("enter the new Studentid");
                            Studentid = dog.nextInt();

                            lie.set(new SchoolDetails(StudentName,StudentFee, isAvailable, Studentid));
                            found = true;
                        }

                    }
                    break;


            }
        } while (ch != 0);
    }
}
