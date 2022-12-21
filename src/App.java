import java.util.Scanner;
public class App {
    public static void main(String[] args) {
     //* Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelA passe a
    //possuir ovalor da variável B e a variável B passe a possuir o valor da variável A. Apresentar osvalores trocados
    
    Scanner sc = new Scanner(System.in);
    int a, b, c;
     
    System.out.println("Informe o valor de A:");
    a = sc.nextInt();
    System.out.println("Informe o valor de B:");
    b = sc.nextInt();    
    
    c = a;
    a = b;
    b = c;

    System.out.println("O valor de A é: " + a);
    System.out.println("O valor de B é: " + b);
    


    }
}
