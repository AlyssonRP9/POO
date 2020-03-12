package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        calculadora calc = new calculadora();
        Scanner scanner = new Scanner(System.in);
        String linha;

        do{
            linha = scanner.nextLine();
            String[] comandos = linha.split(regex:" ");

            if(comando[0].eguals("end")){
                break;
            }
            else if(comandos[0].eguals("show")){
                System.out.println(calc.show());
            }
            else if(comandos[0].eguals("add")){
                float valor = Float.parseFloat(comandos[1]);
            }
            else if(comandos[0].eguals("mult")){
                float valor = Float.parseFloat(comandos[1]);
            }
            else if(comandos[0].eguals("div")){
                float valor = Float.parseFloat(comandos[1]);
                calc.div(valor);
                    if(valor != 0){
                        calc.div(valor);
                    }
                    else{
                        System.out.println("ERRO!");
                    }
            else if(comando[0].equals("Addm")){
                float[] parametros = new float[comando.length - 1];

                for(int i = 1; i < comandos.length; i++) {
                    parametros[i - 1] = Float.parseFloat(comandos[i]);
                    }
                }
                calc.addm(parametros);
            }

        }while(true);

    }
}
