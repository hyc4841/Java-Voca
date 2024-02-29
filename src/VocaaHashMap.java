import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class VocaaHashMap {

    private HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

    public void load() {
        try {
            // 파일객체 생성
            File file = new File("C:\\JAVA01\\voca1800.txt");
            FileReader reader = new FileReader(file);
            BufferedReader buf = new BufferedReader(reader);

            String line;
            while ((line = buf.readLine()) != null) { // ,로 끊어내서
                ArrayList<String> list = new ArrayList<String>();
                String[] parts = line.split(",");
                String eng = parts[0].trim();

                for (int i = 1; i < parts.length; i++) {
                    list.add(parts[i].trim());
                }
                map.put(eng,list);
            }
            Iterator<String> keys = map.keySet().iterator();
            while (keys.hasNext()) {
                String key = keys.next();
                System.out.println(key);
                System.out.println(map.get(key));
            }
            buf.close();

        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
