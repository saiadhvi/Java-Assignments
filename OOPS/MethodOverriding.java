package OOPS;

public class MethodOverriding
     {

        public void Add(int a, int b)
        {
            System.out.println("Addition of " +a + "+" +b+ " is "+(a+b));
        }
    }

    class ChildMethod extends MethodOverriding
    {

        public void Add(String a, String b)
        {
            System.out.println("Concatenation of string " +a +" and "+ b+" is " +(a+b));
        }
    }

    class ApplicationMethodOverriding
    {
        public static void main(String[] args) {

            MethodOverriding method1 = new MethodOverriding();
            method1.Add(2,3);

            ChildMethod method2 = new ChildMethod();
            method2.Add("Jai", "Bhim");

        }
    }
