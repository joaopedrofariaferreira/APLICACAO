package execicios_iniciais;

import java.util.Scanner;
public class TesteTarget {
	public static void main (String[] args) {
 /*/ Pergunta numero 1:  resposta a variavel SOMA sera igual a 12. 
// Pergunta numero 2: 
	
	
	
	
	
	
	
	// pergunta numero 3: 
	a) 1,3,5,7, 15 
	b) 2, 4, 8, 16, 32, 64, 128 
	c) 0,1,4,9,16,25,36, 49 
	d) 4, 16, 36, 64, 100
	e) 2, 10 , 12, 16, 17, 18, 19 ,200
	
	// pergunta numero 4: 
	 * Carro 
	 		Ribeirao - Franca		110 km/ h
	 Caminhao 
	 		Franca - Ribeirao		80km/ h
	 		
	 podemos fazer por sovet da fisica - S = s0 + v.t
	 igualamos os dois para sabermos a posição onde eles vao se contrar 
	 
	 Scarro = Scaminhao
	 
	 110t = 80t + 100
	 30t = 100
	 t = 30 minutos 
	 
	 Acho importante ser sincero que a parte do pedágio eu não consegui colocar no sistemas de conta (faz bastante tempo que eu não estudava física rs. perdão)
	
	
	
	
	*/
	
	//Exercicio numero 2:
		//fibonacci = 1 , 1, 2, 3, 5, 8,13
		int numeroUM = 1;
		int numeroZERO = 0;
		int varAuxiliar;
		int numero =24; // inserir numero aqui
	
		for (int i = 0; i < 10; i++) {
		
			System.out.println(numeroUM);
			varAuxiliar = numeroUM;
			numeroUM+= numeroZERO;
			numeroZERO = varAuxiliar;
			
			if(numero == numeroUM) {
				System.out.println("o numero digitado pertence a fibonacci");
			}else {
				System.out.println("O numero não pertence");
			}
		
	
		}
		
	}
	
}
