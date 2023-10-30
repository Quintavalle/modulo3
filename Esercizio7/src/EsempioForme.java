
enum TipoForma {
    TRIANGOLO, RETTANGOLO
}

class Forma {
    private TipoForma tipo;

    public Forma(TipoForma tipo) {
        this.tipo = tipo;
    }

    public void calcolaArea() {
        switch (tipo) {
            case TRIANGOLO:
                System.out.println("Calcolo dell'area di un triangolo");
                // Implementazione specifica per il calcolo dell'area di un triangolo
                break;
            case RETTANGOLO:
                System.out.println("Calcolo dell'area di un rettangolo");
                // Implementazione specifica per il calcolo dell'area di un rettangolo
                break;
            default:
                System.out.println("Tipo di forma non riconosciuto");
        }
    }
}

class Triangolo extends Forma {
    public Triangolo() {
        super(TipoForma.TRIANGOLO);
    }
}

class Rettangolo extends Forma {
    public Rettangolo() {
        super(TipoForma.RETTANGOLO);
    }
}

public class EsempioForme {
    public static void main(String[] args) {

        Triangolo triangolo = new Triangolo();
        Rettangolo rettangolo = new Rettangolo();

        triangolo.calcolaArea();
        rettangolo.calcolaArea();
    }
}
