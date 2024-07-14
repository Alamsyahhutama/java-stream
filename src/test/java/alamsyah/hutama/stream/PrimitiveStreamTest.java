package alamsyah.hutama.stream;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamTest {
    @Test
    void TestCreate() {
        IntStream intStream = IntStream.range(1,10);
        intStream.forEach(result2 -> System.out.println("Hasil : " + result2));

        LongStream longStream = LongStream.of(1,2,3,4);

        DoubleStream doubleStream = DoubleStream.builder().add(0.1).add(0.2).build();
//        doubleStream.forEach(System.out::println);
    }

    @Test
    void testAverageOperatiors() {
        IntStream intStream = IntStream.range(1,10);

        OptionalDouble optionalDouble = intStream.average();
        optionalDouble.ifPresent(result -> System.out.println("Hasil : " + result));
        IntStream.range(0,100)
                .mapToObj(number -> "Number : " + number)
                .forEach(System.out::println);

    }
}
