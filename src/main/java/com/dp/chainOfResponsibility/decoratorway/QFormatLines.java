package com.dp.chainOfResponsibility.decoratorway;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;

// Count the type of program lines
public class QFormatLines {
    public static void main(String[] args) throws IOException {
//        LineFormat codeFl =
        LineFormat lineFormat = new CommentFormat(new BlanlkFormat(new ImportFormat(new CodeFormat())));
        Path thisFile = FileSystems.getDefault().getPath("src/main/java/com/dp/chainOfResponsibility/QFormatLinesOld.java");
        Map<LineType, Long> lineCount = Files.lines(thisFile).peek(System.out::println).map(s -> s.trim())
                .map(lineFormat::classify).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.printf("Saw %s lines", lineCount);
    }
}