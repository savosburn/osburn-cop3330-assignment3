package oop.assignment3.ex45;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @ParameterizedTest
    @ValueSource(strings = {"use", "uses"})
    void utilizeToUse_test_use_to_use(String input) {
        WordFinder finder = new WordFinder();

        ArrayList<String> temp = new ArrayList<>();
        temp.add(input);

        assertEquals(input, finder.utilizeToUse(temp, 0));
    }

    @Test
    void utilizeToUse_test_utilize_to_use() {
        WordFinder finder = new WordFinder();

        ArrayList<String> temp = new ArrayList<>();
        temp.add("utilize");

        assertEquals("use", finder.utilizeToUse(temp, 0));
    }

    @Test
    void utilizeToUse_test_utilize_to_uses() {
        WordFinder finder = new WordFinder();

        ArrayList<String> temp = new ArrayList<>();
        temp.add("utilizes");

        assertEquals("uses", finder.utilizeToUse(temp, 0));
    }

    @Test
    void utilizeToUse_test_unicorn_to_uses() {
        WordFinder finder = new WordFinder();

        ArrayList<String> temp = new ArrayList<>();
        temp.add("unicorn");

        assertEquals("unicorn", finder.utilizeToUse(temp, 0));
    }

    @Test
    void test_modifyList_nothing_to_change() {
        WordFinder finder = new WordFinder();
        ArrayList<String> temp = new ArrayList<>();
        temp.add("john");
        temp.add("uses");
        temp.add("pencils");

        assertEquals(Arrays.asList("john", "uses", "pencils"), finder.modifyList(temp));
    }

    @Test
    void test_modifyList_change_utilize() {
        WordFinder finder = new WordFinder();
        ArrayList<String> temp = new ArrayList<>();
        temp.add("i");
        temp.add("utilize");
        temp.add("pencils");

        assertEquals(Arrays.asList("i", "use", "pencils"), finder.modifyList(temp));
    }

    @Test
    void test_modifyList_change_utilizes() {
        WordFinder finder = new WordFinder();
        ArrayList<String> temp = new ArrayList<>();
        temp.add("john");
        temp.add("utilizes");
        temp.add("pencils");

        assertEquals(Arrays.asList("john", "uses", "pencils"), finder.modifyList(temp));
    }

    @Test
    void test_modifyList_change_everything() {
        WordFinder finder = new WordFinder();
        ArrayList<String> temp = new ArrayList<>();
        temp.add("utilizer");
        temp.add("utilizes");
        temp.add("utilize");

        assertEquals(Arrays.asList("user", "uses", "use"), finder.modifyList(temp));
    }
}