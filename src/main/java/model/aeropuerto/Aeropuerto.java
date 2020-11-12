package model.aeropuerto;


import model.direccion.Pais;
import model.direccion.Provincia;

public class Aeropuerto {

  private int idAeropuerto;
  private String codigoAeropuerto;
  private String ciudad;
  private Pais pais;
  private Provincia provincia;
  private Provincia provinciaOtro;

  public Aeropuerto(int idAeropuerto, String codigoAeropuerto, String ciudad, Pais pais, Provincia provincia, Provincia provinciaOtro) {
    this.idAeropuerto = idAeropuerto;
    this.codigoAeropuerto = codigoAeropuerto;
    this.ciudad = ciudad;
    this.pais = pais;
    this.provincia = provincia;
    this.provinciaOtro = provinciaOtro;
  }

  public Aeropuerto(String codigoAeropuerto, String ciudad, Pais pais, Provincia provincia, Provincia provinciaOtro) {
    this.codigoAeropuerto = codigoAeropuerto;
    this.ciudad = ciudad;
    this.pais = pais;
    this.provincia = provincia;
    this.provinciaOtro = provinciaOtro;
  }

  public int getIdAeropuerto() {
    return idAeropuerto;
  }

  public void setIdAeropuerto(int idAeropuerto) {
    this.idAeropuerto = idAeropuerto;
  }


  public String getCodigoAeropuerto() {
    return codigoAeropuerto;
  }

  public void setCodigoAeropuerto(String codigoAeropuerto) {
    this.codigoAeropuerto = codigoAeropuerto;
  }


  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
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