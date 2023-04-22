import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/taren/IdeaProjects/RegularExpressions/src/in");
        String text = null;

        try {
            byte[] encoded = Files.readAllBytes(path);
            text = new String(encoded);
        }
            catch (IOException e) {
            e.printStackTrace();
        }

        String text1 = text.replaceAll("\\n", "");
        Pattern pattern = Pattern.compile("[A-zА-я0-9\\s]*[A-zА-я0-9]\\?");
        Matcher matcher = pattern.matcher(text1);
        while (matcher.find()) {
            System.out.println(text1.substring(matcher.start(), matcher.end()));
        }
    }
}