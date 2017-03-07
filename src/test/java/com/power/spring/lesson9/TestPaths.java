package com.power.spring.lesson9;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by shenli on 2017/2/26.
 */
public class TestPaths {

    @Test
    public void a() throws IOException {
        Stream<Path> list = Files.list(Paths.get("/tmp/abc"));
        System.out.println("list.count() = " + list.count());

//        System.out.println("list.findFirst() = " + list.findFirst());

        Optional<Path> first = Files.list(Paths.get("/tmp/abc")).findFirst();
        System.out.println("first = " + first);
        System.out.println("first.empty() = " + first.empty());
        if (first.equals(Optional.empty())) {
            System.out.println("equals");
        }
        System.out.println("first.get() = " + first.get());
    }
}
