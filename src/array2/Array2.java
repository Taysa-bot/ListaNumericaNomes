/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import java.util.Scanner;


/**
 *
 * @author 20181094010025
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        String [] nome= new String[3];
        for(int i=0;i<3;i++){
            System.out.print("Informe o nome: ");
            nome[i]=sc.next().toLowerCase();
        }
       for(int i=0;i<3;i++){
           System.out.println((i+1)+"."+nome[i]);
       }
    }
}
