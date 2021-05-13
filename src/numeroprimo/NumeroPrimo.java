/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        boolean primo = true;
        
        System.out.println("Até qual número vc deseja verificar os números primos: ");
        int max = s.nextInt();

        for(int m = 2; m <= max; m++){
        primo = true;
            for(int i = 2; i < max && i < m; i++){
                //System.out.println(m+"/"+i+" resto:"+m % i);
                if(m % i == 0){
                    primo = false;
                }
            }   
            if(primo == true){
                System.out.println(m+" É primo");
            }
        }               
    }
    
}
