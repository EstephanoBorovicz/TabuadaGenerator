package br.senai.sp.jandira.ds1ta.tabuadagenerator;
import java.util.Scanner;

public class Gerador {
    public int multiplicando;
    public int multiplicadorInicial;
    public int multiplicadorFinal;
    public int multiplicadorApoio;

    Scanner leitor = new Scanner(System.in);

    public void getData(){
        System.out.println("Bem vindo ao Gerador de Tabuadas (tm)");
        System.out.print("Digite o valor do multiplicando: ");
        multiplicando = leitor.nextInt();
        System.out.print("Digite o valor do multiplicador inicial: ");
        multiplicadorInicial = leitor.nextInt();
        System.out.print("Digite o valor do multiplicador final: ");
        multiplicadorFinal = leitor.nextInt();
        System.out.println("Gerando tabuada...");
        gerarTabuada();
    }
    public void gerarTabuada(){

        //invertendo multiplicadores final e inicial.
        if (multiplicadorFinal<multiplicadorInicial){
            multiplicadorApoio = multiplicadorFinal;
            multiplicadorFinal = multiplicadorInicial;
            multiplicadorInicial = multiplicadorApoio;
        }

        //criando vetor tabuada com tamanho multiplicadorFinal - multiplicadorInicial + 1
        int [] tabuada = new int[multiplicadorFinal - multiplicadorInicial + 1];
        int i = multiplicadorInicial;
        while (i <= multiplicadorFinal){
            System.out.println(multiplicando + "x" + i + " = " + multiplicando * i);
            i = i + 1;
        }
        System.out.println("-----------------------------------");
        getData();
    }
}
