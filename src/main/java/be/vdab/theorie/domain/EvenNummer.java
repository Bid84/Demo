package be.vdab.theorie.domain;

public class EvenNummer {
    private final int nummer;

    public EvenNummer(int nummer) {
        this.nummer = nummer;
    }

    public boolean isEven(){
        return nummer%2 ==0;
    }
}
