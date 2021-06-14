package be.vdab.theorie.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Artikel {
    private final BigDecimal prijsExclusiefBTW;
    private final BigDecimal btwPercentage;

    public Artikel(BigDecimal prijsExclusiefBTW, BigDecimal btwPercentage) {
        this.prijsExclusiefBTW = prijsExclusiefBTW;
        this.btwPercentage = btwPercentage;
    }
    public BigDecimal getPrijsINclusiefBTW(){
        return prijsExclusiefBTW.multiply(BigDecimal.ONE.add(btwPercentage
        .divide(BigDecimal.valueOf(100),2,RoundingMode.HALF_UP)));
    }
}
