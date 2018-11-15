package com.dp.chainOfResponsibility.decoratorway;

public class BlanlkFormat implements LineFormat {
    private final LineFormat lineFormat;

    public BlanlkFormat(LineFormat lineFormat) {
        this.lineFormat = lineFormat;
    }

    @Override
    public LineType classify(String line) {
        if(line.isEmpty())
            return LineType.BLANK;
        return lineFormat.classify(line);
    }
}
