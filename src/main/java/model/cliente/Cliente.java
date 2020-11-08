package model.cliente;


public class Cliente {

  private int idCliente;
  private String nombre;
  private String apellido;
  private int dni;
  private int cuitCuil;
  private java.sql.Date fechaNacimiento;
  private String email;
  private int idDireccion;
  private int idTelefono;
  private int idPasaporte;
  private int idPasajeroFrecuente;


  public int getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }


  public int getDni() {
    return dni;
  }

  public void setDni(int dni) {
    this.dni = dni;
  }


  public int getCuitCuil() {
    return cuitCuil;
  }

  public void setCuitCuil(int cuitCuil) {
    this.cuitCuil = cuitCuil;
  }


  public java.sql.Date getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(java.sql.Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public int getIdDireccion() {
    return idDireccion;
  }

  public void setIdDireccion(int idDireccion) {
    this.idDireccion = idDireccion;
  }


  public int getIdTelefono() {
    return idTelefono;
  }

  public void setIdTelefono(int idTelefono) {
    this.idTelefono = idTelefono;
  }


  public int getIdPasaporte() {
    return idPasaporte;
  }

  public void setIdPasaporte(int idPasaporte) {
    this.idPasaporte = idPasaporte;
  }


  public int getIdPasajeroFrecuente() {
    return idPasajeroFrecuente;
  }

  public void setIdPasajeroFrecuente(int idPasajeroFrecuente) {
    this.idPasajeroFrecuente = idPasajeroFrecuente;
  }

}
