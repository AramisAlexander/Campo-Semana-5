/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campo_semana_5;

/**
 *
 * @author steve
 */
public class Estudiante 
{
  private String nommbre;
    private String paterno;
    private String materno;
    private String carrera;

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    void verDatos(){
        
        System.out.println("Nombre del estudiante: " + this.nommbre);
        System.out.println("Apellido paterno: " + this.paterno);
        System.out.println("Apellido materno: " + this.materno);
        System.out.println("Estudial la carrera de: " + this.carrera);
    }
}
