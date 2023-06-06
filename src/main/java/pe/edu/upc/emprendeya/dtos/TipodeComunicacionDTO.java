package pe.edu.upc.emprendeya.dtos;

public class TipodeComunicacionDTO {
    private int idTipodeComunicacion;
    private String nameTipodeComunicacion;
    private String descripcionTipodeComunicacion;

    public int getIdTipodeComunicacion() {
        return idTipodeComunicacion;
    }

    public void setIdTipodeComunicacion(int idTipodeComunicacion) {
        this.idTipodeComunicacion = idTipodeComunicacion;
    }

    public String getNameTipodeComunicacion() {
        return nameTipodeComunicacion;
    }

    public void setNameTipodeComunicacion(String nameTipodeComunicacion) {
        this.nameTipodeComunicacion = nameTipodeComunicacion;
    }

    public String getDescripcionTipodeComunicacion() {
        return descripcionTipodeComunicacion;
    }

    public void setDescripcionTipodeComunicacion(String descripcionTipodeComunicacion) {
        this.descripcionTipodeComunicacion = descripcionTipodeComunicacion;
    }
}
