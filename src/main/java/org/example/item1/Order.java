package org.example.item1;

import jdk.jfr.SettingDefinition;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;


public class Order {

    private boolean prime;
    private boolean urgent;
    private Product product;

    private OrderStatus orderStatus;

    /**
     * 0 - 주문 받음
     * 1 - 준비 중
     * 2 - 배송 중
     * 3 - 배송 완료
     */
    private int status;
    private final int PREPARING = 0;
    private final int SHIPPED = 2;




    public static Order primeOrder(Product product, boolean prime) {
        Order order = new Order();
        order.prime = prime;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product, boolean urgent) {
        Order order = new Order();
        order.urgent = urgent;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {

        // EnumSet, EnumMap을 사용해서 구현해보자.
        // Enum만 가지는 녀석만 쓴다고 하면, HashSet보다 EnumSet이 더 좋다.

        for (String arg : args) {

        }


        EnumSet<OrderStatus> enumSet = EnumSet.of(OrderStatus.PREPARING, OrderStatus.SHIPPED, OrderStatus.DELIVERED,
                OrderStatus.DELIVERING);

//        EnumMap<OrderStatus, String> orderStatusObjectEnumMap = new EnumMap<>(OrderStatus.class);
//        orderStatusObjectEnumMap.put(OrderStatus.PREPARING, 1);
//
//
//        OrderStatus[] values1 = OrderStatus.values();
//        EnumSet<OrderStatus> enumSet = new EnumSet<>(OrderStatus.class, new Enum[]);
//        OrderStatus[] values = OrderStatus.values();
//        for (OrderStatus value : values) {
//            es.add(value);
//        }



    }

}
