class Student{
    String name;
    int age;
    int rollno;
    float weight;
    float height;

    Student(){
        System.out.println("-----Inside the Default Constructor-----");
        name = "Unknown";
        age = 0;
        rollno = 0;
        weight = 0.0f;
        height = 0.0f;
    }
    
    Student(String n, int a, int r, float w, float h){
        System.out.println("-----Inside the Parameterized Constructor-----");
        this.name = n;
        this.age = a;
        this.rollno = r;
        this.weight = w;
        this.height = h;
    }
    Student(Student s1){
        System.out.println("-----Inside the Copy Constructor-----");
        this.name = s1.name;
        this.age = s1.age;
        this.rollno = s1.rollno;
        this.weight = s1.weight;
        this.height = s1.height;
    }
    void display(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nRoll No: "+rollno+"\nWeight: "+weight+"kg"+"\nHeight: "+height+"cm");
    }
}
public class Ass2{   
        public static void main(String[] args) {
        Student s0 = new Student();
        s0.display();
        Student s1 = new Student("Parth", 18, 253, 50f, 171f);
        s1.display();
        Student s2 = new Student(s1);
        s2.display();

        int x = 10;
        int y = 20;
        System.out.println(y>=x) ;
    }
}
