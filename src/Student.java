public class Student extends Person implements Comparable<Student>{
    private String school;
    private String id;

    public Student() {
    }

    public Student(String school, String id) {
        this.school = school;
        this.id = id;
    }

    public Student(String name, int age, String address, String gender, String school, String id) {
        super(name, age, address, gender);
        this.school = school;
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + getName() +
                " age=" + getAge() + " addres" +
                " gender=" + getGender() +
                " school='" + school + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.getAge() - student.getAge();
    }
}
