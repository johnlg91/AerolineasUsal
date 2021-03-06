package model.aeropuerto;


public class Usuario {

  private int idUsuarios;
  private String nombreUsuario;
  private String clave;
  private String perfil;


  public Usuario(int idUsuarios, String nombreUsuario, String clave, String perfil) {
    this.idUsuarios = idUsuarios;
    this.nombreUsuario = nombreUsuario;
    this.clave = clave;
    this.perfil = perfil;
  }

  public Usuario(String nombreUsuario, String clave, String perfil) {
    this.nombreUsuario = nombreUsuario;
    this.clave = clave;
    this.perfil = perfil;
  }

  public int getIdUsuarios() {
    return idUsuarios;
  }

  public void setIdUsuarios(int idUsuarios) {
    this.idUsuarios = idUsuarios;
  }


  public String getNombreUsuario() {
    return nombreUsuario;
  }

  public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }


  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }


  public String getPerfil() {
    return perfil;
  }

  public void setPerfil(String perfil) {
    this.perfil = perfil;
  }

}
