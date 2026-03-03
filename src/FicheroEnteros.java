import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FicheroEnteros {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("enteros.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(Integer.parseInt(linea));
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Suma:");
        int suma = 0;
        for(int i : lista) {
            suma += i;
        }
        System.out.println(suma);

        System.out.println();
        System.out.println("Maximo: ");
        int maximo = 0;
        for(int i : lista) {
            if(i > maximo) {
                maximo = i;
            }
        }
        System.out.println(maximo);

        System.out.println();

        System.out.println("Minimo: ");
        int minimo = lista.get(0);
        for(int i : lista) {
            if(i < minimo) {
                minimo = i;
            }
        }
        System.out.println(minimo);
    }
}