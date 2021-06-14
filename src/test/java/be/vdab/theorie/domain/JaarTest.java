package be.vdab.theorie.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JaarTest {
    @Test
    void eenJaarDeelbaarDoor400IsEenSchrikkeljaar(){
        var jaar = new Jaar(2000);
         assertThat(jaar.isSchrikkeljaar()).isTrue();
    }
    @Test
    void eenJaarDeebaarDoor100IsGeenSchrikkeljaar(){
        assertThat(new Jaar(1900).isSchrikkeljaar()).isFalse();
    }
    @Test
    @DisplayName("Een jaar deelbaar door 400 ie een schrikkrljaar.")
    void eenJaarDeelbaarDoor4IsSchrikkeljaar(){
        assertThat(new Jaar(2012).isSchrikkeljaar()).isTrue();
    }
    @Test
    void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar(){
        assertThat(new Jaar(2015).isSchrikkeljaar()).isFalse();
    }
    @Test
    void toStringGeeftJaarAlsTekst(){
        assertThat(new Jaar(2015)).hasToString("2015");
    }
    @Test
    void jaartaalMetHetzelfdeJaarZijnGelijk(){
        assertThat(new Jaar(2015)).isEqualTo(new Jaar(2015));
    }
    @Test
    void jaarMetVerschillendejaarZijnNietGelijk(){
        assertThat(new Jaar(2015)).isNotEqualTo(2016);
    }
    @Test
    void hetHashCodeVangelijkeJarenZijnGelijk(){
        assertThat(new Jaar(2015)).hasSameHashCodeAs(new Jaar(2015));
    }

}
