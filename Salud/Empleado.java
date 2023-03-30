package Salud;

public class Empleado extends Persona {
    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;
    private float total;
    private float total2;

    public Empleado(String tipoDoc,int documento,String nombre,String apellido,int peso,int estatura,int edad,String sexo){
        super(tipoDoc,documento,nombre,apellido,peso,estatura,edad,sexo);
        this.cargo=cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.departamento=departamento;
    }

    public void calcularHonorarios() {
        total=valorHora*horasTrabajadas;
        total2=(float) (total-0.966);
    }
    public void mostrarHonorarios() {
        System.out.println("Sus honorarios son: "+total2);
    }
    public void mostrarEmpleado() {
        System.out.println("Los datos del empleado son:_"+getTipoDoc()+","+getDocumento()+","+getNombre()+","+getApellido()+","+getPeso()+","+getEstatura()+","+getEdad()+","+getSexo());
    }

    private String getTipoDoc() {
        return null;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getTotal2() {
        return total2;
    }

    public void setTotal2(float total2) {
        this.total2 = total2;
    }
}
