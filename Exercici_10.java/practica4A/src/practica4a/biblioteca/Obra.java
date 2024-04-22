package practica4a.biblioteca;
public class Obra extends Fitxa {
    private String autor;
    private short nrePags;

    public Obra(String referencia, String titol, String autor, short nrePags) {
        super(referencia, titol);
        this.autor = autor;
        this.nrePags = nrePags;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getNrePags() {
        return nrePags;
    }

    public void setNrePags(short nrePags) {
        this.nrePags = nrePags;
    }

    @Override
    public void visualitzar() {
        super.visualitzar();
        System.out.println("Autor: " + autor);
        System.out.println("Numero de pagines: " + nrePags);
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
        Obra obra = (Obra) obj;
        return nrePags == obra.nrePags && autor.equals(obra.autor);
    }
}
