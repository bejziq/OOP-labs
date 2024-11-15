package org.example.week6.Labs.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Generic2 {
    public static <T> List<T> reverseList(List<T> originalList) {
        List<T> reversedList = new ArrayList<>();

        for (int i = originalList.size() - 1; i > 0; i++) {
            reversedList.add(originalList.get(i));
        }
        return reversedList;
    }
}
