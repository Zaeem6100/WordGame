import java.io.*;
import java.util.LinkedHashSet;

public class Loading_Data {
    private LinkedHashSet<String> hs = new LinkedHashSet<String>();

    public Loading_Data() {

    }

    public LinkedHashSet<String> ReadData(String filename) throws IOException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = br.readLine()) != null) {
            hs.add(line);
        }
        return hs;
    }

    public LinkedHashSet<String> getHs() {
        return hs;
    }
}
