package javaapplication10;
public class ClasseA {
    private int valorPrimari;
    private int valorSecundari;

    public ClasseA(){
        this.valorPrimari = 5;
        this.valorSecundari = 10;
    }
    
    public ClasseA(int vp){
        this.valorPrimari = vp;
        this.valorSecundari = 10;
    }
    public ClasseA(int vp, int vs){
        this.valorPrimari = vp;
        this.valorSecundari = vs;
    }

    public int getPrimari() {
        return valorPrimari;
    }

    public int getSecundari() {
        return valorSecundari;
    }
}
