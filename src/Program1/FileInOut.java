package Program1;

import java.io.*;
import java.util.Random;

public class FileInOut {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        File file = new File("src/Program1/Exercise17_01.txt");

        boolean b = file.exists();
        try (PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file, b)))) {
            for (int i = 0; i < 100; i++) {
                printWriter.write((random.nextInt(100)  + " "));
            }
            printWriter.write("\n");
        }
    }
}

