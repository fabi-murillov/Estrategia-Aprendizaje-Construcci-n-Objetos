public class Cliente {
    //Atributos
    private String nombre;
    private String apellidos;
    private String cedula;
    private String sexo;
    private String ubicacion;

    //Métodos
    //Constructor completo: inicializa todos los atributos
    Cliente(String nombre, String apellidos, String cedula, String sexo, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }

    //Constructor parcial: inicializa todo menos el sexo
    Cliente(String nombre, String apellidos, String cedula, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sexo = null;
        this.ubicacion = ubicacion;
    }

    //Constructor por defecto: no inicializa ningún atributo
    Cliente() {
    }

    //Método que conecta al cliente con una suscripción
    void suscribirse(Suscripcion suscripcion) {
        System.out.println(this.nombre + " " + this.apellidos + " adquirió una suscripción " + suscripcion.getTipo()+ ".");
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public String getCedula(){
        return cedula;
    }

    public String getSexo(){
        return sexo;
    }

    public String getUbicacion(){
        return ubicacion;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    //equals()
    public boolean equals(Cliente cliente) {
        return this.cedula.equals(cliente.cedula);
    }

    //toString
    public String toString(){
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nCédula: " + cedula + "\nSexo: " + sexo + "\nUbicación: " + ubicacion + "\n";
    }
}