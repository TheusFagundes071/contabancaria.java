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
public abstract class Pessoa {
    private String nome;
    
    
    //CONSTRUTOR

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    //getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    //TO STRING

    @Override
    public String toString() {
        return "Nome:" + nome;
    }
    
}
