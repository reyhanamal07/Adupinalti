package The1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inputan input = new Inputan();
        Skor score = new Skor();
        StatusGol status = new StatusGol();
        Pemain pemain = new Pemain();

        int menu = 5, idTim1 = 0, idTim2 = 0, tukar = 0, pnendang, giliran = 0, skor1 = 0, skor2 = 0, pjaga;
        String[] timList = {" ", "Liverpool", "Real Madrid"};
        String tim1, tim2;

        System.out.println("\n PERMAINAN ADU PENALTI");
        do {
            System.out.println(" Menu Pilihan :");
            System.out.println(" 1. Mulai");
            System.out.println(" 2. Keluar");

            menu = input.cekInput(menu);
            if(menu != 1 && menu !=2)
                System.out.println("Pilihan " + menu + " Tidak Ada \n Ulangi Pilihan ");
        }while(menu != 1 && menu !=2);

        switch (menu) {
            case 1 : 
                System.out.println("\n  Pemilihan Tim");
                for (int i=1; i<=2; i++) {
                    System.out.println( i + ". " + timList [i] );
                }

                System.out.println("\nPlayer 1 : "); 
                do {
                        idTim1 = input.cekInput(idTim1);
                        if (idTim1>=1 && idTim1<=2) {
                            System.out.print("\nInputan Benar");
                        }else {
                            System.out.print("\nAnda Salah Input");
                            System.out.print("\nUlangi Inputan");
                        }
                    } while (idTim1 > 2);
                
                System.out.println("\nPlayer 2 : "); 
                do {
                        idTim2 = input.cekInput(idTim2);
                        if (idTim2>=1 && idTim2<=2)
                            System.out.print("\nInputan Benar");
                        else {
                            System.out.print("\nAnda Salah Input");
                            System.out.print("\nUlangi Inputan");
                        }
                    } while (idTim2 > 2);

                System.out.println("\n\tTekan [ENTER] untuk mulai");
                System.out.print("\t");
                sc.nextLine();

                tim1 = timList[idTim1];
                tim2 = timList[idTim2];

                do { //whilenya (giliran<10);
                    if (tukar == 0){
                        do {
                            pnendang = pemain.penendang(tukar, skor1, skor2, tim1, tim2);
                            pnendang = input.cekInput(pnendang);
                            if(pnendang > 9){
                                System.out.print("\nAnda Salah Input");
                                System.out.print("\nUlangi Inputan");
                            }
                        }while(pnendang > 9);

                        do {
                            pjaga = pemain.penjaga(tukar, skor1, skor2, tim1, tim2);
                            pjaga = input.cekInput(pjaga);
                            if(pjaga > 9){
                                System.out.print("\nAnda Salah Input");
                                System.out.print("\nUlangi Inputan");
                            }
                        }while(pjaga > 9);
                        skor1 = score.skorkor(pjaga, pnendang, skor1, skor2, tukar);

                        status.statusGoal(pjaga, pnendang);

                        tukar = 1;
                        System.out.print("\nTekan [ENTER] untuk melanjutkan"); 
                        sc.nextLine();

                    } else {
                        do {
                            pnendang = pemain.penendang(tukar, skor1, skor2, tim1, tim2);
                            pnendang = input.cekInput(pnendang);
                            if(pnendang > 9){
                                System.out.print("\nAnda Salah Input");
                                System.out.print("\nUlangi Inputan");
                            }
                        }while(pnendang > 9);

                        do {
                            pjaga = pemain.penjaga(tukar, skor1, skor2, tim1, tim2);
                            pjaga = input.cekInput(pjaga);
                            if(pjaga > 9){
                                System.out.print("\nAnda Salah Input");
                                System.out.print("\nUlangi Inputan");
                            }
                        }while(pjaga > 9);
                        skor2 = score.skorkor(pjaga, pnendang, skor1, skor2, tukar);

                        status.statusGoal(pjaga, pnendang);

                        tukar = 0;

                        System.out.print("\nTekan [ENTER] untuk melanjutkan"); 
                        sc.nextLine();
                    }

                    giliran = giliran + 1;

                } while (giliran<2);

                score.pemenang(skor1,skor2,tim1,tim2);

            break;

            case 2 :
                System.out.println("Program Berakhir");
                System.exit(0);
            break;
        }

    }
}