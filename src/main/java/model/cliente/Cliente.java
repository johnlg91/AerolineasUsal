package model.cliente;


import model.direccion.Direccion;

import java.sql.Date;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class Cliente {

  private int idCliente;
  private String nombre;
  private String apellido;
  private int dni;
  private int cuitCuil;
  private java.sql.Date fechaNacimiento;
  private String email;
  private Direccion direccion;
  private Telefono telefono;
  private Pasaporte pasaporte;
  private PasajeroFrecuente pasajeroFrecuente;

  public Cliente(int idCliente, String nombre, String apellido, int dni, int cuitCuil, Date fechaNacimiento, String email, Direccion direccion, Telefono telefono, Pasaporte pasaporte, PasajeroFrecuente pasajeroFrecuente) {
    this.idCliente = idCliente;
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.cuitCuil = cuitCuil;
    this.fechaNacimiento = fechaNacimiento;
    this.email = email;
    this.direccion = direccion;
    this.telefono = telefono;
    this.pasaporte = pasaporte;
    this.pasajeroFrecuente = pasajeroFrecuente;
  }

  public Cliente(String nombre, String apellido, int dni, int cuitCuil, Date fechaNacimiento, String email, Direccion direccion, Telefono telefono, Pasaporte pasaporte, PasajeroFrecuente pasajeroFrecuente) {
    requireNonNull(direccion);
    requireNonNull(telefono);
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.cuitCuil = cuitCuil;
    this.fechaNacimiento = fechaNacimiento;
    this.email = email;
    this.direccion = direccion;
    this.telefono = telefono;
    this.pasaporte = pasaporte;
    this.pasajeroFrecuente = pasajeroFrecuente;
  }

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


  public Direccion getDireccion() {
    return direccion;
  }

  public void setDireccion(Direccion direccion) {
    this.direccion = direccion;
  }

  public Telefono getTelefono() {
    return telefono;
  }

  public void setTelefono(Telefono telefono) {
    this.telefono = telefono;
  }

  public Pasaporte getPasaporte() {
    return pasaporte;
  }

  public void setPasaporte(Pasaporte pasaporte) {
    this.pasaporte = pasaporte;
  }

  public PasajeroFrecuente getPasajeroFrecuente() {
    return pasajeroFrecuente;
  }

  public void setPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) {
    this.pasajeroFrecuente = pasajeroFrecuente;
  }

@Override
public String toString() {
	return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
			+ ", cuitCuil=" + cuitCuil + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", direccion="
			+ direccion + ", telefono=" + telefono + ", pasaporte=" + pasaporte + ", pasajeroFrecuente="
			+ pasajeroFrecuente + "]";
}
  
  
}
