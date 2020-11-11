package model.direccion;


public class Direccion {

  private int idDireccion;
  private String calle;
  private int altura;
  private String ciudad;
  private int codigoPostal;
  private Pais pais;
  private Provincia provincia;
  private Provincia provinciaOtro;


  public Direccion(int idDireccion, String calle, int altura, String ciudad, int codigoPostal, Pais pais, Provincia provincia, Provincia provinciaOtro) {
    this.idDireccion = idDireccion;
    this.calle = calle;
    this.altura = altura;
    this.ciudad = ciudad;
    this.codigoPostal = codigoPostal;
    this.pais = pais;
    this.provincia = provincia;
    this.provinciaOtro = provinciaOtro;
  }

  public Direccion(String calle, int altura, String ciudad, int codigoPostal, Pais pais, Provincia provincia, Provincia provinciaOtro) {
    this.calle = calle;
    this.altura = altura;
    this.ciudad = ciudad;
    this.codigoPostal = codigoPostal;
    this.pais = pais;
    this.provincia = provincia;
    this.provinciaOtro = provinciaOtro;
  }

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


  public Pais getPais() {
    return pais;
  }

  public void setPais(Pais pais) {
    this.pais = pais;
  }

  public Provincia getProvincia() {
    return provincia;
  }

  public void setProvincia(Provincia provincia) {
    this.provincia = provincia;
  }

  public Provincia getProvinciaOtro() {
    return provinciaOtro;
  }

  public void setProvinciaOtro(Provincia provinciaOtro) {
    this.provinciaOtro = provinciaOtro;
  }
}
