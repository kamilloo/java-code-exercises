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
        Collections.reverse(matchedFound);

        reverseText = new StringBuilder();
        matchedFound.stream()
                .map((String x) -> new StringBuilder(x).reverse().toString())
                .toList()
                .forEach((x) -> this.reverseText.append(x));

        StringBuilder output = new StringBuilder();

        for (int i = 0; i<inputString.length(); i++) {
            String inputLetter = String.valueOf((inputString.charAt(i)));
            Matcher charMather = pattern.matcher(inputLetter);
            if (charMather.find()) {
                char reverseLetter = reverseText.charAt(0);
                reverseText = new StringBuilder(reverseText.substring(1));
                output.append(reverseLetter);
            } else {
                output.append(inputLetter);
            }

        }

        return String.valueOf(output);
    }
}
