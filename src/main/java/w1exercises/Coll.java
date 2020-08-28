package w1exercises;

import java.util.*;
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

    public static ArrayList<Integer> eliminateDuplicates(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length-1;i++){
            if(numbers[i] != numbers[i+1]){
                result.add(numbers[i]);
            }
        }
        if(numbers[numbers.length-1] != numbers[numbers.length-2]){
            result.add(numbers[numbers.length-1]);
        }
        return result;
    }

    public static boolean isSymmetric(String input) {
        char[] array = input.trim().toLowerCase().toCharArray();
        int length = array.length;
        for(int i=0; i<length/2; i++){
            if(array[i] != array[length-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void reverseStringWithStack(String input) {
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            stack.push(c);
        }
        while(!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
