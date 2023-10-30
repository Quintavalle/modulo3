
interface Forma {
    double calcolaArea();
}

class Rettangolo implements Forma {
    private double lunghezza;
    private double larghezza;

    public Rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    @Override
    public double calcolaArea() {
        return lunghezza * larghezza;
    }
}

class Triangolo implements Forma {
    private double base;
    private double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return 0.5 * base * altezza;
    }
}

public class EsempioForme {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(5.0, 3.0);
        Triangolo triangolo = new Triangolo(4.0, 6.0);

        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Area del triangolo: " + triangolo.calcolaArea());
    }
}
