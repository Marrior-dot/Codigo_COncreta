import java.util.Scanner; 
import java.util.*;

public class pg{

public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);	
	LinkedList<Double> li = new LinkedList<>();
	int  ask=0;
	double sequeInp = 0;
	
	while(ask == 0){
		System.out.println("Escolha um item para adicionar à lista: ");
		sequeInp = inp.nextDouble();	
		li.addLast(sequeInp);
		System.out.println("Você deseja adicionar mais itens?\n1-Não\n0-Sim");
		ask = inp.nextInt();
	}

	if (li.size() < 3) {
		System.out.println("Não é uma pg, pois o tamanho da sequência não é adequado");
	} 
	else {
		
		for (int i = 2; i < li.size(); i++) {
			if ((li.get(1)/li.get(0))!=(li.get(i)/li.get(i-1))){
				System.out.println("Não é uma pg, pois as razões entre os termos são diferentes");	
				break;
			}				
			else{
				System.out.print("É uma PG...");
				if ((li.get(1)/li.get(0)) > 1) {
					System.out.println("\nCrescente");	
					break;
				} 
				else if((li.get(1)/li.get(0)) == 1) {
					System.out.println("\nConstante");
					break;
				}
				else if((li.get(1)/li.get(0)) < 1 && (li.get(1)/li.get(0))>0 ){
					System.out.println("\nDescrescente");
					break;

				}
				else if((li.get(1)/li.get(0)) == -1){
					System.out.println("\nAlternante");
					break;
				}
				else if((li.get(1)/li.get(0)) == 0){
					System.out.println("\nEstacionária");
					break;
				}
			}
		}		
		}	
	}
}
