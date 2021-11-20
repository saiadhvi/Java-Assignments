
import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        int number,i=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        number= input.nextInt();

        int array[]=new int[10];

        while(number !=0)
        {
            array[i++]=number %10;
            number=number/10;

        }
        Arrays.sort(array);
        //System.out.println(number);

        PrintinAscednding(array);
    }

    public static void PrintinAscednding(int[] array1)
    {
        int num=0;
        for(int i=0;i<array1.length;i++)
        {
            num=(num*10)+array1[i];
        }
        System.out.println("Number after arranging in ascending order "+num);
    }

}