package model.cliente;


public class Telefono {

  private int idTelefonos;
  private String personal;
  private String celular;
  private String laboral;


  public Telefono(int idTelefonos, String personal, String celular, String laboral) {
    this.idTelefonos = idTelefonos;
    this.personal = personal;
    this.celular = celular;
    this.laboral = laboral;
  }

  public Telefono(String personal, String celular, String laboral) {
    this.personal = personal;
    this.celular = celular;
    this.laboral = laboral;
  }

  public int getIdTelefonos() {
    return idTelefonos;
  }

  public void setIdTelefonos(int idTelefonos) {
    this.idTelefonos = idTelefonos;
  }


  public String getPersonal() {
    return personal;
  }

  public void setPersonal(String personal) {
    this.personal = personal;
  }


  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }


  public String getLaboral() {
    return laboral;
  }

  public void setLaboral(String laboral) {
    this.laboral = laboral;
  }

}
