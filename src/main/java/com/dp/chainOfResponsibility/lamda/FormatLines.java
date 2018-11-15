package com.dp.chainOfResponsibility.lamda;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

// Count the type of program lines
public class FormatLines {
    public static void main(String[] args) throws IOException {
        Path thisFile = FileSystems.getDefault().getPath("src/main/java/com/dp/chainOfResponsibility/QFormatLinesOld.java");
        Map<LineType, Long> lineCount = Files.lines(thisFile).peek(System.out::println).map(s -> s.trim())
                .map(FormatLines::classify).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.printf("Saw %s lines", lineCount);
    }

    private static LineType[] lineTypes = LineType.values();
    public static LineType classify(String line) {
        return Arrays.stream(lineTypes).filter(lt -> lt.isItMe.test(line)).findFirst()
                .orElseThrow(() -> new RuntimeException("no Line type"));
    }
}
//Problem located in DesignPatternsParticipants.chainOfResponsibility.QFormatLines.javafire
