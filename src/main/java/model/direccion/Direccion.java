package model.direccion;


public class Direccion {

  private int idDireccion;
  private String calle;
  private int altura;
  private String ciudad;
  private int codigoPostal;
  private String idPais;
  private int idProvincia;
  private int provinciaOtro;


  public int getIdDireccion() {
    return idDireccion;
  }

  public void setIdDireccion(int idDireccion) {
    this.idDireccion = idDireccion;
  }


  public String getCalle() {
    return calle;
  }

  public void setCalle(String calle) {
    this.calle = calle;
  }


  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }


  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }


  public int getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(int codigoPostal) {
    this.codigoPostal = codigoPostal;
  }


  public String getIdPais() {
    return idPais;
  }

  public void setIdPais(String idPais) {
    this.idPais = idPais;
  }


  public int getIdProvincia() {
    return idProvincia;
  }

  public void setIdProvincia(int idProvincia) {
    this.idProvincia = idProvincia;
  }


  public int getProvinciaOtro() {
    return provinciaOtro;
  }

  public void setProvinciaOtro(int provinciaOtro) {
    this.provinciaOtro = provinciaOtro;
  }

}
