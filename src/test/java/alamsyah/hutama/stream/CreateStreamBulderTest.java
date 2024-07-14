package alamsyah.hutama.stream;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.stream.Stream;

public class CreateStreamBulderTest {
    @Test
    void testCraeteStreamBuilder() {

        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Alam");
        builder.add("Alamsyah").add("Hutama");
        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);

    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder()
                .add("Alamsyah").add("Hutama").add("Khannedy").build();
        stream.forEach(System.out::println);
    }
}
