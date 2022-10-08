public class Student {
    public String fullName;
    public int age;
    public double GPA;

    public Student(String fullName, int age, double GPA) {
        this.fullName = fullName;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return fullName + " - " + age + " - " + GPA;
    }
}
