package model;

public class Direccion {

    //ATRIBUTOS

    private String calle;
    private String comuna;
    private String ciudad;
    private String codigoPostal;

    public Direccion(){

    }

    //CONSTRUCTOR

    public Direccion(String calle, String comuna, String ciudad, String codigoPostal){
        this.calle = calle;
        this.comuna = comuna;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    //GETTER & SETTER

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle){
        this.calle = calle;
    }
    public String getComuna(){
        return comuna;
    }
    public void setComuna(String comuna){
        this.comuna = comuna;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    //TO STRING

    @Override
    public String toString() {
        return "direccion{" +
                "calle='" + calle + '\'' +
                ", comuna='" + comuna + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }
}
