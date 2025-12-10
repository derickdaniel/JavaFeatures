package com.derick.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class F4_NewFileMethods {

    static void main() throws IOException {
        Path tempDir = Path.of("d:/");
        Path filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
        System.out.println("Sample text".equals(fileContent));
    }
}
