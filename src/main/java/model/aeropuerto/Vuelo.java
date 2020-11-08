package model.aeropuerto;


public class Vuelo {

  private int idVuelo;
  private String nroVuelo;
  private int cantAsientos;
  private java.sql.Timestamp fecHsSalida;
  private java.sql.Timestamp fecHsLlegada;
  private int tiempoVuelo;
  private int idAerolinea;
  private int idAeropuertoSalida;
  private int idAeropuertoLlegada;


  public int getIdVuelo() {
    return idVuelo;
  }

  public void setIdVuelo(int idVuelo) {
    this.idVuelo = idVuelo;
  }


  public String getNroVuelo() {
    return nroVuelo;
  }

  public void setNroVuelo(String nroVuelo) {
    this.nroVuelo = nroVuelo;
  }


  public int getCantAsientos() {
    return cantAsientos;
  }

  public void setCantAsientos(int cantAsientos) {
    this.cantAsientos = cantAsientos;
  }


  public java.sql.Timestamp getFecHsSalida() {
    return fecHsSalida;
  }

  public void setFecHsSalida(java.sql.Timestamp fecHsSalida) {
    this.fecHsSalida = fecHsSalida;
  }


  public java.sql.Timestamp getFecHsLlegada() {
    return fecHsLlegada;
  }

  public void setFecHsLlegada(java.sql.Timestamp fecHsLlegada) {
    this.fecHsLlegada = fecHsLlegada;
  }


  public int getTiempoVuelo() {
    return tiempoVuelo;
  }

  public void setTiempoVuelo(int tiempoVuelo) {
    this.tiempoVuelo = tiempoVuelo;
  }


  public int getIdAerolinea() {
    return idAerolinea;
  }

  public void setIdAerolinea(int idAerolinea) {
    this.idAerolinea = idAerolinea;
  }


  public int getIdAeropuertoSalida() {
    return idAeropuertoSalida;
  }

  public void setIdAeropuertoSalida(int idAeropuertoSalida) {
    this.idAeropuertoSalida = idAeropuertoSalida;
  }


  public int getIdAeropuertoLlegada() {
    return idAeropuertoLlegada;
  }

  public void setIdAeropuertoLlegada(int idAeropuertoLlegada) {
    this.idAeropuertoLlegada = idAeropuertoLlegada;
  }

}
