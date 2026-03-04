import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FicheroEnteros {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        boolean seguir = true;
        while (seguir) {
            try (BufferedReader br = new BufferedReader(new FileReader("enteros.txt"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    try {
                        lista.add(Integer.parseInt(linea));
                    } catch (NumberFormatException e) {
                        System.out.println("Hay un valor no numerico en el fichero");
                    }
                }

                System.out.println("Suma:");
                int suma = 0;
                for (int i : lista) {
                    suma += i;
                }
                System.out.println(suma);

                System.out.println();
                System.out.println("Maximo: ");
                int maximo = 0;
                for (int i : lista) {
                    if (i > maximo) {
                        maximo = i;
                    }
                }
                System.out.println(maximo);

                System.out.println();

                System.out.println("Minimo: ");
                int minimo = lista.get(0);
                for (int i : lista) {
                    if (i < minimo) {
                        minimo = i;
                    }
                }
                System.out.println(minimo);
                seguir = false;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}