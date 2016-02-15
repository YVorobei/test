/**
 * Created by Dell-user on 2/15/16.
 */
public class TestMain {

    public static void main(String[] args){

        Student firstStudent = new Student("Stas");
        firstStudent.studentInfoPrint();

        Student secondStudent = new Student("Vova");
        secondStudent.studentInfoPrint();

        //----------------------------

        Group studentGroup = new Group();
        studentGroup.createPlaces(10);
        studentGroup.addStudent(firstStudent);
        studentGroup.addStudent(secondStudent);
        studentGroup.showAllStudent();

        System.out.println("After fire, all student list");
        studentGroup.fireStudent(firstStudent);
        studentGroup.showAllStudent();

    }
}
