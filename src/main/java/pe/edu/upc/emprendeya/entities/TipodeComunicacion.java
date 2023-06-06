package pe.edu.upc.emprendeya.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipodeComunicacion")

public class TipodeComunicacion {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipodeComunicacion;
@Column(name = "nameTipodeComunicacion", length = 70, nullable = false)
    private String nameTipodeComunicacion;

@Column(name = "descripcionTipodeComunicacion", length = 80, nullable = false)
    private String descripcionTipodeComunicacion;

    public TipodeComunicacion() {
    }

    public TipodeComunicacion(int idTipodeComunicacion, String nameTipodeComunicacion, String descripcionTipodeComunicacion) {
        this.idTipodeComunicacion = idTipodeComunicacion;
        this.nameTipodeComunicacion = nameTipodeComunicacion;
        this.descripcionTipodeComunicacion = descripcionTipodeComunicacion;
    }

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
