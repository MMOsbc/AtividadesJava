/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

/**
 *
 * @author unifmatoliveira
 */

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // construtor nº1
    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.print("Algo deu errado na data informada, tente novamente mais tarde");
        }
    }

    // construtor 2
    public Data(String nomeMes, int dia, int ano) {
        int mes = obterMesPorNome(nomeMes);
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.print("Algo deu errado na data informada, tente novamente mais tarde");
        }
    }

    // terceiro construtor primeira variavel diasnoano e o segundo o ano
    public Data(int diasNoAno, int ano) {
        this.ano = ano;
        this.mes = 1;
        this.dia = diasNoAno;

        for (int i = 1; i <= 12; i++) {
            int diasNoMes = obterDiasNoMes(i, ano);
            if (this.dia > diasNoMes) {
                this.dia -= diasNoMes;
                this.mes++;
            } else {
                break;
            }
        }
    }

    // validação de data correta 
    private boolean validarData(int dia, int mes, int ano) {
        return mes >= 1 && mes <= 12 && dia >= 1 && dia <= obterDiasNoMes(mes, ano);
    }

    // validação para saber se o ano é bissexto 
    private boolean possuiAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // conferir quantos dias tem o mês 
    private int obterDiasNoMes(int mes, int ano) {
        if (mes == 2) {
            return (possuiAnoBissexto(ano)) ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    // switch para converter mês de nome para numero
    private int obterMesPorNome(String nomeMes) {
        switch (nomeMes.toLowerCase()) {
            case "janeiro": return 1;
            case "fevereiro": return 2;
            case "março": return 3;
            case "abril": return 4;
            case "maio": return 5;
            case "junho": return 6;
            case "julho": return 7;
            case "agosto": return 8;
            case "setembro": return 9;
            case "outubro": return 10;
            case "novembro": return 11;
            case "dezembro": return 12;
            default: System.out.print("Algo deu errado na transformação, tente novamente mais tarde"); // metodo de invalidação 
        }
        return 0;
        
    }

    // switch para converter mês de numero em escrita 
    private String obterNomeMes(int mes) {
        switch (mes) {
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mês inválido";
        }
    }

    // calculando dias do ano para saida do vaticano 
    private int obterDiaNoAno() {
        int totalDias = dia;
        for (int i = 1; i < mes; i++) {
            totalDias += obterDiasNoMes(i, ano);
        }
        return totalDias;
    }

    // formato mes, dia, ano 
    public String formatoMMDDYYYY() {
        return String.format("%02d/%02d/%04d", mes, dia, ano);
    }
// formato mes(extenso), dia, ano 
    public String formatoExtenso() {
        return String.format("%s %02d, %04d", obterNomeMes(mes), dia, ano);
    }
// formato sair dia do ano e ano 
    public String formatoDDDYYYY() {
        return String.format("%03d %04d", obterDiaNoAno(), ano);
    }
}