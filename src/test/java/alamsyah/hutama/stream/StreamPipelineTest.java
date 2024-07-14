package alamsyah.hutama.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {
    @Test
    void testCreateStreamPipeline() {
        List<String> list = List.of("Alamsyah", "Hutama", "Khannedy");

        Stream<String> stream = list.stream();

        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());

        Stream<String> stringMr = streamUpper.map(upper -> "Mr. " + upper);
        stringMr.forEach(System.out::println);

    }

    @Test
    void testCreateStreamPipelineOK() {
        List<String> list = List.of("Alamsyah", "Hutama", "Khannedy");
        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr. " + upper)
                .forEach(System.out::println);
    }
}