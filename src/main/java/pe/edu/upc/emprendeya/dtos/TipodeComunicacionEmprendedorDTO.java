package pe.edu.upc.emprendeya.dtos;

public class TipodeComunicacionEmprendedorDTO {

    private String nombreEmprendedor;
    private int TipodeComunicacionCount;

    public TipodeComunicacionEmprendedorDTO(){
    }

    public TipodeComunicacionEmprendedorDTO(String nombreEmprendedor, int TipodeComunicacionCount){
        this.nombreEmprendedor= nombreEmprendedor;
        this.TipodeComunicacionCount= TipodeComunicacionCount;
    }

    public String getNombreEmprendedor(){
        return nombreEmprendedor;
    }

    public void setNombreEmprendedor(String nombreEmprendedor) {
        this.nombreEmprendedor = nombreEmprendedor;
    }

    public int getTipodeComunicacionCount() {
        return TipodeComunicacionCount;
    }

    public void setTipodeComunicacionCount(int tipodeComunicacionCount) {
        this.TipodeComunicacionCount = TipodeComunicacionCount;
    }
}
