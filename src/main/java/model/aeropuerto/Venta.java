package model.aeropuerto;


import model.cliente.Cliente;

import java.sql.Timestamp;

public class Venta {

  private int idVentas;
  private java.sql.Timestamp fecHsVenta;
  private String formaPago;
  private Cliente cliente;
  private Vuelo vuelo;
  private Aerolinea aerolinea;

  public Venta(int idVentas, Timestamp fecHsVenta, String formaPago, Cliente cliente, Vuelo vuelo, Aerolinea aerolinea) {
    this.idVentas = idVentas;
    this.fecHsVenta = fecHsVenta;
    this.formaPago = formaPago;
    this.cliente = cliente;
    this.vuelo = vuelo;
    this.aerolinea = aerolinea;
  }

  public Venta(Timestamp fecHsVenta, String formaPago, Cliente cliente, Vuelo vuelo, Aerolinea aerolinea) {
    this.fecHsVenta = fecHsVenta;
    this.formaPago = formaPago;
    this.cliente = cliente;
    this.vuelo = vuelo;
    this.aerolinea = aerolinea;
  }

  public int getIdVentas() {
    return idVentas;
  }

  public void setIdVenta(int idVentas) {
    this.idVentas = idVentas;
  }


  public java.sql.Timestamp getFecHsVenta() {
    return fecHsVenta;
  }

  public void setFecHsVenta(java.sql.Timestamp fecHsVenta) {
    this.fecHsVenta = fecHsVenta;
  }


  public String getFormaPago() {
    return formaPago;
  }

  public void setFormaPago(String formaPago) {
    this.formaPago = formaPago;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Vuelo getVuelo() {
    return vuelo;
  }

  public void setVuelo(Vuelo vuelo) {
    this.vuelo = vuelo;
  }

  public Aerolinea getAerolinea() {
    return aerolinea;
  }

  public void setAerolinea(Aerolinea aerolinea) {
    this.aerolinea = aerolinea;
  }

@Override
public String toString() {
	return "Venta [idVentas=" + idVentas + ", fecHsVenta=" + fecHsVenta + ", formaPago=" + formaPago + ", cliente="
			+ cliente + ", vuelo=" + vuelo + ", aerolinea=" + aerolinea + "]";
}
  
  
}
