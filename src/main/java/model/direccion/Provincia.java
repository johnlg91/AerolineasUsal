package model.direccion;


public class Provincia {

  private int idProvincia;
  private String nombreProvincia;

  public Provincia(int id, String nombre) {
    idProvincia = id;
    nombreProvincia = nombre;
  }


  public int getIdProvincia() {
    return idProvincia;
  }

  public void setIdProvincia(int idProvincia) {
    this.idProvincia = idProvincia;
  }


  public String getNombreProvincia() {
    return nombreProvincia;
  }

  public void setNombreProvincia(String nombreProvincia) {
    this.nombreProvincia = nombreProvincia;
  }

}
