
package Salud;
import java.util.*;

public class Persona {
    //atributos
    private String tipoDocumento;
    private int documento;
    private String nombre;
    private String apellido;
    private int edad;
    private int peso;
    private double estatura;
    private String sexo;

    double resultado;
    double estatura2;

    //conctores vasios

    public Persona() {
    }
    
    public Persona(String tipoDoc,int documento,String nombre,String apellido,int peso,int estatura,int edad,String sexo){
        
    }

    //get y set

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getEstatura2() {
        return estatura2;
    }

    public void setEstatura2(double estatura2) {
        this.estatura2 = estatura2;
    }

    //metodos

    public void calcularImc() {
        estatura2=estatura*estatura;
        resultado=estatura2/peso;
    }
    public void mostrarImc(){
        System.out.println("Su Imc fue: "+resultado);
        if (resultado<20) {
            System.out.println("Usted esta por debajo del peso ideal");
        }
        else if (resultado>20 && resultado<25) {
            System.out.println("Su peso es ideal");
        }
        else if (resultado>25) {
            System.out.println("Usted esta por encima del peso ideal");
        }
    }
    public void registrarEdad() {
        Scanner recoger=new Scanner(System.in);
        System.out.println("por favor ingrese su edad");
        edad=recoger.nextInt();
    }
    public void mostrarEdad() {
        System.out.println("Su edad es: "+edad);
        if (edad>=18) {
            System.out.println("usted es mayor de edad");
        }
        else{
            System.out.println("usted es menor de edad");
        }
    }

    public void pedirDatos(){ 
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el tipo de documento");
        tipoDocumento = datos.next();

        System.out.println("Ingrese su documento ");
        documento = datos.nextInt();

        System.out.println("Ingrese su nombre");
        nombre = datos.next();

        System.out.println("Ingrese su apellido");
        apellido = datos.next();

        System.out.println("Ingrese su edad");
        edad = datos.nextInt();

        System.out.println("Ingrese su peso");
        peso = datos.nextInt();

        System.out.println("Ingrese su estatura");
        estatura = datos.nextDouble();

        System.out.println("Ingrese su sexo");
        sexo = datos.next();

    }

    public void mostrarPersona(String tipoDoc,int documento,String nombre,String apellido,int peso,int estatura,int edad,String sexo){
        System.out.println("Su nombre es:_"+nombre);
        System.out.println("Su apellido es:_"+apellido);
        System.out.println("Su documento es:_"+documento);
        System.out.println("Su tipo de documento es:_"+tipoDoc);
        System.out.println("Su edad es:_"+edad);
        System.out.println("Su sexo es:_"+sexo);
        System.out.println("Su peso es:_"+peso);
        System.out.println("Su estatura es:_"+estatura);
    }

    /*
    public void operaciones(){
        estatura2 = estatura * estatura;
        resultado = peso / estatura2;
    }
    */

    /*public int operacionEstatura(int estatura2, int estatura){
        estatura2 = estatura * estatura;
        return estatura2;
    }

        public int operacionPeso(int peso){
        resultado = peso/estatura;
        return (int) estatura;
    }*/

    /*public void mostrarDatos(){
        System.out.println("su tipo de documento  es: "+tipoDocumento);
        System.out.println("Su documento es: "+documento);
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su apellido es: "+apellido);
        System.out.println("Su edad es: "+edad);
        System.out.println("Su peso es: "+peso);
        System.out.println("Su estatura es: "+estatura);
        System.out.println("Su estatura es: "+sexo);
        System.out.println("Su IMC es: "+resultado);

        if(resultado < 20){
            System.out.println("El peso esta por debajo de lo ideal");
        }else if(resultado >= 20 && resultado <= 25){
            System.out.println("El peso es ideal");
        }else if(resultado > 25){
            System.out.println("Tiene sobre peso");
        }
    
        if(edad >=18){
            System.out.println("usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
    }*/
    
}
