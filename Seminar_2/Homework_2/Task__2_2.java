import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task__2_2 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 1, 4};
        FileWriter writer = null;
        
        try {
            writer = new FileWriter("log.txt");
            writer.write("Исходный массив: " + Arrays.toString(arr) + "\n");

            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                writer.write("Итерация " + (i + 1) + ": " + Arrays.toString(arr) + "\n");
            }

            writer.write("Отсортерованный массив: " + Arrays.toString(arr));
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {                 // закрытие объекта FileWriter.
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


