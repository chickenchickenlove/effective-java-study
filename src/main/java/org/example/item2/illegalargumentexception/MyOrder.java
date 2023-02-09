package org.example.item2.illegalargumentexception;

import java.time.LocalDate;
import java.util.Arrays;

public class MyOrder {

    public void updateDeliveryDate(LocalDate deliveryDate) throws IllegalArgumentException {
        if (deliveryDate.isBefore(LocalDate.now())) {
            // TODO : 과거로 배송을 해달라고?
            throw new IllegalArgumentException("deliveryDate can't be earlier than" + LocalDate.now());
        }
    }

    public void printNumbers(int... numbers) {

        // 실제 어떤 타입인지를 출력한다. (numbers가 어떤 타입인지)
        System.out.println(numbers.getClass().getCanonicalName());

        // 배열이 가지고 있는 타입을 의미한다.
        System.out.println(numbers.getClass().getComponentType());
        Arrays.stream(numbers).forEach(System.out::println);
    }

}
