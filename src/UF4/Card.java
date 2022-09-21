package UF4;

public class Card {
    private int num;
    private String pal;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPal() {
        return pal;
    }

    public void setPal(String pal) {
        this.pal = pal;
    }

    @Override
    public String toString() {
        return "Card{" +
                "num=" + num +
                ", pal='" + pal + '\'' +
                '}';
    }
}
