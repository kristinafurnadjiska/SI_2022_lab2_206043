import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void testRegularLists() {
        List<String> list1 = Arrays.asList("1","#", "2", "0", "3", "#", "1", "#", "#");
        List<String> list2 = Arrays.asList("0","#", "0", "0", "0", "#", "0", "#", "#");
        List<String> list3 = Arrays.asList("0","#", "0", "#", "0", "#", "0", "#", "#");
        List<String> list4 = Arrays.asList("2","#", "2", "#", "4", "#", "2", "#", "#");


        assertEquals(list1,SILab2.function((list2)));
        assertEquals(list4,SILab2.function((list3)));
    }

    @Test
    void testExceptions(){
        IllegalArgumentException ex;
        List<String> list1 = new ArrayList<>();
        List<String> list2 = Arrays.asList("1","#", "2");
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(list1));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(list2));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

    }

}