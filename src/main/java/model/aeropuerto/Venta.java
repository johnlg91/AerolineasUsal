package model.aeropuerto;


public class Venta {

  private int idVentas;
  private java.sql.Timestamp fecHsVenta;
  private String formaPago;
  private int idCliente;
  private int idVuelo;
  private int idAerolinea;


  public int getIdVentas() {
    return idVentas;
  }

  public void setIdVentas(int idVentas) {
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


  public int getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }


  public int getIdVuelo() {
    return idVuelo;
  }

  public void setIdVuelo(int idVuelo) {
    this.idVuelo = idVuelo;
  }


  public int getIdAerolinea() {
    return idAerolinea;
  }

  public void setIdAerolinea(int idAerolinea) {
    this.idAerolinea = idAerolinea;
  }

}
