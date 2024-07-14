package alamsyah.hutama.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {
    @Test
    void testStreamOperation() {

        List<String> names = List.of("Alamsyah", "Hutama", "Khannedy");
        Stream<String> streamnames = names.stream();
        Stream<String> streamUpper = streamnames.map(name -> name.toUpperCase());

        streamUpper.forEach(System.out::println);

        System.out.println("----------------------------------");
        names.forEach(System.out::println);

    }
}
