package model.cliente;


import model.direccion.Pais;

import java.sql.Date;

public class Pasaporte {

  private int idPasaportes;
  private int nroPasaporte;
  private String autoridadEmision;
  private java.sql.Date fechaEmision;
  private java.sql.Date fechaVencimiento;
  private Pais pais;

  public Pasaporte(int idPasaportes, int nroPasaporte, String autoridadEmision, Date fechaEmision, Date fechaVencimiento, Pais pais) {
    this.idPasaportes = idPasaportes;
    this.nroPasaporte = nroPasaporte;
    this.autoridadEmision = autoridadEmision;
    this.fechaEmision = fechaEmision;
    this.fechaVencimiento = fechaVencimiento;
    this.pais = pais;
  }

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


  public Pais getPais() {
    return pais;
  }

  public void setPais(Pais pais) {
    this.pais = pais;
  }

@Override
public String toString() {
	return "Pasaporte [idPasaportes=" + idPasaportes + ", nroPasaporte=" + nroPasaporte + ", autoridadEmision="
			+ autoridadEmision + ", fechaEmision=" + fechaEmision + ", fechaVencimiento=" + fechaVencimiento + ", pais="
			+ pais + "]";
}
  
  
  
}
