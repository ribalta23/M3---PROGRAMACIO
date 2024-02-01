// aleix ribalta
package examen4d_2023_24;
import java.util.Scanner;
/**
 *
 * @author aleix
 */
public class Examen4d_2023_24 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int menu = 0, dia = 0, mes = 0, any = 0, dia2 = 0, mes2 = 0, any2 = 0, dia3 = 1, mes3 = 1, any3 = 1900;
        do{
            System.out.println("--------------------------------------------------");
            System.out.println("1. Entrar data format enter");
            System.out.println("2. Entrar data format String");
            System.out.println("3. Entrar dies");
            System.out.println("4. Sortir");
            System.out.println("--------------------------------------------------");
            menu = lec.nextInt();

            if(menu == 1){
                System.out.println("--------------------------------------------------");
                System.out.print("Entra un dia: ");
                dia = lec.nextInt();
                System.out.print("Entra un mes: ");
                mes = lec.nextInt();
                System.out.print("Entra un any: ");
                any = lec.nextInt();
                String data1 = Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(any);
                System.out.println(data1);
            } else if(menu == 2){
                System.out.println("--------------------------------------------------");
                System.out.print("Entra una data en format dd/mm/aaaa: ");
                String data2 = lec.next();
                dia2 = Integer.parseInt(data2.substring(0, 2));
                mes2 = Integer.parseInt(data2.substring(3, 5));
                any2 = Integer.parseInt(data2.substring(6, 10));
                System.out.println(dia2+"/"+mes2+"/"+any2);
            } else if(menu == 3){
                System.out.println("--------------------------------------------------");
                System.out.print("Entra un numero de dies: ");
                int dies = lec.nextInt();
                int anys = 0;
                while (dies >= 365) {
                    dies -= 365;
                    anys++;
                }
                int mesos = 0;
                while (dies >= 30) {
                    dies -= 30;
                    mesos++;
                }
                int diesTotals = dia3 + dies;
                int mesosTotals = mes3 + mesos;
                int anysTotals = any3 + anys;
                System.out.println("Serie el any: "+diesTotals+"/"+mesosTotals+"/"+anysTotals);
            }
            else if(menu > 4){
                System.out.println("--------------------------------------------------");
                System.out.println("Opcio incorrecta, torna a probar.");
            }
        } while(menu != 4);
    }
    
}
