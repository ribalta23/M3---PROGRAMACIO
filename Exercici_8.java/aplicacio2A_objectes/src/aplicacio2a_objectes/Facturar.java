package aplicacio2a_objectes;

public class Facturar {
    private int cantidad;
    private double precio;
    public Facturar() {
        cantidad = 0;
        precio = 0.0;
    }
    public Facturar(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularVenta() {
        double subtotal = cantidad * precio;
        double iva = subtotal * 0.21;
        double total = subtotal + iva;
        return total;
    }
}
