package UF4.Jocs;

public class JocDau {
    Dau dau1;
    Dau dau2;
    Dau dau3;

    public JocDau(Dau dau1, Dau dau2, Dau dau3) {
        this.dau1 = dau1;
        this.dau2 = dau2;
        this.dau3 = dau3;
    }

    int contadorPartidaGuanyada;
    int contadorPartidaJugada;

    public void jugar(){
        dau1.llençar();
        dau2.llençar();
        dau3.llençar();

        if (dau1.equals(dau2) && dau2.equals(dau3)){
            contadorPartidaGuanyada++;
            contadorPartidaJugada++;
        } else {
            contadorPartidaJugada++;
        }
    }
    }

