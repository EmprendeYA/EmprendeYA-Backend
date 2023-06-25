package pe.edu.upc.emprendeya.dtos;

public class EmprendedorTipoContDTO {

    private int ID;
    private String nombre_empren;
    private String apellido_empren;
    private int edad_empren;

    private String rubro_empren;
    private int benef_ID;

    public EmprendedorTipoContDTO() {
    }

    public EmprendedorTipoContDTO(int ID, String nombre_empren, String apellido_empren, int edad_empren, String rubro_empren, int benef_ID) {
        this.ID = ID;
        this.nombre_empren = nombre_empren;
        this.apellido_empren = apellido_empren;
        this.edad_empren = edad_empren;
        this.rubro_empren = rubro_empren;
        this.benef_ID = benef_ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre_empren() {
        return nombre_empren;
    }

    public void setNombre_empren(String nombre_empren) {
        this.nombre_empren = nombre_empren;
    }

    public String getApellido_empren() {
        return apellido_empren;
    }

    public void setApellido_empren(String apellido_empren) {
        this.apellido_empren = apellido_empren;
    }

    public int getEdad_empren() {
        return edad_empren;
    }

    public void setEdad_empren(int edad_empren) {
        this.edad_empren = edad_empren;
    }

    public String getRubro_empren() {
        return rubro_empren;
    }

    public void setRubro_empren(String rubro_empren) {
        this.rubro_empren = rubro_empren;
    }

    public int getBenef_ID() {
        return benef_ID;
    }

    public void setBenef_ID(int benef_ID) {
        this.benef_ID = benef_ID;
    }
}
