package model.aeropuerto;


public class Aerolinea {

  private int idAerolinea;
  private String nombreAerolinea;
  private Alianza alianza;


  public Aerolinea(int idAerolinea, String nombreAerolinea, Alianza alianza) {
    this.idAerolinea = idAerolinea;
    this.nombreAerolinea = nombreAerolinea;
    this.alianza = alianza;
  }

  public Aerolinea(String nombreAerolinea, Alianza alianza) {
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


  public Alianza getAlianza() {
    return alianza;
  }

  public void setAlianza(Alianza alianza) {
    this.alianza = alianza;
  }

}
