interface Sample {     void display(); 
} 
 
class Parent { 
 
    void message() { 
        System.out.println("Parent Class"); 
    } 
} 
 
class Child extends Parent implements Sample { 
 
    public void display() { 
        System.out.println("Interface Method"); 
    } 
 
    public static void main(String[] args) { 
 
        Child obj = new Child(); 
 
        obj.message();         obj.display(); 
    } 
} 
