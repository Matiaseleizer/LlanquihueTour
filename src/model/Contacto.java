package model;

public class Contacto {

    //ATRIBUTOS

    private String numeroTelefono;
    private String email;

    //CONSTRUCTOR

    public Contacto(String numeroTelefono, String email) {
        this.numeroTelefono = numeroTelefono;
        this.email = email;
    }

    //GETTER & SETTER


    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //TO STRING


    @Override
    public String toString() {
        return "contacto{" +
                "numeroTelefono='" + numeroTelefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
