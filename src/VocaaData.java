import java.util.ArrayList;
import java.util.Arrays;

public class VocaaData { // 단어장 데이터 형식을 정하기 위한 클래스
    private String voca; // 영어단어
    private int cnt = 0;
    private String[] means = new String[cnt]; // 뜻

    public VocaaData(String voca, int cnt, ArrayList<String> means) { // 단어장 데이터 형식
        this.voca = voca;
        this.cnt = cnt;
        this.means = means.toArray(new String[0]);
    }

    public String getVoca() {
        return voca;
    }
    public void setVoca(String voca) {
        this.voca = voca;
    }
    public int getCnt() {
        return cnt;
    }
    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
    public String[] getMeans() {
        return means;
    }
    public void setMeans(String[] means) {
        this.means = means;
    }

    @Override
    public String toString() {
        return "VocaaData{" +
                "voca='" + voca + '\'' +
                ", cnt=" + cnt +
                ", means=" + Arrays.toString(means) +
                '}';
    }
}

