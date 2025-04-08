/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matr1x;

/**
 *
 * @author mathe
 */
// CLASS EMPRESARIO EXTENSÃO DE AGENT 
class Empresario extends Agente {
    private String empresa;

    public Empresario(String nome, String empresa) {
        super(nome, "Empresário");
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public void apresentacao() {
        super.apresentacao();
        System.out.println("TRABALHO NA EMPRESA" + empresa);
    }
}
