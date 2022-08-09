package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    /**
     * "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
     */
    @Test
    void split_1() {
        //given
        String string = "1,2";
        //when
        String[] split = string.split(",");
        //then
        Assertions.assertThat(split).contains("1");
        Assertions.assertThat(split).contains("2");
    }

    /**
     * "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
     */
    @Test
    void split_2() {
        //given
        String string = "1";
        //when
        String[] split = string.split(",");
        //then
        Assertions.assertThat(split).containsOnly("1");
    }

    /**
     * "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
     */
    @Test
    void substring() {
        //given
        String string = "(1,2)";
        //when
        String substring = string.substring(1, string.length() - 1);
        //then
        Assertions.assertThat(substring).isEqualTo("1,2");
    }
}
