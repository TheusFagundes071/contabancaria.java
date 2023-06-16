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
public abstract class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    double saldo;
    private double valor1;
    
    //CONSTRUTOR

    public ContaBancaria(String nomeCliente, int numConta, double saldo, double valor1) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
        this.valor1 = valor1;
    }
    
    //GETTER E SETTER

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    
    //SACAR
    
    public String getSaldoSacar(){
       if(valor1>saldo){
           return  +saldo + " Saldo Insuficiente,Adicionando o limite"; 
                   
        }
       else{
           return saldo - valor1 + " Reais";
       }
    
}
    //DEPOSITAR
    
    public double getSaldoDepositar(){
        return saldo + valor1;
    }
    
    
    //TO STRING

    @Override
    public String toString() {
        return "Nome do cliente:" + nomeCliente + 
                "\n Número da conta:" + numConta + 
                "\n Saldo:" + saldo + 
                "\n Valor Digitado:" + valor1 +
                "\n Saldo após o depósito:" +getSaldoDepositar()+
                "\n Saldo após o saque:" +getSaldoSacar();
        
        
    }
    
    
}
