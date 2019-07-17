package io;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * FileStreamEx
 */
public class FileStreamEx {

    public static void main(String[] args) {
        Path path = Paths.get("lambdaProject/src/io/linedata.txt");
        Stream<String> stream;
        try {
            stream = Files.lines(path, Charset.defaultCharset());//현제 os에서 제공하는 캐릭터셋 가져옴
            stream.forEach(System.out :: println);
            stream.close();
            System.out.println();
        } catch (Exception e) {
            System.out.println("오류");
        }
       
    }
}