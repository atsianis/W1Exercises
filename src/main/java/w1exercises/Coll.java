package w1exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Coll {

    private static Scanner scanner = new Scanner(System.in);
    private static Pattern pattern;
    private static Matcher matcher;

    public static ArrayList<Integer> findPrimes(int[] array){
        ArrayList<Integer> result = new ArrayList<>();
        for(int n : array){
            if(Algorithms.isPrime(n)){
                result.add(n);
            }
        }
        return result;
    }

    public static int[] getArrayFromUser() {
        System.out.println("Insert integers separated by spaces");
        String input = scanner.nextLine().trim();
        pattern = Pattern.compile("\\s+");
        matcher = pattern.matcher(input);
        System.out.println(matcher.replaceAll(" "));
        String[] st = matcher.replaceAll(" ").split(" ");
        int[] result = new int[st.length];
        for (int i=0; i<st.length; i++){
            result[i] = Integer.parseInt(st[i]);
        }
        return result;
    }
}
