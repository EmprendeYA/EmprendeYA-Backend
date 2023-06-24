package pe.edu.upc.emprendeya.dtos;

public class EmprendedorResenaDTO {
    private String nameEmprendedor;
    private int resenaCount;

    public EmprendedorResenaDTO() {
    }

    public EmprendedorResenaDTO(String nameEmprendedor, int resenaCount) {
        this.nameEmprendedor = nameEmprendedor;
        this.resenaCount = resenaCount;
    }

    public String getNameEmprendedor() {
        return nameEmprendedor;
    }

    public void setNameEmprendedor(String nameEmprendedor) {
        this.nameEmprendedor = nameEmprendedor;
    }

    public int getResenaCount() {
        return resenaCount;
    }

    public void setResenaCount(int resenaCount) {
        this.resenaCount = resenaCount;
    }
}
