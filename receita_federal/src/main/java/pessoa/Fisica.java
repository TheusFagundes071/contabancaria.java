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
public class Fisica extends Pessoa{
    private String cpf;
    private double rendaBruta;
    
    
    //CONSTRUTOR

    public Fisica(String cpf, double rendaBruta, String nome) {
        super(nome);
        this.cpf = cpf;
        this.rendaBruta = rendaBruta;
    }
    
    //GETTER E SETTER

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    
    public double getResultado(){
        if(rendaBruta <= 1400 ){
            return 0;
        }
        else if(rendaBruta>1400 && rendaBruta <=2100){
            return (rendaBruta * 0.1) - 100;
        }
         else if(rendaBruta>2100 && rendaBruta <=2800){
            return (rendaBruta * 0.15) - 270;
        }
         else if(rendaBruta>2800 && rendaBruta <=3600){
            return (rendaBruta * 0.25) - 500;
        }
        
         return (rendaBruta * 0.3) - 700;
        
    }
       
    
    //TO STRING

    @Override
    public String toString() {
        return super.toString() +
                "\nCpf:" + cpf + 
                "\nRenda Bruta:" + rendaBruta + 
                "\n Valor do imposto:" + getResultado();
    }
    
    
}
