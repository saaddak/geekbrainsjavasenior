package ru.geekbrains.javasenior.chat.client;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ClientIO {
    private String userLogFile;
    ClientIO(String userLogFile) {
        this.userLogFile = userLogFile;
    }

    String getFileName() {
        return userLogFile;
    }
    void setFileName(String userLogFile) {
        this.userLogFile = userLogFile;
    }

    void writeFile(String userLog) {
        try {
            FileWriter writer = new FileWriter(userLogFile, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(userLog + "\n");
            bufferWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String readFile() {
        try {
            BufferedReader mustek = new BufferedReader(new InputStreamReader(new FileInputStream(userLogFile), StandardCharsets.UTF_8));
            int currentChar;
            StringBuilder sb = new StringBuilder();
            while ((currentChar = mustek.read()) != -1) {
                sb.append((char) currentChar);
            }
            mustek.close();
            return sb.toString();
        } catch (IOException e) {
            return "";
        }
    }
}
