
import java.util.Scanner;
public class jazzmenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to JazzCash!");

        while (true) {
            System.out.println("\nJazzCash Menu:");
            System.out.println("1. Top Offers");
            System.out.println("2. All in One Offers");
            System.out.println("3. Super 4G Data Offers");
            System.out.println("4. Super Social & SMS Offers");
            System.out.println("5. Make Your Own Offer");
            System.out.println("6. My Account");
            System.out.println("7. Jazztunes");
            System.out.println("8. Jazz on WhatsApp");
            System.out.println("9. VAS (Value Added Services)");
            System.out.println("99. More");
            System.out.println("0. Exit");
            System.out.print("Enter Jazz Menu Code: ");

            int code = readInt(sc);
            switch (code) {
                case 1 ->
                    topOffers(sc);
                case 2 ->
                    aioOffers(sc);
                case 3 ->
                    super4G(sc);
                case 4 ->
                    socialSms(sc);
                case 5 ->
                    makeYourOwnOffer(sc);
                case 6 ->
                    myAccount(sc);
                case 7 ->
                    jazzTunes(sc);
                case 8 ->
                    jazzWhatsApp(sc);
                case 9 ->
                    vasMenu(sc);
                case 99 ->
                    moreMenu(sc);
                case 0 -> {
                    System.out.println("Thank you for using JazzCash!");
                    sc.close();
                    return;
                }
                default ->
                    System.out.println("Invalid menu code. Please try again.");
            }
        }
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static void waitForEnter(Scanner sc) {
        System.out.print("Press Enter to continue...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void topOffers(Scanner sc) {
        while (true) {
            System.out.println("\n1️⃣  Top Offers");
            System.out.println("1. 1‑Hour 1 GB      @ Rs 17");
            System.out.println("2. Weekly Premium+ 5 GB @ Rs 304");
            System.out.println("3. Weekly AIO           @ Rs 278");
            System.out.println("4. Monthly Super‑Duper  @ Rs 1000");
            System.out.println("5. 30‑Day 3 GB          @ Rs 347");
            System.out.println("0. Back");
            System.out.print("Select your option: ");

            int choice = readInt(sc);
            if (choice == 0) {
                return;
            }
            if (choice >= 1 && choice <= 5) {
                System.out.println("You selected Top Offer " + choice + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void aioOffers(Scanner sc) {
        while (true) {
            System.out.println("\n2️⃣  All‑in‑One Offers");
            System.out.println("1. Daily");
            System.out.println("2. Weekly");
            System.out.println("3. Monthly");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int sub = readInt(sc);

            switch (sub) {
                case 0 -> {
                    return;
                }
                case 1 ->
                    aioDaily(sc);
                case 2 ->
                    aioWeekly(sc);
                case 3 ->
                    aioMonthly(sc);
                default ->
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void aioDaily(Scanner sc) {
        while (true) {
            System.out.println("\n2.1  Daily AIO");
            System.out.println("1. Friends Offer         @ Rs 17");
            System.out.println("2. Day Bundle            @ Rs 14");
            System.out.println("3. Super Offer           @ Rs 34");
            System.out.println("4. Super Plus Offer      @ Rs 69");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c >= 1 && c <= 4) {
                System.out.println("You selected Daily AIO " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void aioWeekly(Scanner sc) {
        while (true) {
            System.out.println("\n2.2  Weekly AIO");
            System.out.println("1. Weekly Freedom 50 GB  @ Rs 504");
            System.out.println("2. Weekly Hybrid         @ Rs 173");
            System.out.println("3. Weekly AIO            @ Rs 278");
            System.out.println("4. Weekly Super          @ Rs 417");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c >= 1 && c <= 4) {
                System.out.println("You selected Weekly AIO " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void aioMonthly(Scanner sc) {
        while (true) {
            System.out.println("\n2.3  Monthly AIO");
            System.out.println("1. Monthly Freedom 100 GB @ Rs 1739");
            System.out.println("2. Monthly Star          @ Rs 1215");
            System.out.println("3. Monthly Super‑Duper   @ Rs 1000");
            System.out.println("4. Monthly Super‑Duper+  @ Rs 1565");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c >= 1 && c <= 4) {
                System.out.println("You selected Monthly AIO " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void super4G(Scanner sc) {
        while (true) {
            System.out.println("\n3️⃣  Super 4G Data Offers");
            System.out.println("1. Daily");
            System.out.println("2. Weekly");
            System.out.println("3. Monthly");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int sub = readInt(sc);

            switch (sub) {
                case 0 -> {
                    return;
                }
                case 1 ->
                    super4GDaily(sc);
                case 2 ->
                    super4GWeekly(sc);
                case 3 ->
                    super4GMonthly(sc);
                default ->
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void super4GDaily(Scanner sc) {
        while (true) {
            System.out.println("\n3.1  Daily 4G Data");
            System.out.println("1. 1‑Hour 1 GB      @ Rs 17");
            System.out.println("2. Data Extreme     @ Rs 35");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c == 1 || c == 2) {
                System.out.println("You selected Daily 4G " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void super4GWeekly(Scanner sc) {
        while (true) {
            System.out.println("\n3.2  Weekly 4G Data");
            System.out.println("1. 30‑Day 3 GB             @ Rs 304");
            System.out.println("2. Weekly Premium+ 5 GB    @ Rs 304");
            System.out.println("3. Weekly Extreme          @ Rs 104");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c >= 1 && c <= 3) {
                System.out.println("You selected Weekly 4G " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void super4GMonthly(Scanner sc) {
        while (true) {
            System.out.println("\n3.3  Monthly 4G Data");
            System.out.println("1. 30‑Day 3 GB                 @ Rs 347");
            System.out.println("2. 30‑Day 10 GB + Voice/SMS    @ Rs 347");
            System.out.println("3. 30‑Day 5 GB                 @ Rs 608");
            System.out.println("4. 30‑Day 15 GB                @ Rs 869");
            System.out.println("99. More");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);

            if (c == 0) {
                return;
            }
            if (c == 99) {
                System.out.println("5. 30‑Day 25 GB + Voice/SMS  @ Rs 1390");
                waitForEnter(sc);
                continue;
            }
            if (c >= 1 && c <= 4) {
                System.out.println("You selected Monthly 4G " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void socialSms(Scanner sc) {
        while (true) {
            System.out.println("\n4️⃣  Super Social & SMS Offers");
            System.out.println("1. Daily");
            System.out.println("2. Weekly");
            System.out.println("3. Monthly");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int sub = readInt(sc);

            switch (sub) {
                case 0 -> {
                    return;
                }
                case 1 ->
                    socialDaily(sc);
                case 2 ->
                    socialWeekly(sc);
                case 3 ->
                    socialMonthly(sc);
                default ->
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void socialDaily(Scanner sc) {
        while (true) {
            System.out.println("\n4.1  Daily Social/SMS");
            System.out.println("1. Daily SMS Offer  @ Rs 9.6");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c == 1) {
                System.out.println("You selected Daily SMS Offer.");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void socialWeekly(Scanner sc) {
        while (true) {
            System.out.println("\n4.2  Weekly Social/SMS");
            System.out.println("1. Weekly Premium+ 5 GB @ Rs 304");
            System.out.println("2. Weekly SMS Offer      @ Rs 34");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c == 1 || c == 2) {
                System.out.println("You selected Weekly Social/SMS " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void socialMonthly(Scanner sc) {
        while (true) {
            System.out.println("\n4.3  Monthly Social/SMS");
            System.out.println("1. 30‑Day 10 GB Social + Voice/SMS  @ Rs 347");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c == 1) {
                System.out.println("You selected Monthly Social/SMS Offer.");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void makeYourOwnOffer(Scanner sc) {
        System.out.println("\n5️⃣  Make Your Own Offer");
        System.out.println("Select offer validity:");
        System.out.println("1. 1 Day");
        System.out.println("2. 7 Days");
        System.out.println("3. 30 Days");
        System.out.println("0. Back");
        System.out.print("Select your option: ");
        int c = readInt(sc);
        if (c == 0) {
            return;
        }
        if (c >= 1 && c <= 3) {
            System.out.println("You selected validity option " + c + ". Further customization coming soon!");
            waitForEnter(sc);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static void myAccount(Scanner sc) {
        while (true) {
            System.out.println("\n6️⃣  My Account");
            System.out.println("1. Personal Info");
            System.out.println("2. My Package Plan & Balance");
            System.out.println("3. Recharge Account");
            System.out.println("4. Internet Settings");
            System.out.println("5. Reactivation Offer Eligibility");
            System.out.println("6. Tax Certificate");
            System.out.println("7. FNF List");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c >= 1 && c <= 7) {
                System.out.println("You selected My Account option " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void jazzTunes(Scanner sc) {
        while (true) {
            System.out.println("\n7️⃣  Jazztunes");
            System.out.println("1. Subscribe to Jazz Tunes");
            System.out.println("2. Subscribe Apni Dhun");
            System.out.println("3. Browse RBT");
            System.out.println("4. Search RBT");
            System.out.println("5. Top List");
            System.out.println("6. Latest Uploads");
            System.out.println("7. Service Manage");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c >= 1 && c <= 7) {
                System.out.println("You selected Jazztunes option " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void jazzWhatsApp(Scanner sc) {
        System.out.println("\n8️⃣  Jazz on WhatsApp");
        System.out.println("Jazz WhatsApp – Everytime Everywhere!");
        System.out.println("For best services, send \"HI\" to 0300‑3008000 on WhatsApp from your smartphone.");
        System.out.println("0. Back");
        System.out.print("Press 0 to go back: ");
        readInt(sc);
    }

    private static void vasMenu(Scanner sc) {
        while (true) {
            System.out.println("\n9️⃣  Value‑Added Services (VAS)");
            System.out.println("1. List of Activated VAS");
            System.out.println("2. New VAS Subscription");
            System.out.println("3. VAS Un‑subscription");
            System.out.println("4. Top VAS");
            System.out.println("5. Best VAS for You");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c >= 1 && c <= 5) {
                System.out.println("You selected VAS option " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void moreMenu(Scanner sc) {
        while (true) {
            System.out.println("\n9️⃣9️⃣  More Options");
            System.out.println("10. Block on Stolen / Restoration");
            System.out.println("11. 4G Activation / Deactivation");
            System.out.println("12. International Roaming");
            System.out.println("13. Balance Share & Recharge History");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);

            switch (c) {
                case 0 -> {
                    return;
                }
                case 10 ->
                    stolenMenu(sc);
                case 11 ->
                    dataToggleMenu(sc);
                case 12 ->
                    intlRoamingMenu(sc);
                case 13 ->
                    balanceHistory(sc);
                default ->
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void stolenMenu(Scanner sc) {
        while (true) {
            System.out.println("\n10️⃣  SIM Blocking");
            System.out.println("1. Number Blocking");
            System.out.println("2. Number Restoration");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c == 1 || c == 2) {
                System.out.println("You selected SIM Blocking option " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void dataToggleMenu(Scanner sc) {
        while (true) {
            System.out.println("\n11️⃣  4G Activation/Deactivation");
            System.out.println("1. Data ON");
            System.out.println("2. Data OFF");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c == 1 || c == 2) {
                System.out.println("You selected Data " + (c == 1 ? "ON" : "OFF") + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void intlRoamingMenu(Scanner sc) {
        while (true) {
            System.out.println("\n12️⃣  International Roaming");
            System.out.println("1. IR Internet Bundles (30+ countries)");
            System.out.println("2. Saudi Bundles");
            System.out.println("3. IR Activation / Deactivation");
            System.out.println("4. IR Information");
            System.out.println("5. IR Tips");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c >= 1 && c <= 5) {
                System.out.println("You selected IR option " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void balanceHistory(Scanner sc) {
        while (true) {
            System.out.println("\n13️⃣  Balance & Share History");
            System.out.println("1. Balance Share History");
            System.out.println("2. Balance History");
            System.out.println("0. Back");
            System.out.print("Select your option: ");
            int c = readInt(sc);
            if (c == 0) {
                return;
            }
            if (c == 1 || c == 2) {
                System.out.println("You selected Balance option " + c + ".");
                waitForEnter(sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

