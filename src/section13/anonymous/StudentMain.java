package section13.anonymous;

public class StudentMain {
    public static void main(String[] args) {
        // Person person = new Person(); // 불가
        // person.mySelf(); // 불가
        Person person = new Student();
        person.mySelf();

        Student student = new Student();
        student.mySelf();

        Person anonymousPerson = new Person() {
            @Override
            void mySelf() {
                System.out.println("나는 익명 학생입니다.");
            }
        };
        anonymousPerson.mySelf();
        Person anonymousPerson2 = new Person() {
            @Override
            void mySelf() {
                System.out.println("나는 익명 학생2입니다.");
            }
        };
        anonymousPerson2.mySelf();

        (new Person() {
            @Override
            void mySelf() {
                System.out.println("나는 익명 학생3입니다.");
            }
        }).mySelf();

        System.out.println();

        Teacher teacher = new Teacher() {
            @Override
            public void mySelf() {
                System.out.println("나는 익명 교사입니다.");
            }
        };
        teacher.mySelf();
        (new Teacher() {
            @Override
            public void mySelf() {
                System.out.println("나는 익명 교사2입니다.");
            }
        }).mySelf();
        
    }
}
