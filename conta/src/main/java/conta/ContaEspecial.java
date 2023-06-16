/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author Theu
 */
public class ContaEspecial extends ContaBancaria{
    private double limite;
    
    //CONSTRUTOR

    public ContaEspecial(double limite, String nomeCliente, int numConta, double saldo, double valor1) {
        super(nomeCliente, numConta, saldo, valor1);
        this.limite = limite;
    }
    
    //GETTER E SETTER

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    

    public String getSaldolimite(){
        if(limite < super.saldo){
            return "Impossível efetuar o saque,Limite menor que o saldo";
        }
        else if(super.saldo<super.getValor1()){
            return limite - (super.getValor1() - super.saldo) +
            " Reais"; 
        }
        else{
            return limite + "\n Reais";
        }
       
    }
    
    
    //TO STRING

    @Override
    public String toString() {
        return super.toString() + 
                "\n Limite:" + limite +
                "\n Saldo do Limite após o saque:" +getSaldolimite();
    }
    
    
    
}

   

