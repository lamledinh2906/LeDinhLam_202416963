package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws Exception {
        String filename = "test.exe"; 
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        long startTime = System.currentTimeMillis();
        
        StringBuilder outputString = new StringBuilder();
        for (byte b : inputBytes) {
            outputString.append((char)b); // Tối ưu, không tạo rác
        }
        
        System.out.println("Processing time (StringBuilder): " + (System.currentTimeMillis() - startTime) + "ms");
    }
}