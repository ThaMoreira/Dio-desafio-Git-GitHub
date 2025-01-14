package ExercicioProposto;

import java.util.*;


/*
Crie uma conjunto contendo as cores do arco-�ris e:             
a) Exiba todas as cores o arco-�ris uma abaixo da outra;           
b) A quantidade de cores que o arco-�ris tem;                        
c) Exiba as cores em ordem alfab�tica;                                            
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que come�am com a letra �v�;
f) Remova todas as cores que n�o come�am com a letra �v�;
g) Limpe o conjunto;
h) Confira se o conjunto est� vazio;
 */

public class CoresDoArcoIris {

	public static void main(String[] args) {

		System.out.println("Crie uma conjunto contendo as cores do arco-�ris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        System.out.println("Exiba todas as cores o arco-�ris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("A quantidade de cores que o arco-�ris tem: " + coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfab�tica: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que come�am com a letra �v�: ");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que n�o come�am com a letra �v�: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto est� vazio: " + coresArcoIris.isEmpty());
    }
}