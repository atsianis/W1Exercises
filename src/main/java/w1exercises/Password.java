package w1exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Password {

    private static Pattern pattern;
    private static Matcher matcher;
    private static String[] criterias = {".*?[A-Z].*?" , ".*?[a-z].*?", ".*?[0-9].*?", ".*?[@#$%^&+=].*?",
            "(?:([a-zA-Z0-9@#$%^&+=])\\1?(?!\\1))+"};

    private static String[] mandatoryCriterias = {".{8,}", "\\S+"};

    public static void checkStrength(String password) {

        int passedCriteria = checkSimpleCriteria(password);

        if(checkMandatoryCriteria(password) == false){
            System.out.println("Your password must be 8+ characters long and not contain spaces");
        }else{
            switch(passedCriteria){
                case 1:
                case 2:
                    System.out.println("Password OK");
                    break;
                case 3:
                case 4:
                    System.out.println("Strong Password");
                    break;
                case 5:
                    System.out.println("Very Strong Password");
                    break;
            }
        }
    }

    private static boolean checkMandatoryCriteria(String password) {
        boolean passedMandatories = true;
        for (String criteria : mandatoryCriterias){
            pattern = Pattern.compile(criteria);
            matcher = pattern.matcher(password);
            if (!matcher.matches()){
                passedMandatories = false;
            }
        }
        return passedMandatories;
    }

    private static int checkSimpleCriteria(String password){
        int passedCriteria = 0;
        for (String criteria : criterias){
            pattern = Pattern.compile(criteria);
            matcher = pattern.matcher(password);
            if (matcher.matches()){
                passedCriteria++;
            }
        }
        return passedCriteria;
    }
}
