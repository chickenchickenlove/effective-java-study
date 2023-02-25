package item03.number1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {
    @Test
    void perform() {

        Concert concert = new Concert(new MockElvis());
//        Concert concert = new Concert(Elvis.INSTANCE);
        concert.perform();

        assertTrue(concert.isLightsOn());
        assertTrue(concert.isMainStageOpen());
    }
}