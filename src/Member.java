
public class Member {

    private String name;
    private String team;
    private int age;
    private int nilaiPerformance;
    private int nilaiVoice;
    private int nilaiAttitude;

    public void setName(String n) {
        name = n;
    }

    public void setTeam(String t) {
        team = t;
    }

    public void setAge(int u) {
        age = u;
    }

    public void setPerformance(int p) {
        nilaiPerformance = p;
    }

    public void setVoice(int s) {
        nilaiVoice = s;
    }

    public void setAttitude(int a) {
        nilaiAttitude = a;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    public int getPerformance() {
        return nilaiPerformance;
    }

    public int getVoice() {
        return nilaiVoice;
    }

    public int getAttitude() {
        return nilaiAttitude;
    }

    public double getScore() {
        double result = 0;
        result = (nilaiPerformance + nilaiVoice + nilaiAttitude) / 3;
        return result;
    }
}
