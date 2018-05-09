package pl.coderslab.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {

    static boolean verifyEmail(String email) {
        Pattern compiledPattern = Pattern.compile("[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}");
        Matcher matcher = compiledPattern.matcher(email);
        return matcher.matches();
    }

    static boolean verifyPostCode(String postCode){

    }


    public static void main(String[] args) {
        String emailOk = "arek@op.pl";
        String emailBad = "arek@@op.pl";
        System.out.println(verifyEmail(emailOk));
        System.out.println(verifyEmail(emailBad));

    }
}
