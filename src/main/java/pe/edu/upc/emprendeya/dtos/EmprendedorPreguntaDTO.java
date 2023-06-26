package pe.edu.upc.emprendeya.dtos;

public class EmprendedorPreguntaDTO {
    private String nameEmprendedor;
    private int preguntaCount;

    public EmprendedorPreguntaDTO() {
    }

    public EmprendedorPreguntaDTO(String nameEmprendedor, int preguntaCount) {
        this.nameEmprendedor = nameEmprendedor;
        this.preguntaCount = preguntaCount;
    }

    public String getNameEmprendedor() {
        return nameEmprendedor;
    }

    public void setNameEmprendedor(String nameEmprendedor) {
        this.nameEmprendedor = nameEmprendedor;
    }

    public int getPreguntaCount() {
        return preguntaCount;
    }

    public void setPreguntaCount(int preguntaCount) {
        this.preguntaCount = preguntaCount;
    }
}
