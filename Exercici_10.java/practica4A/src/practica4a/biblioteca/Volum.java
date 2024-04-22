package practica4a.biblioteca;
public class Volum extends Fitxa {
    private short nro;

    public Volum(String referencia, String titol, short nro) {
        super(referencia, titol);
        this.nro = nro;
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
        Volum volum = (Volum) obj;
        return nro == volum.nro;
    }
}
