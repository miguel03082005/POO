package Principal;
import Salud.Persona;

public class Inicio {

    public static void main(String[] args) {

        String tipoDoc;
        int documento;
        String nombre;
        String apellido;
        int peso = 0; 
        int estatura = 0;
        int estatura2= 0;
        int edad;
        String sexo;
        String nombreE;
        String apellidoE;
        int documentoE;
        String tipoDocE;
        String cargo;
        int valorHora;
        int horasTrabajadas;
        String departamento;
        int total2;
        
    Persona per = new Persona();

        //per.pedirDatos();
        //per.operaciones();
        //per.operacionPeso(peso);
        //per.operacionEstatura(estatura, estatura2);
        //per.mostrarDatos();

        System.out.println("Digite su nombre");
        nombre=recoger.next();

        System.out.println("Digite su apellido");
        apellido=recoger.next();

        System.out.println("Digite su documento");
        documento=recoger.nextInt();

        System.out.println("Digite su tipo de documento");
        tipoDoc=recoger.next();


        System.out.println("Digite su sexo");
        sexo=recoger.next(); 

        System.out.println("Digite su peso");
        peso=recoger.nextInt();

        System.out.println("Digite su estatura");
        estatura=recoger.nextInt();

        per.registrarEdad();
        
        per.setNombre(nombre);
        per.setApellido(apellido);
        per.setDocumento(documento);
        per.setTipoDoc(tipoDoc);
        per.setSexo(sexo);
        per.setPeso(peso);
        per.setEstatura(estatura);

        System.out.println("el nombre es:"+per.getNombre());
        System.out.println("el apellido es:"+per.getApellido());
        System.out.println("el documento es:"+per.getDocumento());
        System.out.println("el tipo de documento es:"+per.getTipoDoc());
        System.out.println("el sexo es:"+per.getSexo());
        System.out.println("el peso es:"+per.getPeso());
        System.out.println("el estatura es:"+per.getEstatura());

        per.mostrarEdad();

        per.calcularImc();
        per.mostrarImc();

        empleado emp=new empleado(per.getTipoDoc(),per.getDocumento(),per.getApellido(),per.getNombre(),per.getEdad(),per.getEstatura(),per.getPeso(),per.getSexo());
        
        System.out.println("Digite el nombre del empleado");
        nombreE=recoger.next();

        System.out.println("Digite el apellido del empleado");
        apellidoE=recoger.next();

        System.out.println("Digite el documento del empleado");
        documentoE=recoger.nextInt();

        System.out.println("Digite el tipo de documento");
        tipoDocE=recoger.next();

        System.out.println("digite cargo del empleado");
        cargo=recoger.next();

        System.out.println("digite las horas trabajadas");
        horasTrabajadas=recoger.nextInt();

        System.out.println("digite el valor de hora trabajada");
        valorHora=recoger.nextInt();

        emp.setCargo(cargo);
        emp.setNombre(nombreE);
        emp.setApellido(apellidoE);
        emp.setDocumento(documentoE);
        emp.setTipoDoc(tipoDocE);
        emp.setValorHora(valorHora);
        emp.setHorasTrabajadas(horasTrabajadas);

        System.out.println("el cargo del empleado es:"+emp.getCargo()+","+emp.getNombre()+","+emp.getApellido()+","+emp.getDocumento()+","+emp.getTipoDoc()+","+emp.getValorHora()+","+emp.getHorasTrabajadas());
        emp.calcularHonorarios();
        emp.mostrarHonorarios();
        
        recoger.close();
    }
}

