package br.senai.sp.jandira.ds1ta.tabuadagenerator.model;
import java.util.Scanner;

public class Gerador {
    public int multiplicando;
    public int multiplicadorInicial;
    public int multiplicadorFinal;
    public int multiplicadorApoio;
    public int tamanho;
    public String[] tabuada;
    public int i;

    public String[] gerarTabuada(){

        //invertendo multiplicadores final e inicial.
        multiplicadorApoio = 0;
        if (multiplicadorFinal<multiplicadorInicial){
            multiplicadorApoio = multiplicadorFinal;
            multiplicadorFinal = multiplicadorInicial;
            multiplicadorInicial = multiplicadorApoio;
        }

        //criando vetor tabuada com tamanho [multiplicadorFinal - multiplicadorInicial + 1].
        tamanho = multiplicadorFinal-multiplicadorInicial+1;
        tabuada = new String[tamanho];


        while (i <= multiplicadorFinal){
            //tabuada[multiplicadorFinal-multiplicadorInicial+1] = (i + " x " + multiplicando + " = " + i*multiplicando);
            i = i + 1;
        }
        return tabuada;
    }
}
