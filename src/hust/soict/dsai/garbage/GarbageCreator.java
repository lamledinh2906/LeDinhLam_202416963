package hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws Exception {
        String filename = "test.exe"; // Hãy chọn một file nặng tầm vài MB trong máy bạn
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        long startTime = System.currentTimeMillis();
        
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char)b; // Đây là cách tạo ra cực kỳ nhiều rác
        }
        
        System.out.println("Processing time (+): " + (System.currentTimeMillis() - startTime) + "ms");
    }
}