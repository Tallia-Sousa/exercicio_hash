
package br.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

//       A quantidade de ids é (6) multiplicando por 2  dá 12, com isso aproximei o resultado para
//        o número primo mais próximo que é o 11, esse 11 será o tamanho tabela hash
                   for(int i =1; i<= 6; i++) {
                       List<Integer> lista = new ArrayList<Integer>(11);


                       System.out.println("Digite apenas as partes  numericas  dos ids da tabela hash:");
                       int numero = entrada.nextInt();
                       int resto = numero % 11;
                       lista.add(resto);



        if (lista.size() > 0) {
                System.out.println(lista);
            }
        else {
            System.out.println("nao ha posiçoes para listar");
        }
    }}}