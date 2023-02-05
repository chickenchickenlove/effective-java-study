package org.example.item1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ListQuiz  {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(100, 20, 44, 3);
        Comparator<Integer> desc = (o1, o2) -> o2 - o1;
        numbers.sort(desc);
        numbers.sort(desc.reversed()); // 인터페이스의 default 메서드
    }
}
