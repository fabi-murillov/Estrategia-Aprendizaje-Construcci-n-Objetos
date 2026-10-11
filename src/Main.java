public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Romario", "Salas Cerdas", "1-1111-1111", "Masculino", "Heredia");
        Cliente cliente2 = new Cliente("Fabiola", "Murillo Vásquez", "2-2222-2222", "San José");
        Cliente cliente3 = new Cliente();

        Suscripcion suscripcion1 = new Suscripcion("Premium", 10000, 1);
        Suscripcion suscripcion2 = new Suscripcion("Familiar", 5000, 1);
        Suscripcion suscripcion3 = new Suscripcion("Estudiante", 1500, 12);

        cliente1.suscribirse(suscripcion1);
        cliente2.suscribirse(suscripcion2);
        cliente3.suscribirse(new Suscripcion("Mini", 2990, 1));


        System.out.println(cliente1);
        System.out.println(suscripcion1);
    }


}
