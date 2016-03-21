
import java.util.ArrayList;

public class Main {

    public static ArrayList<Member> member = new ArrayList<>();

    public static void main(String[] args) {
        Member me1 = new Member();
        Member me2 = new Member();
        Member me3 = new Member();

        me1.setName("Irma Nurvianti");
        me1.setTeam("J");
        me1.setAge(18);
        me1.setPerformance(90);
        me1.setVoice(95);
        me1.setAttitude(90);

        me2.setName("Ariana Grande");
        me2.setTeam("K");
        me2.setAge(23);
        me2.setPerformance(80);
        me2.setVoice(85);
        me2.setAttitude(75);

        me3.setName("Demi Lovato");
        me3.setTeam("T");
        me3.setAge(28);
        me3.setPerformance(100);
        me3.setVoice(100);
        me3.setAttitude(85);

        member.add(me1);
        member.add(me2);
        member.add(me3);
        result();
    }

    public static void result() {
        System.out.println(" >>>>>>>>>> Member MLG 48 <<<<<<<<<< ");
        System.out.println("------------------------------------");
        for (int i = 0; i < member.size(); i++) {
            System.out.println("Nama\t\t: " + member.get(i).getName());
            System.out.println("Team\t\t: " + member.get(i).getTeam());
            System.out.println("Umur\t\t: " + member.get(i).getAge() + " tahun");
            System.out.println("Nilai Rata-rata\t: " + member.get(i).getScore());
            System.out.println("------------------------------------");
        }
    }
}
