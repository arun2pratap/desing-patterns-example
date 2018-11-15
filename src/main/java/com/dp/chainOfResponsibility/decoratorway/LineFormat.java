package com.dp.chainOfResponsibility.decoratorway;

public interface LineFormat
{
    LineType classify(String line);
}
