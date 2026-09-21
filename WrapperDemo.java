public class WrapperDemo {
    public static void main(String[] args) {
     
        int num = 25;
        Integer boxedNum = num;

      
        int unboxedNum = boxedNum;

    
        int parsedInt = Integer.parseInt("123");
        double parsedDouble = Double.parseDouble("45.67");

        
        String str = Integer.toString(num);

       
        Integer a = 10, b = 20;
        int sum = a + b;
        int max = Math.max(a, b);

       
        System.out.println("Boxed: " + boxedNum);
        System.out.println("Unboxed: " + unboxedNum);
        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Parsed double: " + parsedDouble);
        System.out.println("Int to String: " + str);
        System.out.println("Sum: " + sum + ", Max: " + max);
    }
}