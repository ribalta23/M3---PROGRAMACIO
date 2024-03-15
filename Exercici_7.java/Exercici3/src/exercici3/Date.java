package exercici3;

public class Date {
    private int dia;
    private int mes;
    private int any;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAny() {
        return any;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAny(int any) {
        this.any = any;
    }
    
    public Date(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }
    
    public boolean isValid() {
        if (mes < 1 || mes > 12) {
            return false;
        }
        
        if (dia < 1 || dia > diesDelMes(mes)) {
            return false;
        }
        
        return true;
    }
    
    private int diesDelMes(int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (anyDeTraspas()) ? 29 : 28;
            default:
                return -1;
        }
    }
    
    private boolean anyDeTraspas() {
        return (any % 4 == 0 && any % 100 != 0) || (any % 400 == 0);
    }
}
