package exercici3;

public class Exercici3 {
    public static void main(String[] args) {
        Date date = new Date(4, 5, 2004);
        Date date2 = new Date(5, 10, 9);
        Date date3 = new Date(1, 1, 2024);
        Date date4 = new Date(30, 2, 2020);
        Date date5 = new Date(31, 4, 2020);
        
        if (date.isValid()) {
            System.out.println(date.getDia() + "/" + date.getMes() + "/" + date.getAny());
        } else {
            System.out.println("Data incorrecta");
        }
        
        if (date2.isValid()) {
            System.out.println(date2.getDia() + "/" + date2.getMes() + "/" + date2.getAny());
        } else {
            System.out.println("Data incorrecta");
        }
        
        if (date3.isValid()) {
            System.out.println(date3.getDia() + "/" + date3.getMes() + "/" + date3.getAny());
        } else {
            System.out.println("Data incorrecta");
        }
        
        if (date4.isValid()) {
            System.out.println(date4.getDia() + "/" + date4.getMes() + "/" + date4.getAny());
        } else {
            System.out.println("Data incorrecta");
        }
        if (date5.isValid()) {
            System.out.println(date5.getDia() + "/" + date5.getMes() + "/" + date5.getAny());
        } else {
            System.out.println("Data incorrecta");
        }
        
        date5.setDia(1);
        date5.setMes(1);
        date5.setAny(1);
        
        if (date5.isValid()) {
            System.out.println(date5.getDia() + "/" + date5.getMes() + "/" + date5.getAny());
        } else {
            System.out.println("Data incorrecta");
        }
    }
}
