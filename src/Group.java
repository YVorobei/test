/**
 * Created by Dell-user on 2/15/16.
 *
 * в классе группа студентов написать
 *  - метод зачислить студента в группу,
 *  - метод вывода списка студентов,
 *  - метод выгнать студента
 *
 */
public class Group {

    Student[] listStudent;
    int freePlace;


    public void createPlaces(int size) {
        listStudent = new Student[size];
    }

    public void addStudent(Student newStudent) {
        if (listStudent == null) {
            System.err.println("can not add, create places first");
        } else {
            if (freePlace >= listStudent.length) {
                System.err.println("Full gruop, wait for next");
            } else {
                listStudent[freePlace] = newStudent;
                freePlace++;
            }
        }
    }

    public void fireStudent(Student oldStudent){
        for(int i=0; listStudent[i] == oldStudent; i++){
            listStudent[i] = new Student();
        }
    }

    public void showAllStudent(){
        for(int i=0; i<freePlace; i++){
            System.out.println(listStudent[i].asString());
        }
    }
}
