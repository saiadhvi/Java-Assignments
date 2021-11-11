import java.util.Scanner;

public class Upperlowercheck {

/*This program will show the entered character as uppercase/Lowercase */

        public static void main(String[] args) {
            System.out.println("Please enter a character: ");
            Scanner sc =new Scanner(System.in);
            char alphabet= sc.next().charAt(0);

            if (Character.isUpperCase(alphabet)){
                System.out.println("The entered character is Upper case");
            }
            else if(Character.isLowerCase(alphabet)){
                System.out.println("The entered character is Lower case");
            }
        }
    }
