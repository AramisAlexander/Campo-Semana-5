/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campo_semana_5;

import java.util.ArrayList;

/**
 *
 * @author steve
 */
public class ControlEstudiante 
{
 ArrayList<Estudiante> lista = new ArrayList();
    
    void agregarEstudiante(Estudiante nuevoEstudiante){
        
        lista.add(nuevoEstudiante);
    }
    
    void listarEstudiante(){
        
        for (int i = 0; i < lista.size(); i++) {
            
            lista.get(i).verDatos();
            
        }
    }
}
