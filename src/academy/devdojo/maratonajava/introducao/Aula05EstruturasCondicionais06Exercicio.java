package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06Exercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Opção inválida");
        }


        sc.close();
    }

}
