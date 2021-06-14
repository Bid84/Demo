package be.vdab.theorie.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {
    @Test
    void eenInchIs2Komma54Centimeter(){
        assertThat(new Converter().inchesNaarCEntimeters(BigDecimal.ONE)).isEqualByComparingTo("2.54");
    }
    @Test
    void tweehonderdInchesIs508Centimeters(){
        assertThat(new Converter().inchesNaarCEntimeters(BigDecimal.valueOf(200))).isEqualByComparingTo("508");
    }
}
