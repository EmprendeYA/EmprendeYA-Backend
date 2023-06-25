package pe.edu.upc.emprendeya.dtos;

import pe.edu.upc.emprendeya.entities.Emprendedor;

public class TipodeContenidoDTO {
    private int idTipodeContenido;
    private String nombreTipodeContenido;
    private String descripcionTipodeContenido;
    private Emprendedor emprendedor;

    @Override
    public String toString() {
        return "TipodeContenidoDTO{" +
                "idTipodeContenido=" + idTipodeContenido +
                ", nombreTipodeContenido='" + nombreTipodeContenido + '\'' +
                ", descripcionTipodeContenido='" + descripcionTipodeContenido + '\'' +
                ", emprendedor=" + emprendedor +
                '}';
    }

    public int getIdTipodeContenido() {
        return idTipodeContenido;
    }

    public void setIdTipodeContenido(int idTipodeContenido) {
        this.idTipodeContenido = idTipodeContenido;
    }

    public String getNombreTipodeContenido() {
        return nombreTipodeContenido;
    }

    public void setNombreTipodeContenido(String nombreTipodeContenido) {
        this.nombreTipodeContenido = nombreTipodeContenido;
    }

    public String getDescripcionTipodeContenido() {
        return descripcionTipodeContenido;
    }

    public void setDescripcionTipodeContenido(String descripcionTipodeContenido) {
        this.descripcionTipodeContenido = descripcionTipodeContenido;
    }

    public Emprendedor getEmprendedor() {
        return emprendedor;
    }

    public void setEmprendedor(Emprendedor emprendedor) {
        this.emprendedor = emprendedor;
    }
}