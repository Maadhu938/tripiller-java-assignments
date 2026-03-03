// FinalClass.java
final class FinalClass {
    void display() {
        System.out.println("This is a final class - cannot be extended");
    }
}

// Parent.java
class Parent {
    final int MAX_VALUE = 100; // Final variable
    final void finalMethod() { // Final method - cannot be overridden
        System.out.println("This method cannot be overridden");
    }
    
    void normalMethod() {
        System.out.println("Normal method");
    }
}

// Child.java
class Child extends Parent {
    // Cannot override finalMethod()
    // void finalMethod() {} // ERROR!
    
    @Override
    void normalMethod() {
        System.out.println("Overridden normal method");
    }
    
    void demonstrateFinalVariable() {
        // MAX_VALUE = 200; // ERROR! Cannot reassign final variable
        System.out.println("Final variable value: " + MAX_VALUE);
    }
}

// Main.java
public class FinalKeywordDemo {
    public static void main(String[] args) {
        // Final variable
        final double PI = 3.14159;
        // PI = 3.14; // Compilation error
        
        System.out.println("Final variable PI: " + PI);
        
        // Final method and class demonstration
        Child child = new Child();
        child.finalMethod();
        child.normalMethod();
        child.demonstrateFinalVariable();
        
        // FinalClass fc = new FinalClass(); // Can instantiate
        // class SubClass extends FinalClass {} // ERROR! Cannot extend final class
    }
}