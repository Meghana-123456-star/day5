class Employee {

    String name = "Employee";
}

class Manager extends Employee {

    String name = "Manager";

    void display() {

        System.out.println("Child variable: " + name);
        System.out.println("Parent variable: " + super.name);
    }
}

public class SuperVariable {

    public static void main(String[] args) {

        Manager m = new Manager();

        m.display();
    }
}