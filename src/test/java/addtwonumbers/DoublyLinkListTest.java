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
}
