package alamsyah.hutama.stream;

import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;
import java.util.List;
import java.util.Optional;

public class RetrivingOperationTest {

    @Test
    void testLimit() {
        List.of("Alam", "Syah", "Hutama", "Khannedy", "Alam", "Hutama").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Alam", "Syah", "Hutama", "Khannedy", "Alam", "Hutama").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Alam", "Syah", "Hutama", "Khannedy", "Alam", "Hutama").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Alammmm", "Syah", "Hutama", "Khannedy", "Alam", "Hutama").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Alammmm", "Syah", "Hutama", "Khannedy", "Alam", "Hutama").stream()
                .findAny();
                optional.ifPresent(name -> {
                    System.out.println(name);
                });
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Alammmm", "Syah", "Hutama", "Khannedy", "Alam", "Hutama").stream()
                .findFirst();
        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }
}
