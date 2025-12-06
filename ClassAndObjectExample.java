public class ClassAndObjectExample {
    String name;
    int age;

    // Constructor
    ClassAndObjectExample(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ClassAndObjectExample s1 = new ClassAndObjectExample("Srinidhi", 24);
        ClassAndObjectExample s2 = new ClassAndObjectExample("Alex", 22);

        s1.display();
        s2.display();
    }
}

