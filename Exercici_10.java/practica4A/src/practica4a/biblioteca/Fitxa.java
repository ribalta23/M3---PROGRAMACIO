package practica4a.biblioteca;

public class Fitxa {
    private String referencia;
    private String titol;

    public Fitxa(String referencia, String titol) {
        this.referencia = referencia;
        this.titol = titol;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void visualitzar() {
        System.out.println("Referencia: " + referencia);
        System.out.println("Titol: " + titol);
    }

    @Override
    public String toString() {
        return referencia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fitxa fitxa = (Fitxa) obj;
        return referencia.equals(fitxa.referencia);
    }
}
