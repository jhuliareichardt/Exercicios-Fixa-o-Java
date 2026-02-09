 public class Exercicio5 {  // Declara a classe chamada Exercicio5
 public static void main(String[] args) {   // aqui que o programa começa a executar
 System.out.println("==================================================");  //estética
 
     double valorBruto = 512;  // Cria uma variável do tipo double e armazena o valor  
     double resultado = converterEscala(valorBruto);  // Chama o método converterEscala e guarda o resultado da conversão na variável resultado
     System.out.println("O valor na escala de 0-100% é: " + resultado);  // Exibe o valor já convertido para porcentagem
 }
public static double converterEscala (double valor){  //  serve para converter um valor da escala 0–1023 para 0–100%
    return (valor / 1023.0) * 100;  // divide o valor recebido por 1023.0 e multiplica por 100
    } 
}

