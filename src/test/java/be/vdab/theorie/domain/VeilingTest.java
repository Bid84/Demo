package be.vdab.theorie.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
class VeilingTest {
    private Veiling veiling;
    @BeforeEach
    void beforeEach(){
        veiling =new Veiling();
    }

    @Test
    void zeroAlsHoogsteBodALsGeenBodIs() {
        assertThat(veiling.getHoogsteBod()).isZero();
    }
    @Test
    void duizendAlsHoogsteBodAlsBodIs1000(){
        veiling.doeBod(BigDecimal.valueOf(1000));
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("1000");

    }
    @Test
    void tweeDuizendAlsTweedeBod(){
        veiling.doeBod(BigDecimal.valueOf(1000));
        veiling.doeBod(BigDecimal.valueOf(2000));
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("2000");
    }

}