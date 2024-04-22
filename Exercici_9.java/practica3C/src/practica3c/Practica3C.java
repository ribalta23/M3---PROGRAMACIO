package practica3c;
import java.util.Scanner;
public class Practica3C {
    public static void main(String[] args) {
        Empresa[] empreses = new Empresa[10];
        for (int i = 0; i < empreses.length; i++) {
            empreses[i] = new Empresa();
        }
        int numeroMenu;
        Scanner lec = new Scanner(System.in);
        System.out.println("1. Introduir dades empresa: ");
        System.out.println("2. Veure empreses: ");
        System.out.println("3. Veure una empresa: ");
        System.out.println("4. Borrar una empresa: ");
        System.out.println("5. Borrar tot: ");
        System.out.println("6. Sortir: ");
        do{
            System.out.println("-----------------------------");
            numeroMenu = lec.nextInt();
            if(numeroMenu == 1){
                introduirDades(empreses, lec);
            } else if(numeroMenu == 2){
                mostrarDadesEmpreses(empreses);
            } else if(numeroMenu == 3){
                mostrarDadesEmpresa(empreses, lec);
            } else if(numeroMenu == 4){
                borrarDadesEmpresa(empreses, lec);
            } else if(numeroMenu == 5){
                borrarDadesEmpreses(empreses);
            } else if(numeroMenu == 6){
                System.out.println("Adeu");
            } else{
                System.out.println("-----------------------------");
                System.out.println("No valid torna a probar");
                System.out.println("-----------------------------");
            }
        } while(numeroMenu != 6);
    }
    
    public static void introduirDades(Empresa[] empreses, Scanner lec){
        String nom;
        String adreça;
        String telefon;
        System.out.print("Quina empresa vols modificar (0 - 9): ");
        int empresaNum = lec.nextInt();
        System.out.println("Modificar empresa: "+empresaNum);
        lec.nextLine();
        System.out.println("Introdueix el nom de l'empresa: ");
        nom = lec.nextLine();
        System.out.println("Introdueix l'adresa de l'empresa: ");
        adreça = lec.nextLine();
        System.out.println("Introdueix el telefon de l'empresa: ");
        telefon = lec.nextLine();
        empreses[empresaNum].setNom(nom);
        empreses[empresaNum].setAdreca(adreça);
        empreses[empresaNum].setTelefon(telefon);
    }
    
    public static void mostrarDadesEmpreses(Empresa[] empreses){
        for(int i = 0; i < 10; i++){
            String nom = empreses[i].getNom();
            String adreça = empreses[i].getAdreça();
            String telefon = empreses[i].getTelefon();
            
            System.out.println("Dades empresa "+(i + 1)+": ");
            System.out.println("Nom: "+nom);
            System.out.println("Adresa: "+adreça);
            System.out.println("Telefon: "+telefon);
        }
    }
    public static void mostrarDadesEmpresa(Empresa[] empreses, Scanner lec){
        System.out.print("Quina empresa vols veure (0 - 9): ");
        int empresaNum = lec.nextInt();
        String nom = empreses[empresaNum].getNom();
        String adreça = empreses[empresaNum].getAdreça();
        String telefon = empreses[empresaNum].getTelefon();

        System.out.println("Dades empresa "+(empresaNum)+": ");
        System.out.println("Nom: "+nom);
        System.out.println("Adresa: "+adreça);
        System.out.println("Telefon: "+telefon);
        
    }
    public static void borrarDadesEmpresa(Empresa[] empreses, Scanner lec){
        System.out.print("Quina empresa vols borrar (0 - 9): ");
        int empresaNum = lec.nextInt();
        empreses[empresaNum].setNom(null);
        empreses[empresaNum].setAdreca(null);
        empreses[empresaNum].setTelefon(null);
        System.out.println("Dades borrades");
    }
    public static void borrarDadesEmpreses(Empresa[] empreses){
        for(int i = 0; i < 10; i++){
            empreses[i].setNom(null);
            empreses[i].setAdreca(null);
            empreses[i].setTelefon(null);
            System.out.println("Dades borrades");
        }
    }
    
}
