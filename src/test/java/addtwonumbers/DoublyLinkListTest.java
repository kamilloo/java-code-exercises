package addtwonumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.ListIterator;

public class DoublyLinkListTest {

    @Test
    void traversal_forward(){

        DoublyLinkList doublyLinkList = new DoublyLinkList();
        doublyLinkList.insert(1);

        ArrayList<Integer> printed = doublyLinkList.print();
        ListIterator<Integer> integerListIterator = printed.listIterator();

        while (integerListIterator.hasNext()) {
            int next = integerListIterator.next();
            Assertions.assertEquals(1, next);

        }
    }

    @Test
    void  traversal_backward(){
        var doubleLinkList = new DoublyLinkList();
        doubleLinkList.insert(1);
        doubleLinkList.insert(2);
        doubleLinkList.insert(3);

        var printed = doubleLinkList.print();
        Assertions.assertEquals(3, printed.get(0));
        Assertions.assertEquals(2, printed.get(1));
        Assertions.assertEquals(1, printed.get(2));
    }

    @Test
    void operators_test(){
        int positive = 99;
        int expected = -99;

        //WHEN
        int negative = ~positive + 1;

        //THEN
        Assertions.assertEquals(expected, negative);
        Assertions.assertEquals(expected, -positive);


    }
}
