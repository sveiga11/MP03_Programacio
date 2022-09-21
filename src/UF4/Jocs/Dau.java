package UF4.Jocs;

import java.util.Objects;

public class Dau {
    int valorDau;

    public int getValorDau() {
        return valorDau;
    }

    public void setValorDau(int valorDau) {
        this.valorDau = valorDau;
    }

    @Override
    public String toString() {
        return "Dau{" +
                "valorDau=" + valorDau +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dau dau = (Dau) o;
        return valorDau == dau.valorDau;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valorDau);
    }

    public void llençar(){
        valorDau = (int)(Math.random()*6 + 1);
    }
}
