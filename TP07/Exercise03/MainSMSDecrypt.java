package Exercise03;

import java.util.Scanner;

public class MainSMSDecrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SMSListDecrypt smses = new SMSListDecrypt();
        smses.loadSMS();
        int choice;
        do {
            smses.readMenuDe();
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    smses.show();
                    break;
                }
                case 2: {
                    smses.viewDetail();
                    break;
                }
                case 3: {
                    smses.showDecryptionMessage();
                    break;
                }
                case 4: {
                    smses.remove();
                    break;
                }
                case 5: {
                    smses.writeInFile();
                    System.out.println("Bye! Bye! have a good day");
                    break;
                }
            }
        } while (choice != 5);
    }
}