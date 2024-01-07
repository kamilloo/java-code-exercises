package palindrome;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseSentence {

    StringBuilder reverseText;

    public String reverse(String inputString){
        if (inputString.isEmpty()){
            return new String("");
        }
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(inputString);

        ArrayList<String> matchedFound = new ArrayList<String>(){};

        while (matcher.find()){
            String group = matcher.group();
            matchedFound.add(group);
        }

        matchedFound =
        reverseText = new StringBuilder();
        matchedFound.forEach((x) -> this.reverseText.append(new StringBuilder(x.toString()).reverse()));

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i<inputString.length(); i++) {
            Matcher charMather = pattern.matcher(new StringBuilder().append(inputString.charAt(i)));
            if (charMather.find()) {
                char letter = reverseText.charAt(0);
                reverseText = new StringBuilder(reverseText.substring(1));
                stringBuilder.append(letter);
            } else {
                stringBuilder.append(inputString.charAt(i));
            }

        }

        return stringBuilder.toString();
    }
}
