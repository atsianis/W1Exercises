package w1exercises;



public final class Algorithms {

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
}
