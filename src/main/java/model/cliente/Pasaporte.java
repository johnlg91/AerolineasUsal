package model.cliente;


public class Pasaporte {

  private int idPasaportes;
  private int nroPasaporte;
  private String autoridadEmision;
  private java.sql.Date fechaEmision;
  private java.sql.Date fechaVencimiento;
  private String idPais;


  public int getIdPasaportes() {
    return idPasaportes;
  }

  public void setIdPasaportes(int idPasaportes) {
    this.idPasaportes = idPasaportes;
  }


  public int getNroPasaporte() {
    return nroPasaporte;
  }

  public void setNroPasaporte(int nroPasaporte) {
    this.nroPasaporte = nroPasaporte;
  }


  public String getAutoridadEmision() {
    return autoridadEmision;
  }

  public void setAutoridadEmision(String autoridadEmision) {
    this.autoridadEmision = autoridadEmision;
  }


  public java.sql.Date getFechaEmision() {
    return fechaEmision;
  }

  public void setFechaEmision(java.sql.Date fechaEmision) {
    this.fechaEmision = fechaEmision;
  }


  public java.sql.Date getFechaVencimiento() {
    return fechaVencimiento;
  }

  public void setFechaVencimiento(java.sql.Date fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
  }


  public String getIdPais() {
    return idPais;
  }

  public void setIdPais(String idPais) {
    this.idPais = idPais;
  }

}
