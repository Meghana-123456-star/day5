class Employee {

    String name = "Employee";

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    String name = "Developer";

    @Override
    void work() {

        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);

        super.work();

        System.out.println("Developer writes Java code");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Developer d = new Developer();

        d.work();
    }
}
