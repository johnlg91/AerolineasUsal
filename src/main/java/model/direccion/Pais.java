package model.direccion;


public class Pais {

    private int idPais;
    private String codigoPais;
    private String nombrePais;
    private Integer codigoTelefono;


    public Pais(int idPais, String codigoPais, String nombrePais, Integer codigoTelefono) {
        this.idPais = idPais;
        this.codigoPais = codigoPais;
        this.nombrePais = nombrePais;
        this.codigoTelefono = codigoTelefono;
    }

    public Pais(String codigoPais, String nombrePais, Integer codigoTelefono) {
        this.codigoPais = codigoPais;
        this.nombrePais = nombrePais;
        this.codigoTelefono = codigoTelefono;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public Integer getCodigoTelefono() {
        return codigoTelefono;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    @Override
    public String toString() {
        return "Pais{" +
                idPais +
                ", codigo='" + codigoPais + '\'' +
                ", nombre='" + nombrePais + '\'' +
                ", codigoTelefono=" + codigoTelefono +
                '}';
    }
}
