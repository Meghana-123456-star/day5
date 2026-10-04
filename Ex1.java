class Student {

    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }
}
public class Ex1 {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Meghana");
        s.setMarks(85);

        System.out.println(s.getName());
        System.out.println(s.getMarks());
    }
}