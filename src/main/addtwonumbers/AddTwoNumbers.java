package addtwonumbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddTwoNumbers {
    int move;
    DoublyLinkList sum = new DoublyLinkList();


    public DoublyLinkList add(DoublyLinkList firstNumber, DoublyLinkList secondNumber) {

        ArrayList<Integer> firstPrint = firstNumber.print();
        ArrayList<Integer> secondPrint = secondNumber.print();
        Iterator firstIterator = firstPrint.listIterator();
        Iterator secondIterator = secondPrint.listIterator();

        move = 0;
        while (firstIterator.hasNext() || secondIterator.hasNext()){
            int firstDigit = firstIterator.hasNext() ? (int)firstIterator.next() : 0;
            int secondDigit = secondIterator.hasNext() ? (int)secondIterator.next(): 0;
            int digitSum = firstDigit + secondDigit + move;
            move = digitSum / 10;
            int single_digit = digitSum % 10;
            sum.insert(single_digit);
        }

        if (move > 0){
            sum.insert(move);
        }

        return sum;
    }

}
