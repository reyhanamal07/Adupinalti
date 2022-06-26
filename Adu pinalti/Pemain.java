package The1;

public class Pemain {
    Arena arn = new Arena();
    int penendang (int tukar, int skor1, int skor2, String tim1, String tim2)   {
        arn.arenagawang(skor1, skor2, tim1, tim2);

        if (tukar == 0) {
                System.out.println("\n  Giliran Menendang :");
                System.out.println("\n   [Player 1] <-\n [Player 2]");
        } else {
                System.out.println("\n  Giliran Menendang :");
                System.out.println("\n [Player 1]\n   [Player 2] <-");
        }
        return 0;
    }

    int penjaga (int tukar, int skor1, int skor2, String tim1, String tim2)   {
        arn.arenagawang(skor1, skor2, tim1, tim2);
        
        if (tukar == 0) {
             System.out.println("\n  Giliran Menangkap :");
             System.out.println("\n [Player 1]\n   [Player 2] <-");
        } else {
               System.out.println("\n  Giliran Menangkap :");
               System.out.println("\n   [Player 1] <-\n [Player 2]");
        }
        return 0;
    }
}
