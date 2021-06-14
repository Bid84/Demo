package be.vdab.theorie.domain;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WoordTest {
    @Test
    void isWoordEenPalkindrome(){
        assertThat(new Woord("lepel").isPalindrome()).isTrue();
    }
    @Test
    void isWoordNotPalindrome(){
        assertThat(new Woord("apple").isPalindrome()).isFalse();
    }
    @Test
    void eenLegeStringIsPalindroom(){
        assertThat(new Woord(" ").isPalindrome()).isTrue();
    }

}
