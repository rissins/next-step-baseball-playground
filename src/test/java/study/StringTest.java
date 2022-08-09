package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    /**
     * "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
     * String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
     * JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.
     */
    @Test
    void findStringByChaAt() {
        //given
        String string = "abc";
        //when
        char getZeroIndexByCharAt = string.charAt(0);
        char getOneIndexByCharAt = string.charAt(1);
        char getTwoIndexByCharAt = string.charAt(2);
        //then
        Assertions.assertThat(getZeroIndexByCharAt).isEqualTo('a');
        Assertions.assertThat(getOneIndexByCharAt).isEqualTo('b');
        Assertions.assertThat(getTwoIndexByCharAt).isEqualTo('c');
        Assertions.assertThatThrownBy(() -> string.charAt(string.length()))
                .isInstanceOf(IndexOutOfBoundsException.class);
    }
}
