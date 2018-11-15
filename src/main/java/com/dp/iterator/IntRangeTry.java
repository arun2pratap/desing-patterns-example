package com.dp.iterator;

import java.util.Iterator;

public class IntRangeTry implements Iterator<Integer> {
    private Integer start;
    private final Integer end;
    public IntRangeTry(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean hasNext() {
        return start < end;
    }

    @Override
    public Integer next() {
        return start++;
    }

}
