package Solid.Example3.BetterCode;
import java.io.IOException;

public class TextProcessor {

    private FileProcessor fileProcessor;;
    public TextProcessor(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }
    public void convertText(){
        try {
            String inputText = this.fileProcessor.readAllText();
            String[] paragraphs = inputText.split("(\\r\\n?|\\n)");

            StringBuilder sb = new StringBuilder();
            for (String paragraph : paragraphs) {
                if (paragraph.trim().isEmpty()) {
                    continue;
                }
                sb.append("<p>").append(paragraph).append("</p>\n");
            }
            sb.append("<br/>\n");

            this.fileProcessor.writeToFile(sb.toString());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Press any key to exit.");
        try {
            System.in.read();  // Wait for a key press to exit
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
