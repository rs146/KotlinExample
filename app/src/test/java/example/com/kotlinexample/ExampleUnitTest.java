package example.com.kotlinexample;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    @Test
    public void myKotlinCollectionsAppendingWork() {
        MyKotlinWork myKotlinWork = new MyKotlinWork();

        Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 5);

        assertEquals("[1, 2, 3, 4, 5]", myKotlinWork.toJSON(collection));
    }
}