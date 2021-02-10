public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int n, evenNumberSum = 0;
        while(number > 0) {
            n = number % 10;
            if(n % 2 == 0) {
                evenNumberSum += n;
            }
            number /= 10;
        }

        return evenNumberSum;
    }
}
