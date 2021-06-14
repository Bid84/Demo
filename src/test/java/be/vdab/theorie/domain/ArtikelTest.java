package be.vdab.theorie.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class ArtikelTest {
    @Test
    void prijsVan20EuroArtikelInclusiefBTWis22(){
        assertThat(new Artikel(BigDecimal.valueOf(20),BigDecimal.valueOf(10)).getPrijsINclusiefBTW()).isEqualByComparingTo("22");

    }
}
