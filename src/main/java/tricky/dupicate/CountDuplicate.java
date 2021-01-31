package tricky.dupicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountDuplicate
{

    public static void main(String[] args) {

        List<Integer> duplicates = Arrays.asList(1, 2, 5, 2, 5, 5, 1, 6, 9);

        Set<Integer> collect  = duplicates.stream()
                .filter(integer -> Collections.frequency(duplicates, integer) > 1)
                .collect(Collectors.toSet());

        System.out.println(collect);
    }
}
