package be.vdab.theorie.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EvenNummerTest {
    @Test
    void nummer6isEvenNummer(){
        var nummer = new EvenNummer(6);
        assertThat(nummer.isEven()).isTrue();

    }
    @Test
    void nummer7isGeenEvenNummer(){
        var nummer =new EvenNummer(7);
        assertThat(nummer.isEven()).isFalse();
    }
}
