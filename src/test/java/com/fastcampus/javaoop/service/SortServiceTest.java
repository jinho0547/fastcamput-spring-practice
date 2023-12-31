package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService sut = new SortService(new BubbleSort<String>());

    @Test
    void test() {
        List<String> actual = sut.doSort(List.of("3","2","1"));
        assertEquals(List.of("1","2","3"),actual);
    }

}