import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class VocaaMng {
    private ArrayList<VocaaData> list;
    private String file;

    public VocaaMng(ArrayList<VocaaData> list, String file) {
        this.list = list;
        this.file = file;
        list = new ArrayList<>();
    }

    public void load() {
        try {
            // 파일객체 생성
            File file = new File("C:\\JAVA01\\voca1800.txt");
            FileReader reader = new FileReader(file);
            BufferedReader buf = new BufferedReader(reader);

            String line;
            while ((line = buf.readLine()) != null) { // ,로 끊어내서
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                String voca = tokenizer.nextToken();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void vocain() {

    }

    public void vocaremove() {

    }

    public void vocasearch() {

    }
}
