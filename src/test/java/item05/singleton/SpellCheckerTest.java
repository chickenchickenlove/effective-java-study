package item05.singleton;

import item05.staticutils.SpellChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
        // 이 경우, SpellChecker 내부에서 사용하는 딕셔너리를 바꿀 수 있는 방법이 없다.
        // SpellChecker의 의존 객체와 테스트에서 격리성이 필요한데, 그럴 수 없어서 문제가 된다.
        Assertions.assertTrue(SpellChecker.isValid("test"));
    }

}

