package model.cliente;


public class PasajeroFrecuente {

  private int idPasajeroFrecuente;
  private String alianza;
  private int numero;
  private String categoria;
  private int idAerolinea;


  public int getIdPasajeroFrecuente() {
    return idPasajeroFrecuente;
  }

  public void setIdPasajeroFrecuente(int idPasajeroFrecuente) {
    this.idPasajeroFrecuente = idPasajeroFrecuente;
  }


  public String getAlianza() {
    return alianza;
  }

  public void setAlianza(String alianza) {
    this.alianza = alianza;
  }


  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }


  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }


  public int getIdAerolinea() {
    return idAerolinea;
  }

  public void setIdAerolinea(int idAerolinea) {
    this.idAerolinea = idAerolinea;
  }

}
