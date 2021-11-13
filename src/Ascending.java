public class Ascending
{
    public static void main(String[] args)
    {
        sortDigits(683628329);
    }

    public static void sortDigits(int num)
    {
        System.out.println("Number  : " + num);
        String number = Integer.toString(num);
        int len = number.length(); // get length of the number
        int[] digits = new int[len];
        int i = 0;
        while (num != 0)
        {
            int digit = num % 10;
            digits[i++] = digit; // get all the digits
            num = num / 10;
        }
        System.out.println("Digit before sorting: ");
        for (int j : digits)
        {
            System.out.print(j + ",");
        }
        sort(digits);
        System.out.println("\nDigit After sorting: ");
        for (int j : digits)
        {
            System.out.print(j + ",");
        }
    }
    public static void sort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
    }
}