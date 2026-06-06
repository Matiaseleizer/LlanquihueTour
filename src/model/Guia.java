package model;

public class Guia extends Persona {
    //ATRIBUTO

    private String cargo;

    //CONSTRUCTOR

    public Guia(String cargo) {
        this.cargo = cargo;
    }

    public Guia(String nombre, String apellido, String rut, Direccion domicilio, Contacto contacto, String cargo){
        super(nombre,apellido,rut,domicilio,contacto);
        this.cargo = cargo;
    }

    //GETTER & SETTER


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Guia(){}


    @Override
    public String toString() {
        return super.toString() + " -> guia{cargo='" + cargo + "'}";
    }
}
