package com.cdlc.parcial2;

public class Persona {
    String nombre, nivelEducativo, cedula;
    int Estrato;
    double salario;

    public Persona(String nombre, String nivelEducativo, int estrato, String cedula, double salario) {
        this.nombre = nombre;
        this.nivelEducativo = nivelEducativo;
        Estrato = estrato;
        this.cedula = cedula;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public int getEstrato() {
        return Estrato;
    }

    public void setEstrato(int estrato) {
        Estrato = estrato;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", nivelEducativo='" + nivelEducativo + '\'' +
                ", Estrato=" + Estrato +
                ", cedula=" + cedula +
                ", salario=" + salario +
                '}';
    }
}
