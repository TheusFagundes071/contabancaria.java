/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import conta.ContaEspecial;
import conta.ContaPoupanca;

/**
 *
 * @author Theu
 */
public class Main {
    public static void main(String[] args) {
      ContaPoupanca contapopanca = new ContaPoupanca(2, "JC", 1, 1000, 2000);
      
        System.out.println(contapopanca);
        
        System.out.println("");
        
        
      ContaEspecial contaespecial = new ContaEspecial(1000, "Marcos Melo", 2, 400, 500);
      
        System.out.println(contaespecial);
        
    }
}
