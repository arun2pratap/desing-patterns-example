package com.dp.chainOfResponsibility.lamda;

import java.util.function.Predicate;

enum LineType {
    COMMENT(s -> s.startsWith("//")), BLANK(String::isEmpty), IMPORT(s -> s.startsWith("import")), CODE(s -> true);
    public final Predicate<String> isItMe;
    LineType(Predicate<String> isItMe) {
        this.isItMe = isItMe;
    }
}
