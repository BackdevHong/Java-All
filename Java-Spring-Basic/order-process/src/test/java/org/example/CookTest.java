package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CookTest {

    @DisplayName("요리 생성 테스트")
    @Test
    void createTest() {
        assertThatCode(() -> new Cook("만두", 5000))
                .doesNotThrowAnyException();
    }
}
