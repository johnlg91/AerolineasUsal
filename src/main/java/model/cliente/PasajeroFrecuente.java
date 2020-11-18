package model.cliente;


import model.aeropuerto.Aerolinea;

public class PasajeroFrecuente {

  private int idPasajeroFrecuente;
  private String alianza;
  private int numero;
  private String categoria;
  private Aerolinea aerolinea;

  public PasajeroFrecuente(int idPasajeroFrecuente, String alianza, int numero, String categoria, Aerolinea aerolinea) {
    this.idPasajeroFrecuente = idPasajeroFrecuente;
    this.alianza = alianza;
    this.numero = numero;
    this.categoria = categoria;
    this.aerolinea = aerolinea;
  }

  public PasajeroFrecuente(String alianza, int numero, String categoria, Aerolinea aerolinea) {
    this.alianza = alianza;
    this.numero = numero;
    this.categoria = categoria;
    this.aerolinea = aerolinea;
  }

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


  public Aerolinea getAerolinea() {
    return aerolinea;
  }

  public void setAerolinea(Aerolinea aerolinea) {
    this.aerolinea = aerolinea;
  }

@Override
public String toString() {
	return "PasajeroFrecuente [idPasajeroFrecuente=" + idPasajeroFrecuente + ", alianza=" + alianza + ", numero="
			+ numero + ", categoria=" + categoria + ", aerolinea=" + aerolinea + "]";
}
  
}
