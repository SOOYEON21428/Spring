package sample04;

public class SungJukDTO2 {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int tot;
    private double avg;

    @Override
    public String toString() {
        return name + "\t"
                + kor + "\t"
                + eng + "\t"
                + math + "\t"
                + tot + "\t"
                + avg + "\t";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getKor() {
        return kor;
    }
}
