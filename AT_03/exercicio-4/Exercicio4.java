public class Exercicio4 {    // Declara a classe chamada Exercicio4

 public static void main(String[] args) {  //aqui que o programa começa a executar
 System.out.println("=====================================");   //estética

 int[] historico = {1, 1, 1, 1}; // Exemplo de dados
 int contador = 0;  // conta quantas vezes a máquina esteve ligada
 
 for (int i = 0; i <= 3; i++ ){  //condições
     if (historico[i] == 1){  // Verifica se naquela posição a máquina estava ligada
         contador++;  // toda vez que aparecer 1 vai adicionar +1
        }
    }
     System.out.println("A máquina esteve em operação " + contador + " vezes.");  // aparece na tela
 }
}
