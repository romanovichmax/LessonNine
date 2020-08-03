import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TaskOne {
    private static String content = "";

    public static void readFileContent(String path) {
        Path filePath = Paths.get(path);

        try (Stream<String> lines = Files.lines(filePath)) {
            lines.forEach(line -> content += line + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileContent(String path) {
        Path filePath = Paths.get(path);

        try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
            writer.write(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}