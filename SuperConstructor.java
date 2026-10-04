class Employee {

    Employee() {
        System.out.println("Employee constructor");
    }
}

class Manager extends Employee {

    Manager() {

        super();

        System.out.println("Manager constructor");
    }
}

public class SuperConstructor {

    public static void main(String[] args) {

        Manager m = new Manager();
    }
}