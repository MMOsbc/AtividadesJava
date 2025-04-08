/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matr1x;

/**
 *
 * @author mathe
 */

// USANDO INTERFACE PARA IMPLEMENTAR AGENT
class Agente implements IAgente {
    private String nome;
    private boolean modoAgente;
    private String profissao;

    public Agente(String nome, String profissao) {
        this.nome = nome;
        this.profissao = profissao;
        this.modoAgente = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isModoAgente() {
        return modoAgente;
    }

    public void setModoAgente(boolean modoAgente) {
        this.modoAgente = modoAgente;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public void apresentacao() {
        System.out.println(" MEU NOME E  " + nome + " MINHA PROFISSAO " + profissao + ".");
        if (modoAgente) {
            System.out.println("AGENTE SMITH");
        }
    }

    @Override
    public void modo_agente_on() {
        this.modoAgente = true;
        System.out.println(nome + " AGORA TORNOU AGENTE SMITH!");
    }
}
    