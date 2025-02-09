package section07;

public class Ex07_13 {
    public static void main(String[] args) {
        Student kim1 = new Student();
        System.out.print(Student.schoolName + " ");
        Student.gotoSchool();
        kim1.studentName = "김일남";
        kim1.hello();
        System.out.println();

        System.out.println();

        Student kim2 = new Student();
        System.out.print(Student.schoolName + " ");
        Student.gotoSchool();
        kim2.studentName = "김이남";
        kim2.hello();

    }
}
