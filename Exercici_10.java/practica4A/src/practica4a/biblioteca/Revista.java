package practica4a.biblioteca;
public class Revista extends Fitxa {
    private short any;
    private short nro;

    public Revista(String referencia, String titol, short any, short nro) {
        super(referencia, titol);
        this.any = any;
        this.nro = nro;
    }

    public short getAny() {
        return any;
    }

    public void setAny(short any) {
        this.any = any;
    }

    public short getNro() {
        return nro;
    }

    public void setNro(short nro) {
        this.nro = nro;
    }

    @Override
    public void visualitzar() {
        super.visualitzar();
        System.out.println("Any: " + any);
        System.out.println("Numero: " + nro);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Revista revista = (Revista) obj;
        return any == revista.any && nro == revista.nro;
    }
}
