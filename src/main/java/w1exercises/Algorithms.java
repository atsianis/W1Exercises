package w1exercises;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Algorithms {

    public static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static int findMaxFact(){
        for( int i = 1;; i++){
            if(Integer.MAX_VALUE / factorial(i) < i){
                return i-1;
            }
        }
    }


    public static boolean isPrime(int number) {
        if (number<=1){
            return false;
        }
        for(int i=2; i< number/2; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double harmonicSeries(int n){
        if (n==1){
            return 1.0;
        }
        return (1.0/n)+harmonicSeries(n-1);

    }

    public static int countDigits(long n) {
        int counter = 0;
        while(n!=0){
            n /= 10;
            counter++;
        }
        return counter;
    }

    public static float decimalPart(float n) {
        String s = Float.toString(n);
//        System.out.println(s);
        Pattern pattern = Pattern.compile("\\d*\\.");
        Matcher matcher = pattern.matcher(s);
//        System.out.println(matcher.replaceAll("0."));
        return Float.parseFloat(matcher.replaceAll("0."));
    }
}
