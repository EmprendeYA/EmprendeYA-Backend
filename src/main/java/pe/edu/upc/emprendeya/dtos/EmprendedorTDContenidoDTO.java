package pe.edu.upc.emprendeya.dtos;


public class EmprendedorTDContenidoDTO {
    private String nombreEmprendedor;
    private int TDContenidoCount;

    public EmprendedorTDContenidoDTO() {
    }

    public EmprendedorTDContenidoDTO(String nombreEmprendedor, int TDContenidoCount) {
        this.nombreEmprendedor = nombreEmprendedor;
        this.TDContenidoCount = TDContenidoCount;
    }

    public String getNombreEmprendedor() {
        return nombreEmprendedor;
    }

    public void setNombreEmprendedor(String nombreEmprendedor) {
        this.nombreEmprendedor = nombreEmprendedor;
    }

    public int getTDContenidoCount() {
        return TDContenidoCount;
    }

    public void setTDContenidoCount(int TDContenidoCount) {
        this.TDContenidoCount = TDContenidoCount;
    }
}