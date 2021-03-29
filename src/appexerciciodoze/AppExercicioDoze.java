/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexerciciodoze;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class AppExercicioDoze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    double salario,total;
               
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o salario do funcionario: "); 
        salario = sc.nextDouble();
        total = salario * 0.05;
        
        System.out.println("O valor do salario com o imposto de 5% e de: "+total);
    
    
    
    
    
    
    
    }
    
}
