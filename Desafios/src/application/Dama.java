package application;

import java.util.Scanner;

public class Dama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1,y1,x2,y2;
		//se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
		//se estiver em qualquer outra posi��o, a rainha gastar� 2 movimentos!

	    while(true){
	    	x1 = sc.nextInt();
	    	y1 = sc.nextInt();
	    	x2 = sc.nextInt();
	    	y2 = sc.nextInt();
	    	if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condi��o de parada
	    	else if(x1 == x2 && y1 == y2)		//se permanecer na mesma casa
	    		System.out.println("0");
	        else if(x1 == x2 || y1 == y2 || Math.abs(x2 - x1) == Math.abs(y2 - y1))	//mesma linha, coluna ou diagonal
	        	System.out.println(  "1"  );
	    	else 
	        	System.out.println("2");	//qualquer outra condicao
	    }
		sc.close();
	}

}
