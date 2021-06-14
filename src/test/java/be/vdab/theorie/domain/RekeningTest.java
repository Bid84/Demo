package be.vdab.theorie.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class RekeningTest {
    private Rekening rekening;
    @BeforeEach
    void beforeEach(){
        rekening = new Rekening();
    }

    @Test
    void hetSaldoVanEenNieuweRekeningIsZero() {
        assertThat(rekening.getSaldo()).isZero();
    }
    @Test
    void nadatJe10EuroStortisHetSaldo10€(){
       rekening.stort(BigDecimal.TEN);
       assertThat(rekening.getSaldo()).isEqualByComparingTo("10");
    }
    @Test
    void nadatJe10€en1€StortIsHetSaldo11€(){
        rekening.stort(BigDecimal.ONE);
        rekening.stort(BigDecimal.TEN);
        assertThat(rekening.getSaldo()).isEqualByComparingTo("11");
    }
}