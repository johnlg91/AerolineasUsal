package model.aeropuerto;


public class Aeropuerto {

  private int idAeropuerto;
  private String codigoAeropuerto;
  private String ciudad;
  private String idPais;
  private int idProvincia;
  private String provinciaOtro;


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


  public String getProvinciaOtro() {
    return provinciaOtro;
  }

  public void setProvinciaOtro(String provinciaOtro) {
    this.provinciaOtro = provinciaOtro;
  }

}
