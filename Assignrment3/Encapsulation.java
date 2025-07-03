

public class  Encapsulation {
    private String name;
    private int age;
    void display(int a, String n) {
        this.name = n;
        this.age = a;
    }
        void printDetails()
        {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
        }
    public static void main(String[] args) {
        Encapsulation obj = new  Encapsulation();
        obj.display(23, "John Doe"); 
        obj.printDetails();
    }
}
