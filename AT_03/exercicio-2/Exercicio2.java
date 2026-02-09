import java.util.Scanner;  // Importa a classe Scanner
public class Exercicio2 {  // Declara a classe chamada Exercicio2

 public static void main(String[] args) {   //aqui que o programa começa a executar
 System.out.println("=============================");   // estética
  Scanner scanner = new Scanner(System.in);  // Cria o objeto Scanner para ler dados do teclado

    System.out.print("Qual o nível do tanque? ");  //pergunta qual o nível atual do tanque
    int nivelTanque = scanner.nextInt();   //int pois somente aceita números
        if (nivelTanque >= 90){  //verifica nível do tanque alto
        System.out.println("ALERTA: Nível Crítico - Abrir Válvula de Escoamento!");   // Mostra um alerta
        
       }else if(nivelTanque < 10){  //verifica nível do tanque baixo
           System.out.println("ALERTA: Nível Baixo - Ativar Bomba de Enchimento!");  // Mostra um alerta
           
       } else {  // nível normal
           System.out.println("Sistema Estável");  // Mostra estado atual do tanque
       }
       scanner.close();  //desativa scanner
           
   }
}

