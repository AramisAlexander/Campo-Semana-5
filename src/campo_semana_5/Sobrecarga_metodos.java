/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campo_semana_5;

/**
 *
 * @author EQUIPO
 */
public class Sobrecarga_metodos {
    
    int resultado;

    void suma(int a, int b){
        resultado = (a + b);
        System.out.println("La suma es: " + resultado);
    }

    void suma(int a, int b, int c){
        resultado = (a + b + c);
        System.out.println("La suma es: " + resultado);
    }

    void suma(int a, int b, int c, int d){
        resultado = (a + b + c + d);
        System.out.println("La suma es: " + resultado);
    }

    public static void main(String[] args) {
        Sobrecarga_metodos obj = new Sobrecarga_metodos();

        obj.suma(2, 3);
        obj.suma(2, 3, 4);
        obj.suma(2, 3, 4, 5);
    }
}