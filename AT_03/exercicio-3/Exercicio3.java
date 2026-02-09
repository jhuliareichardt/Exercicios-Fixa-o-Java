import java.util.Scanner; // Importa a classe Scanner

public class Exercicio3 { // Declara a classe chamada Exercicio3
public static void main(String[] args) {  //aqui que o programa começa a executar
System.out.println("=============================================");  //estética
  Scanner scanner = new Scanner(System.in); //ativa scanner
  int total = 0;  // Variável que vai armazenar o total de peças produzidas
    int i = 1;  // Contador para controlar as horas
    
    while(i < 6){   //vai repetir enquanto i for menor que 6
        System.out.print("Quantidade de peças produzidas na " + i +"° hora: " ); //mensagem pedindo a quantidade de peças da hora atual
        int valorHora = scanner.nextInt(); // Lê a quantidade de peças produzidas naquela hora
        total += valorHora;  // Soma o valor digitado ao total 
        i++;  //contador para passar para a próxima hora
    }
    
    System.out.println("=============================================");  // estética
    System.out.println(" * Em 5 horas foram produzidas "+ total + " peças.");  //mostra total de peças produzidas
    System.out.println(" * A média de peças produzidas por hora é de " + total/5);  //mostra média de peças produzidas
    
    }
}