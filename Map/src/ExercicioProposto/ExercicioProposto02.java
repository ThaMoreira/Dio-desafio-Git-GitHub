package ExercicioProposto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ExercicioProposto02 {

	public static void main(String[] args) {
		int quantidadeDeLancamentos = 100;
		
		List<Integer> valores = new ArrayList<>();
		Random geradorDeLancamentos = new Random();
		
		 for (int i = 0; i < quantidadeDeLancamentos; i++) {
	            int number = geradorDeLancamentos.nextInt(6) + 1;
	            valores.add(number);
	        }
		 
		  Map<Integer, Integer> lancamentos = new HashMap<>();
	        for (Integer resultado : valores) {
	            if (lancamentos.containsKey(resultado))
	                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
	            else lancamentos.put(resultado, 1);
	        }

	        System.out.print("Jogando");
	        //conte�do do for + try/cath - totalmente opcional
	        for (int i = 0; i < 3; i++) {
	            try {
	                Thread.sleep(3000);
	                System.out.print(".");
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        System.out.println("\nValor " + " Quant. de vezes");
	        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
	            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
	        }
	    }
	}