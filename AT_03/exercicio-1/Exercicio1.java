import java.util.Scanner; // Importa a classe Scanner
public class Exercicio1 {  // Declara a classe chamada Exercicio1
 public static void main(String[] args) { //aqui o sistema começa a executar
 System.out.println("==========================");  //estética
  Scanner scanner = new Scanner(System.in); //ativa scanner

    System.out.print("Digite o nome do sensor: ");  //Pede nome do sensor
    String nomeSensor = scanner.nextLine();  //armazena o nome do sensor
    
    System.out.print("Digite o valor: "); //Pede nome do sensor
    int valorSensor = scanner.nextInt();  //armazena o valor do sensor
    
    System.out.println("Sensor " + nomeSensor + " registrado com o valor de " + valorSensor + " unidades.");
        // Exibe os dados na tela
scanner.close();  //fecha scanner
     System.out.println("Lais e Julia chatas demaisee");
 }
}
