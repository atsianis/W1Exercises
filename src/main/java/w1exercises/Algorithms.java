package w1exercises;

import java.util.Scanner;

public final class Algorithms {

    public static final int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }


}
