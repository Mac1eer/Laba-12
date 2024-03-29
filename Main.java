public class Main {
    public static void main(String[] args) {
        Teacher Ivan = new Teacher("Иванов Иван Иванович", 35, "Преподаватель");
        Teacher Petr = new Teacher("Петров Петр Петрович", 40, "Профессор");
        Student Oleg = new Student("Сидоров Олег Константинович", 20, "Студент");
        Student Elena = new Student("Кузнецова Елена Александровна", 22, "Студент");
        Ivan.Login();
        Elena.Password();
    }
}
interface User {
    void Login();
    void Password();
}
abstract class People implements User {
    String fullName;
    int age;
    String position;
    public People(String fullName, int age, String position) {
        this.fullName = fullName;
        this.age = age;
        this.position = position;
    }
    @Override
    public void Login() {
        System.out.println("Ваш логин, "+ this.fullName +":");
    }
    @Override
    public void Password() {
        System.out.println("Ваш пароль, "+ this.fullName +":");
    }
}
class Teacher extends People {
    public Teacher(String fullName, int age, String position) {
        super(fullName, age, position);
    }
}
class Student extends People {
    public Student(String fullName, int age, String position) {
        super(fullName, age, position);
    }
}
