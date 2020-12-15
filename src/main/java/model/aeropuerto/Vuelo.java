package model.aeropuerto;


import java.sql.Timestamp;

public class Vuelo {

  private int idVuelo;
  private String nroVuelo;
  private int cantAsientos;
  private java.sql.Timestamp fecHsSalida;
  private java.sql.Timestamp fecHsLlegada;
  private int tiempoVuelo;
  private Aerolinea aerolinea;
  private Aeropuerto aeropuertoSalida;
  private Aeropuerto aeropuertoLlegada;

  public Vuelo(int idVuelo, String nroVuelo, int cantAsientos, Timestamp fecHsSalida, Timestamp fecHsLlegada, int tiempoVuelo, Aerolinea aerolinea, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada) {
    this.idVuelo = idVuelo;
    this.nroVuelo = nroVuelo;
    this.cantAsientos = cantAsientos;
    this.fecHsSalida = fecHsSalida;
    this.fecHsLlegada = fecHsLlegada;
    this.tiempoVuelo = tiempoVuelo;
    this.aerolinea = aerolinea;
    this.aeropuertoSalida = aeropuertoSalida;
    this.aeropuertoLlegada = aeropuertoLlegada;
  }

  public Vuelo(String nroVuelo, int cantAsientos, Timestamp fecHsSalida, Timestamp fecHsLlegada, int tiempoVuelo, Aerolinea aerolinea, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada) {
    this.nroVuelo = nroVuelo;
    this.cantAsientos = cantAsientos;
    this.fecHsSalida = fecHsSalida;
    this.fecHsLlegada = fecHsLlegada;
    this.tiempoVuelo = tiempoVuelo;
    this.aerolinea = aerolinea;
    this.aeropuertoSalida = aeropuertoSalida;
    this.aeropuertoLlegada = aeropuertoLlegada;
  }

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

  public Aerolinea getAerolinea() {
    return aerolinea;
  }

  public void setAerolinea(Aerolinea aerolinea) {
    this.aerolinea = aerolinea;
  }

  public Aeropuerto getAeropuertoSalida() {
    return aeropuertoSalida;
  }

  public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
    this.aeropuertoSalida = aeropuertoSalida;
  }

  public Aeropuerto getAeropuertoLlegada() {
    return aeropuertoLlegada;
  }

  public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
    this.aeropuertoLlegada = aeropuertoLlegada;
  }

@Override
public String toString() {
	return "Vuelo [idVuelo=" + idVuelo + ", nroVuelo=" + nroVuelo + ", cantAsientos=" + cantAsientos + ", fecHsSalida="
			+ fecHsSalida + ", fecHsLlegada=" + fecHsLlegada + ", tiempoVuelo=" + tiempoVuelo + ", aerolinea="
			+ aerolinea + ", aeropuertoSalida=" + aeropuertoSalida + ", aeropuertoLlegada=" + aeropuertoLlegada + "]";
}
  
  
}
