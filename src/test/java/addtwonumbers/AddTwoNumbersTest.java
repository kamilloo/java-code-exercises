package addtwonumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class AddTwoNumbersTest {

    @Test
    void sumUp_whenTwoNotEmptyNumbers(){

//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.

        var firstNumber = buildNumber(new int[]{3, 4, 2});
        var secondNumber = buildNumber(new int[]{4, 6, 5});

        var sumUp = new AddTwoNumbers();
        DoublyLinkList sum = sumUp.add(firstNumber, secondNumber);

        var printed = sum.print();
        Assertions.assertEquals(8, printed.get(0));
        Assertions.assertEquals(0, printed.get(1));
        Assertions.assertEquals(7, printed.get(2));
    }

    @Test
    void sumUp_whenTwoEmptyNumbers(){

//        Input: l1 = [0], l2 = [0]
//        Output: [0]
        var firstNumber = new DoublyLinkList();
        firstNumber.insert(0);
        var secondNumber = new DoublyLinkList();
        secondNumber.insert(0);

        var sumUp = new AddTwoNumbers();
        DoublyLinkList sum = sumUp.add(firstNumber, secondNumber);

        var printed = sum.print();
        Assertions.assertEquals(0, printed.get(0));
    }


    @Test
    void sumUp_whenTwoDeferenceDigitsNumbers(){

//        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//        Output: [8,9,9,9,0,0,0,1]

        var firstNumber = buildNumber(new int[]{9,9,9,9,9,9,9});
        var secondNumber = buildNumber(new int[]{9,9,9,9});

        var sumUp = new AddTwoNumbers();
        DoublyLinkList sum = sumUp.add(firstNumber, secondNumber);

        var printed = sum.print();
        Assertions.assertEquals(8, printed.get(7));
        Assertions.assertEquals(9, printed.get(6));
        Assertions.assertEquals(9, printed.get(5));
        Assertions.assertEquals(9, printed.get(4));
        Assertions.assertEquals(0, printed.get(3));
        Assertions.assertEquals(0, printed.get(2));
        Assertions.assertEquals(0, printed.get(1));
        Assertions.assertEquals(1, printed.get(0));
    }



    private DoublyLinkList buildNumber(int[] inputs) {

        var list = new DoublyLinkList();
        Arrays.stream(inputs).forEach(item -> list.insert(item));

        return list;
    }
}
