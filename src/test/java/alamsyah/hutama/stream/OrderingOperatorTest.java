package alamsyah.hutama.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperatorTest {
    @Test
    void testSorted() {
        List.of("Alamsyah", "Hutama", "Khannedy").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        List.of("Alamsyah", "Hutama", "Khannedy").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}
