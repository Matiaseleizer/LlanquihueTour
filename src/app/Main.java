package app;
import model.Direccion;
import model.Contacto;
import model.Guia;
import model.Persona;

public class Main {
    public static void main(String[] args) {

        //DIRECCIONES

        Direccion d1 = new Direccion("Los libertadores", "Las cabras", "Rancagua", "3030000");
        Direccion d2 = new Direccion("Lo chacon", "San pedro", "Melipilla", "9660000");
        Direccion d3 = new Direccion("Los aromos", "Alhue", "Rancagua", "1340000");

        //CONTACTO

        Contacto c1 = new Contacto("41149808", "joseguti@gmail.com");
        Contacto c2 = new Contacto("75266825", "rodrigo.alta@gmail.com");
        Contacto c3 = new Contacto("41149803", "paltamoreno@gmail.com");

        //OBJETOS

        Persona cliente1 = new Persona("Jose", "Gutierrez", "13.234.789-9", d1, c1);
        Persona cliente2 = new Persona("Rodrigo", "Altamira","20.890.453-k", d2, c2);
        Guia guia1 = new Guia("Paola", "Artemis", "12.675.478-0", d3, c3, "Guia turistico");

        //MOSTRAR EN CONSOLA
        System.out.println("Registro de clientes y el Guia que los acompaña ");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(guia1);


        }
    }