package com.dp.chainOfResponsibility.decoratorway;

public class CodeFormat implements LineFormat{

    @Override
    public LineType classify(String line) {
        return LineType.CODE;
    }
}
