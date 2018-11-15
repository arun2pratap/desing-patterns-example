package com.dp.chainOfResponsibility.decoratorway;

public class CommentFormat implements LineFormat {
    private final LineFormat lineFormat;

    public CommentFormat(LineFormat lineFormat) {
        this.lineFormat = lineFormat;
    }

    @Override
    public LineType classify(String line) {
        if(line.startsWith("//"))
            return LineType.COMMENT;
        return lineFormat.classify(line);
    }
}
