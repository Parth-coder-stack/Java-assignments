class Outer {
    private String msg = "Hello from Outer class";

  
    class Inner {
        void display() {
            System.out.println("Inner class accessing: " + msg);
        }
    }
}

interface Greet {
    void sayHello();
}

public class InnerAnonymousDemo {
    public static void main(String[] args) {
        // Using Inner class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        Greet greet = new Greet() {
            public void sayHello() {
                System.out.println("Hello from Anonymous class");
            }
        };
        greet.sayHello();
    }
}