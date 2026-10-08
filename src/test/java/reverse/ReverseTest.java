package reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {
    private Reverse reverse = new Reverse();

    @Test
    public void shouldReverseOnlyLetters() {
        String result = reverse.reverseLetters("J@va the be$t!123");
        Assertions.assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    public void shouldReturnEmptyStringIfEmpty() {
        String result = reverse.reverseLetters("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void shouldReturnSameStringIfOneLetter() {
        String result = reverse.reverseLetters("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void shouldReturnSameStringIfNoLetters() {
        String result = reverse.reverseLetters("123 !@#");
        Assertions.assertEquals("123 !@#", result);
    }

    @Test
    public void shouldReturnReverseStringIfOnlyLetters() {
        String result = reverse.reverseLetters("abcd");
        Assertions.assertEquals("dcba", result);
    }

    @Test
    public void shouldReturnNoLettersInSamePosition() {
        String result = reverse.reverseLetters("1ab2cd3");
        Assertions.assertEquals("1dc2ba3", result);
    }

    @Test
    public void shouldReverseAnyCaseLetters() {
        String result = reverse.reverseLetters("11Ab2Cd3%");
        Assertions.assertEquals("11dC2bA3%", result);
    }

    @Test
    public void shouldReturnEmptyStringIfNull() {
        String result = reverse.reverseLetters(null);
        Assertions.assertEquals("", result);
    }
}
