package com.dp.chainOfResponsibility.decoratorway;

public class ImportFormat implements LineFormat {
    private final LineFormat lineFormat;

    public ImportFormat(LineFormat lineFormat) {
        this.lineFormat = lineFormat;
    }

    @Override
    public LineType classify(String line) {
        if(line.startsWith("import"))
            return LineType.IMPORT;
        return lineFormat.classify(line);
    }
}
