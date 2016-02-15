/**
 * Created by Dell-user on 2/15/16.
 *
 * в классе студент написать медот вывода ФИО студента
 */
public class Student {

    private String FullName;

    public Student() {
    }

    public Student(String fullName) {
        FullName = fullName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void studentInfoPrint(){
        System.out.println("about student - " + FullName);
    }

    public String asString(){
        return "Full name student = " + FullName;
    }

}
