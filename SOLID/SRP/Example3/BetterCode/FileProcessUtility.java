package SOLID.SRP.Example3.BetterCode;
import java.io.IOException;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileProcessUtility {
    private String filePath;
    private static final String REGEX = "[.]";

    public FileProcessUtility(String filePath) {
        this.filePath = filePath;
    }

    public String readFile() throws IOException{
       String content = new String(Files.readAllBytes(Paths.get(this.filePath)));
       return content;
    }

    public void writeFile(String content) {
        String outputFilePath = Paths.get(this.filePath).getFileName().toString().replaceFirst(REGEX, content);
        try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath))){
            writer.write(content);
        }catch (IOException e){
            e.printStackTrace();
        }
        
    }
}
