/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matr1x;

/**
 *
 * @author mathe
 */
// ADVOGADO EXTENSAO DE AGENT 
class Advogado extends Agente {
    private String oab;

    public Advogado(String nome, String oab) {
        super(nome, "Advogado");
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public void apresentacao() {
        super.apresentacao();
        System.out.println("Registro OAB: " + oab);
    }
}
