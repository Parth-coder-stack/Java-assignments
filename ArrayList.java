import java.util.ArrayList;

public class Arrayexample {
    public static void main(String[] args){
        arrayList<String>fruits=new ArrayList();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("cherry");

        System.out.printltn("Fruits:" + fruits);
        fruits.remove("Banana");
        System.out.println("After removing banana:" + fruits);

        System.out.println("size:" + fruits.size());
        System.out.println("Contains Apple?" + fruits.contains("Apple"));

    }
}