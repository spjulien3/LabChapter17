package Program2;

import java.io.*;
import java.util.Random;

public class FileInOutBinary {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        File file = new File("src/Program2/Exercise17_02.dat");
        boolean append = file.exists();
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file, append))) {
            for (int i = 0; i < 100; i++) {
                out.writeInt(random.nextInt());
            }
        }
        try ( //testing to see if the program can read back the numbers
              DataInputStream input = new DataInputStream(new FileInputStream(file));
        ) {
            System.out.println(input.readInt() + " " + input.readInt());
            System.out.println(input.readInt() + " " + input.readInt());
            System.out.println(input.readInt() + " " + input.readInt());
        }

    }
}
