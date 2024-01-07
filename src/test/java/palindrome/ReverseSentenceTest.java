package palindrome;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReverseSentenceTest {

    @Test
    void reverse_whenInputStringEmpty_expectedEmptyString(){

        String expected = new String("");
        ReverseSentence reverse = new ReverseSentence();
        String reverseText = reverse.reverse("");
        Assertions.assertEquals(expected.toString(), reverseText.toString());
    }

    @Test(dataProvider = "input-sentences")
    void reverse_whenInputStringProvided_thenReverseString(String inputSentence, String reserveSentence){
        ReverseSentence generator = new ReverseSentence();
        String actual = generator.reverse(inputSentence);

        Assertions.assertEquals(reserveSentence, actual);
    }

    @DataProvider(name = "input-sentences")
    public static Object[][] inputSentence(){
        return new Object[][]{
                {
                    "txeTesr_eveR",
                    "Reverse_Text",
                },
                {
                    "repole-veDdnek-caBroineS",
                    "Senior-Backend-Developer",
                }
        };
    }


}
