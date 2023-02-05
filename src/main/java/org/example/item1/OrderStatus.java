package org.example.item1;

// 주문의 상태 변화

/**
 * ENUM은 정해져 있는 상태값을 가질 수 있음.
 * ENUM을 상태값으로 가지도록 하면, 특정한 값만 가지도록 제한할 수 있음. (Type-Safety)
 */
public enum OrderStatus {
    PREPARING(0), SHIPPED(1), DELIVERING(2), DELIVERED(3);

    private int number;

    OrderStatus(int number) {
        this.number = number;
    }
}
