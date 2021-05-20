import javafx.beans.binding.When;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManagerStudent {
    List<Student> students;

    public ManagerStudent() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public boolean delete(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
                this.students.remove(students.get(i));
                return true;
            }
        }
        return false;
    }

    public int seach(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())) {
//                System.out.println(students.get(i).toString());
                return i;
            }
        }
        return -1;
    }

    public void display() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public void edit(String id) {
        if (seach(id) == -1){
            System.out.println("không có ID này");
        }else {
            students.set(seach(id),new Student("chien",25,"HaNoi","Nu","BK","5"));
        }
    }

}



