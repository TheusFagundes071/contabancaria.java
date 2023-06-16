/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author Theu
 */
public class Juridica extends Pessoa{
    private double rendaBruta;
    private double imposto=(0.1);
    
    
    //CONSTRUTOR

    public Juridica(double rendaBruta, String nome) {
        super(nome);
        this.rendaBruta = rendaBruta;
    }
    
    //GETTER E SETTER

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRenda(double renda) {
        this.rendaBruta = renda;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    //CALCULO
    public double getResultado(){
        return rendaBruta * imposto;
    }
    
    
    //TO STRING

    @Override
    public String toString() {
        return super.toString() + 
                "\nRenda Bruta:" + rendaBruta + 
                "\nValor do imposto:" +getResultado();
    }
    
  
    
    
}
