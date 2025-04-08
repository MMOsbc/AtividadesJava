/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matr1x;

/**
 *
 * @author mathe
 */
// PROFESSOR EXTENSÃO DE AGENT 
class Professor extends Agente {
    private String escola;

    public Professor(String nome, String escola) {
        super(nome, "Professor");
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public void apresentacao() {
        super.apresentacao();
        System.out.println("Leciono na escola: " + escola);
    }
}
