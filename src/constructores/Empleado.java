/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Fabricio
 */
public class Empleado {

    private String nombre;
    private int edad;
    private String departamento;

    public Empleado(String nombre,
            int edad, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
    }
    
    /*
    public Empleado(Empleado empleadoOld){
        this.nombre = empleadoOld.nombre;
        this.edad = empleadoOld.edad;
        this.departamento = empleadoOld.departamento;
        
        
    
        
    }
    */
    
    
    /*
    
    *Patrón Factory 
    */
    public static Empleado copiaEmpleado(Empleado empleadoOld){
        /*this.nombre = empleadoOld.nombre;
        this.edad = empleadoOld.edad;
        this.departamento = empleadoOld.departamento;
        */
        
        return new Empleado(
                empleadoOld.getNombre(),
                empleadoOld.getEdad(),
                empleadoOld.getDepartamento()
        );
    }

    //Alt+shift +f  -->Asignar formato automatico a todo 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String getTextoImprimir(){
        return "Nombre: "+this.nombre
                +"\nEdad: "
                +this.getEdadComoTexto()
                +"\nDepartamento: "
                +this.departamento
                +"\n-------------------------";
    }
    
    public String getEdadComoTexto(){
        String edadTexto=Constructores.convertirATexto(edad);
        return edadTexto;
    }

}
