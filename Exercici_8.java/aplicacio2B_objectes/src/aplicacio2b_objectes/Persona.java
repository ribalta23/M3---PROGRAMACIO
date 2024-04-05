package aplicacio2b_objectes;
import java.util.Random;

public class Persona {
    private String nom;
    private int edat;
    private String DNI;
    private char sexe;
    private double pes;
    private double altura;

    public static final char SEXE_DEFECTE = 'H';
    public static final int PES_IDEAL = 0;
    public static final int BAIX_PES = -1;
    public static final int SOBREPES = 1;

    public Persona() {
        this("", 0, SEXE_DEFECTE, 0, 0);
    }

    public Persona(String nom, int edat, char sexe) {
        this(nom, edat, sexe, 0, 0);
    }

    public Persona(String nom, int edat, char sexe, double pes, double altura) {
        this.nom = nom;
        this.edat = edat;
        this.sexe = comprovaSexe(sexe);
        this.pes = pes;
        this.altura = altura;
        this.DNI = generaDNI();
    }

    public int calcularIMC() {
        double imc = pes / (altura * altura);
        if (imc < 18.5) {
            return BAIX_PES;
        } else if (imc >= 18.5 && imc <= 24.9) {
            return PES_IDEAL;
        } else {
            return SOBREPES;
        }
    }

    public boolean esMajorEdat() {
        return edat >= 18;
    }

    private char comprovaSexe(char sexe) {
        if (sexe == 'H' || sexe == 'M') {
            return sexe;
        } else {
            return SEXE_DEFECTE;
        }
    }

    private String generaDNI() {
        Random random = new Random();
        int numeroDNI = 10000000 + random.nextInt(90000000);
        char lletraDNI = calcularLletraDNI(numeroDNI);
        return Integer.toString(numeroDNI) + lletraDNI;
    }

    private char calcularLletraDNI(int dni) {
        char[] lletresDNI = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };
        int index = dni % 23;
        return lletresDNI[index];
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setSexe(char sexe) {
        this.sexe = comprovaSexe(sexe);
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + "\nEdat: " + edat + "\nDNI: " + DNI + "\nSexe: " + sexe + "\nPes: " + pes + " kg\nAltura: " + altura + " m";
    }
}