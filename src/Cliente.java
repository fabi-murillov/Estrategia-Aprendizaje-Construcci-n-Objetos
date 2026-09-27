public class Cliente {
    //Atributos
    String nombre;
    String apellidos;
    String cedula;
    String sexo;
    String ubicacion;

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
        System.out.println(this.nombre + " " + this.apellidos + " adquirió una suscripción " + suscripcion.tipo + ".");
    }

}
