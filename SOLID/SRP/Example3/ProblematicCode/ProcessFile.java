package SOLID.SRP.Example3.ProblematicCode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProcessFile {
    private String filePath;
    private static final String REGEX = "[.]";

    public ProcessFile(String filePath) {
        this.filePath = filePath;
    }

    public String readFile() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(this.filePath)));
        return content;
    }

    public void convertText(String text) {

    }

    public void writeFile(String content) {
        String outputFilePath = Paths.get(this.filePath).getFileName().toString().replaceFirst(REGEX, content);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
