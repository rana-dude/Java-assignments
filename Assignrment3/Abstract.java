
abstract class Employee {
    String name;
    int salary;
    
    abstract void display();
    void show()
    {
        System.out.println("This is a show method");
    }
}

class Manager extends Employee {
    void display() {
        System.out.println("Manager Name: " + name + ", Age: " + salary);
    }
}
public class Abstract {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "John Doe";
        m.salary = 50000;
        m.display();
        m.show();
    }
    
}
