package The1;

public class Skor {
     int skorkor(int pjaga, int pnendang, int skor1, int skor2, int tukar) {
        if (tukar == 0) {
            if (pjaga != pnendang)
                skor1 = skor1 + 1;

            return skor1;
        } else {
            if (pjaga != pnendang)
                skor2 = skor2 + 1;

            return skor2;
        }
    }

    public void pemenang(int skor1, int skor2, String tim1, String tim2) {
        System.out.print("\n\n");
        System.out.println("\t| "+skor1+" | "+skor2+" |");
        if (skor1 > skor2) {
            System.out.println(tim1 + " MENANG!!!!! ");
        } else if (skor1 < skor2){
            System.out.println(tim2 + " MENANG!!!!! ");
        } else {
            System.out.println("Hasil Seri");
        }
    }
}