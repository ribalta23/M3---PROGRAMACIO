package practica3a;
public class Cataleg {
    private int identif;
    private String titol;
    private String autor;
    private String edit;
    private double preu;
    
    public Cataleg(int identif, String titol, String autor, String edit, double preu) {
        this.identif = identif;
        this.titol = titol;
        this.autor = autor;
        this.edit = edit;
        this.preu = preu;
    }
    
    public int getIdentif() {
        return identif;
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public String getEdit() {
        return edit;
    }

    public double getPreu() {
        return preu;
    }
}
