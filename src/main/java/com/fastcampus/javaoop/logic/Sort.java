package com.fastcampus.javaoop.logic;

import java.util.ArrayList;
import java.util.List;

public interface Sort <T extends Comparable<T>>{
    public List<T> sort(List<T> list);
}
