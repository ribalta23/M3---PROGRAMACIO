package practica3b;
public class Venedor {
    private String nom;
    private String primer_cognom;
    private String zona;
    private double[] imp_vendes;
    
    public Venedor(String nom, String primerCognom, String zona, double[] impVendes) {
        this.nom = nom;
        this.primer_cognom = primerCognom;
        this.zona = zona;
        this.imp_vendes = impVendes;
    }
    
    public String getNom() {
        return nom;
    }

    public String getPrimerCognom() {
        return primer_cognom;
    }

    public String getZona() {
        return zona;
    }

    public double[] getImpVendes() {
        return imp_vendes;
    }
    
    public double calcMitjana() {
        double sum = 0;
        for (double imp : imp_vendes) {
            sum += imp;
        }
        return sum / imp_vendes.length;
    }
}
