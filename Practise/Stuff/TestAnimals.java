/*class Report {
    public String toString() { return "Report"; }
}
class Printer {
    public void print(Object o) {
        System.out.println("O: Printed an Object");
    }
    
    public void print(Report r) {
        System.out.println("R: Printed a Report");
    }
}
public class Test {
    public static void main(String args[]) {
        Printer p = new Printer();
        Report myReport = new Report();
        
        // This is the key part:
        Object obj = new Report(); 

        p.print(myReport); // Line 1
        p.print(obj);      // Line 2 (The trick!)
    }
}*/
class Animal {
    public void speak() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Woof");
    }
}
class Cat extends Animal {
    // No speak() method! It uses the Animal's version.
}

public class TestAnimals {
    public static void main(String[] args) {
        Animal[] myFarm = { new Dog(), new Cat(), new Animal() };

        for (Animal a : myFarm) {
            a.speak(); // This is polymorphism in action
        }
    }
}