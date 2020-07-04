public class EvenDigitSum {
    private static int INVALID_NUMBER = -1;

    public static void main(String[] args) {
  System.out.println(getEvenDigitSum(123456789));



        }



    public static int getEvenDigitSum(int number) {
        if(number < 0 )
            return -1;

        int sum = 0;
        int lastdigit = 0;


        while(number > 0) {
             lastdigit = number % 10;
            if ( lastdigit % 2 == 0) {
                sum += lastdigit;
            }
            number /= 10;


        }

        return sum;
    }
}
