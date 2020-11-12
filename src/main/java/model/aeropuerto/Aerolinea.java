package model.aeropuerto;


public class Aerolinea {

  private int idAerolinea;
  private String nombreAerolinea;
  private String alianza;


  public Aerolinea(int idAerolinea, String nombreAerolinea, String alianza) {
    this.idAerolinea = idAerolinea;
    this.nombreAerolinea = nombreAerolinea;
    this.alianza = alianza;
  }

  public Aerolinea(String nombreAerolinea, String alianza) {
    this.nombreAerolinea = nombreAerolinea;
    this.alianza = alianza;
  }

  public int getIdAerolinea() {
    return idAerolinea;
  }

  public void setIdAerolinea(int idAerolinea) {
    this.idAerolinea = idAerolinea;
  }


  public String getNombreAerolinea() {
    return nombreAerolinea;
  }

  public void setNombreAerolinea(String nombreAerolinea) {
    this.nombreAerolinea = nombreAerolinea;
  }


  public String getAlianza() {
    return alianza;
  }

  public void setAlianza(String alianza) {
    this.alianza = alianza;
  }

}
