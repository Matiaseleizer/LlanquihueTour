package model;

public class Persona {

    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private String rut;
    private Direccion domicilio;
    private Contacto contacto;

    //CONSTRUCTOR

    public Persona(String nombre, String apellido, String rut, Direccion domicilio, Contacto contacto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.domicilio = domicilio;
        this.contacto = contacto;

    }

    public Persona() {}

    //GETTER & SETTER


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    public Contacto getContacto() {return contacto;}

    public void setContacto(Contacto contacto) {this.contacto = contacto;}

    //TO STRING

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut='" + rut + '\'' +
                ", domicilio=" + domicilio +
                ", contacto=" + contacto +
                '}';
    }
}
