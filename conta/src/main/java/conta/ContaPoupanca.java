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
public class ContaPoupanca extends ContaBancaria{
    private double diaRendimento;

    //CONSTRUTOR
    public ContaPoupanca(double diaRendimento, String nomeCliente, int numConta, double saldo, double valor1) {
        super(nomeCliente, numConta, saldo, valor1);
        this.diaRendimento = diaRendimento;
    }
    
    //GETTER E SETTER

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    //NOVOSALDO
    public double getNovoSaldo(){
        return (getSaldo() * (diaRendimento / 100))+ getSaldo();
    }
    
    //TO STRING

    @Override
    public String toString() {
        return super.toString()+ 
                "\n Dia do Rendimento:" + diaRendimento +
                "\n Saldo Conta Poupança com taxa de rendimento:" +getNovoSaldo();
                
        
        
    }
    
    
    
    
    
}
