import java.io.*;

public class GameHelper {
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            inputLine = bufferedReader.readLine();

            if (inputLine.length() == 0) return null;
        } catch (Exception e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
