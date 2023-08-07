/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula;

/**
 *
 * @author alunodev08
 */
public class Seguro extends Veiculo {
    private final float valor;
    private final boolean vigencia;
    
       public Seguro(float valor, boolean vigencia) {
       this.valor = valor;
       this.vigencia = vigencia;
        
        public int getValor() {
        return (int) valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
   
}
