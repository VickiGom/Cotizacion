/*
 Victor Gomez Lizarraga
 */
package unidad1;


public class Cotizacion {
    private int numeroCotizacion;
    private String descripcion;
    private double precio;
    private int porcentaje;
    private int plazo;
    
        //Constructor vacio
    public Cotizacion() {
        this.numeroCotizacion = 0123;
        this.descripcion = "Yaris SX";
        this.precio = 220000;
        this.porcentaje = 25;
        this.plazo = 36;
                
    }
        //Constructor parametros
    public Cotizacion(int numeroCotizacion, String descripcion, double precio, int porcentaje, int plazo) {
        this.numeroCotizacion = numeroCotizacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.porcentaje = porcentaje;
        this.plazo = plazo;
    }
        //Constructor copia
    public Cotizacion(Cotizacion cotizacion){
        this.numeroCotizacion = cotizacion.numeroCotizacion;
        this.descripcion = cotizacion.descripcion;
        this.precio = cotizacion.precio;
        this.porcentaje = cotizacion.porcentaje;
        this.plazo = cotizacion.plazo;
    }
     //get y set

    public int getNumeroCotizacion() {
        return numeroCotizacion;
    }

    public void setNumeroCotizacion(int numeroCotizacion) {
        this.numeroCotizacion = numeroCotizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    public double pagoInicial(){   
        return ((this.precio)/(100/this.porcentaje));
    }
    public double totalFinanciar(){
        double por = (100 - this.porcentaje);
        return ((this.precio)/(100/por));
    }
    public double pagoMensual(){
        return totalFinanciar() / this.plazo;
    }
    
}
