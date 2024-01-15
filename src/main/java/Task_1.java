import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Написать программу, которая подсчитывает
   повторяющиеся символы в заданной строке. */
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        Map<String, Integer> symbols = new HashMap<>();
        String[] buffer = line.split("");
        for (String character: buffer) {
            if(symbols.get(character) == null){
                symbols.put(character, 1);
            } else {
                symbols.put(character, symbols.get(character) + 1);
            }
        }
        for (String symbol: symbols.keySet()) {
            if(symbols.get(symbol) > 1){
                System.out.println(symbol + " - " + symbols.get(symbol));
            }
        }
    }
}
