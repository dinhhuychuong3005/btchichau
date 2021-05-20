import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        managerStudent.add(new Student("chuong", 27, "QLND", "Nam", "TQT", "2"));
        managerStudent.add(new Student("Phong", 23, "Thailo", "Nam", "TQT", "3"));
        managerStudent.display();
        System.out.println("==================");
        int find = managerStudent.seach("2");
        if (find == -1) {
            System.out.println("khong co");
        } else {
            System.out.println(managerStudent.students.get(find));
        }
//        managerStudent.seach("2");
        managerStudent.edit("3");
        managerStudent.display();
        if (managerStudent.delete("3")) {
            managerStudent.display();
        } else {
            managerStudent.display();
        }
        Collections.sort(managerStudent.students);
        managerStudent.display();
    }
}
