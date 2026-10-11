public class Suscripcion {
    //Atributos
    private String tipo;
    private double costo;
    private int periodicidad;

    //Métodos
    //Constructor completo
    Suscripcion(String tipo, double costo, int periodicidad) {
        this.tipo = tipo;
        this.costo = costo;
        this.periodicidad = periodicidad;
    }

    //Getters
    public String getTipo(){
        return tipo;
    }

    public double getCosto(){
        return costo;
    }

    public int getPeriodicidad(){
        return periodicidad;
    }

    //Setters
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setCosto(double costo){
        this.costo = costo;
    }

    public void setPeriocidad(int periodicidad){
        this.periodicidad = periodicidad;
    }

    //equals()
    public boolean equals(Suscripcion suscripcion) {
        return this.tipo.equals(suscripcion.tipo) && (this.costo == suscripcion.costo) && (this.periodicidad == suscripcion.periodicidad);
    }

    //toString
    public String toString(){
        return "Tipo: " + tipo + "\nCosto: " + costo + "\nPeriodicidad: " + periodicidad + "\n";
    }

}
