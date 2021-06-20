package oop.assignment3.ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CreateListTest {
    public ArrayList<String> testList(){
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            words.add("badger");
        }
        for (int i = 0; i < 2; i++) {
            words.add("mushroom");
        }
        words.add("snake");
        for (int i = 0; i < 3; i++) {
            words.add("badger");
        }
        return words;
    }

    // This simultaneously tests addToList method because the method is called inside
    //      of the readFile method
    @Test
    void test_readFIle() {
        CreateList list = new CreateList();
        CreateListTest test = new CreateListTest();

        assertEquals(test.testList(), list.readFile("exercise46_input.txt"));
    }
}