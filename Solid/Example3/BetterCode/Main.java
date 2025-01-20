package Solid.Example3.BetterCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        System.out.println("Please specify the full file path to convert to HTML.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fullFilePath = reader.readLine();
        
        FileProcessor fileProcessor = new FileProcessor(fullFilePath);
        TextProcessor textProcessor = new TextProcessor(fileProcessor);
        textProcessor.convertText();
    }
}
