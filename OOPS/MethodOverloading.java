package OOPS;

public class MethodOverloading {
    int a, b, c;

   public void findLargestNumber(int a, int b) {
        if (a > b) {
            System.out.println("The Largest number of two is " + a);
        } else if (b > a) {
            System.out.println("The Largest number of two is " + b);
        }
    }

   public void findLargestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("The Largest number of three is  " + a);
        } else if (b > a && b > c) {
            System.out.println("The Largest number of three is " + b);
        } else if (c > a && c > b) {
            System.out.println("The Largest number of three is  " + c);
        }

    }

}

class LargestNumbers extends MethodOverloading{

    public static void main(String[] args) {
        LargestNumbers result = new LargestNumbers();
        result.findLargestNumber(23,43);
        result.findLargestNumber(23 , 89,100);
    }
}