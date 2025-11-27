
import javax.swing.*;


public class jazzmenuGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new jazzmenuGUI().mainMenu());
    }

    private int parseCode(String s) {               // "3. Monthly" → 3
        return Integer.parseInt(s.split("\\.")[0]);
    }

    private int showMenu(String title, String[] opts) {
        String sel = (String) JOptionPane.showInputDialog(
                null, title, "JazzCash",
                JOptionPane.PLAIN_MESSAGE, null, opts, opts[0]);
        if (sel == null) {
            return -1;

        }
        return parseCode(sel);
    }

    private void info(String msg) {
        JOptionPane.showMessageDialog(null, msg,
                "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mainMenu() {
        final String[] main = {
            "1. Top Offers",
            "2. All in One Offers",
            "3. Super 4G Data Offers",
            "4. Super Social & SMS Offers",
            "5. Make Your Own Offer",
            "6. My Account",
            "7. Jazztunes",
            "8. Jazz on WhatsApp",
            "9. VAS (Value Added Services)",
            "99. More",
            "0. Exit"
        };
        while (true) {
            int c = showMenu("JazzCash Menu", main);
            switch (c) {
                case 1 ->
                    topOffers();
                case 2 ->
                    aioMenu();
                case 3 ->
                    super4GMenu();
                case 4 ->
                    socialSmsMenu();
                case 5 ->
                    makeOwnOffer();
                case 6 ->
                    myAccountMenu();
                case 7 ->
                    jazzTunesMenu();
                case 8 ->
                    jazzWhatsApp();
                case 9 ->
                    vasMenu();
                case 99 ->
                    moreMenu();
                case 0 -> {
                    return;
                }
                default ->
                    info("Thanks for using JazzCash!");  // for null/close
            }
        }
    }

    private void topOffers() {
        String[] opts = {
            "1. 1‑Hour 1 GB @ Rs 17",
            "2. Weekly Premium+ 5 GB @ Rs 304",
            "3. Weekly AIO @ Rs 278",
            "4. Monthly Super‑Duper @ Rs 1000",
            "5. 30‑Day 3 GB @ Rs 347",
            "0. Back"
        };
        while (true) {
            int c = showMenu("Top Offers", opts);
            if (c <= 0) {
                return;
            }
            if (c <= 5) {
                info("Subscribed to Top Offer " + c);
            }
        }
    }

    private void aioMenu() {
        String[] opts = {"1. Daily", "2. Weekly", "3. Monthly", "0. Back"};
        while (true) {
            int c = showMenu("All‑in‑One Offers", opts);
            switch (c) {
                case 1 ->
                    aioDaily();
                case 2 ->
                    aioWeekly();
                case 3 ->
                    aioMonthly();
                case 0 -> {
                    return;
                }
            }
        }
    }

    private void aioDaily() {
        String[] o = {
            "1. Friends Offer @ Rs 17",
            "2. Day Bundle @ Rs 14",
            "3. Super Offer @ Rs 34",
            "4. Super Plus Offer @ Rs 69",
            "0. Back"
        };
        while (true) {
            int c = showMenu("2.1 Daily AIO", o);
            if (c <= 0) {
                return;
            }
            if (c <= 4) {
                info("Subscribed to Daily AIO " + c);
            }
        }
    }

    private void aioWeekly() {
        String[] o = {
            "1. Weekly Freedom 50 GB @ Rs 504",
            "2. Weekly Hybrid @ Rs 173",
            "3. Weekly AIO @ Rs 278",
            "4. Weekly Super @ Rs 417",
            "0. Back"
        };
        while (true) {
            int c = showMenu("2.2 Weekly AIO", o);
            if (c <= 0) {
                return;
            }
            if (c <= 4) {
                info("Subscribed to Weekly AIO " + c);
            }
        }
    }

    private void aioMonthly() {
        String[] o = {
            "1. Monthly Freedom 100 GB @ Rs 1739",
            "2. Monthly Star @ Rs 1215",
            "3. Monthly Super‑Duper @ Rs 1000",
            "4. Monthly Super‑Duper+ @ Rs 1565",
            "0. Back"
        };
        while (true) {
            int c = showMenu("2.3 Monthly AIO", o);
            if (c <= 0) {
                return;
            }
            if (c <= 4) {
                info("Subscribed to Monthly AIO " + c);
            }
        }
    }

    private void super4GMenu() {
        String[] opts = {"1. Daily", "2. Weekly", "3. Monthly", "0. Back"};
        while (true) {
            int c = showMenu("Super 4G Data Offers", opts);
            switch (c) {
                case 1 ->
                    daily4G();
                case 2 ->
                    weekly4G();
                case 3 ->
                    monthly4G();
                case 0 -> {
                    return;
                }
            }
        }
    }

    private void daily4G() {
        String[] o = {
            "1. 1‑Hour 1 GB @ Rs 17",
            "2. Data Extreme @ Rs 35",
            "0. Back"
        };
        while (true) {
            int c = showMenu("3.1 Daily 4G", o);
            if (c <= 0) {
                return;
            }
            if (c <= 2) {
                info("Subscribed to Daily 4G " + c);
            }
        }
    }

    private void weekly4G() {
        String[] o = {
            "1. 30‑Day 3 GB @ Rs 304",
            "2. Weekly Premium+ 5 GB @ Rs 304",
            "3. Weekly Extreme @ Rs 104",
            "0. Back"
        };
        while (true) {
            int c = showMenu("3.2 Weekly 4G", o);
            if (c <= 0) {
                return;
            }
            if (c <= 3) {
                info("Subscribed to Weekly 4G " + c);
            }
        }
    }

    private void monthly4G() {
        String[] o = {
            "1. 30‑Day 3 GB @ Rs 347",
            "2. 30‑Day 10 GB Social + Voice/SMS @ Rs 347",
            "3. 30‑Day 5 GB @ Rs 608",
            "4. 30‑Day 15 GB @ Rs 869",
            "99. More",
            "0. Back"
        };
        while (true) {
            int c = showMenu("3.3 Monthly 4G", o);
            if (c == 0) {
                return;
            }
            if (c == 99) {
                info("5. 30‑Day 25 GB + Voice/SMS @ Rs 1390");
                continue;
            }
            if (c >= 1 && c <= 4) {
                info("Subscribed to Monthly 4G " + c);
            }
        }
    }

    private void socialSmsMenu() {
        String[] opts = {"1. Daily", "2. Weekly", "3. Monthly", "0. Back"};
        while (true) {
            int c = showMenu("Super Social & SMS Offers", opts);
            switch (c) {
                case 1 ->
                    socialDaily();
                case 2 ->
                    socialWeekly();
                case 3 ->
                    socialMonthly();
                case 0 -> {
                    return;
                }
            }
        }
    }

    private void socialDaily() {
        String[] o = {"1. Daily SMS Offer @ Rs 9.6", "0. Back"};
        while (true) {
            int c = showMenu("4.1 Daily SMS", o);
            if (c <= 0) {
                return;
            }
            if (c == 1) {
                info("Subscribed to Daily SMS Offer");
            }
        }
    }

    private void socialWeekly() {
        String[] o = {
            "1. Weekly Premium+ 5 GB @ Rs 304",
            "2. Weekly SMS Offer @ Rs 34",
            "0. Back"
        };
        while (true) {
            int c = showMenu("4.2 Weekly Social/SMS", o);
            if (c <= 0) {
                return;
            }
            if (c <= 2) {
                info("Subscribed to Weekly Social/SMS " + c);
            }
        }
    }

    private void socialMonthly() {
        String[] o = {
            "1. 30‑Day 10 GB Social + Voice/SMS @ Rs 347",
            "0. Back"
        };
        while (true) {
            int c = showMenu("4.3 Monthly Social/SMS", o);
            if (c <= 0) {
                return;
            }
            if (c == 1) {
                info("Subscribed to Monthly Social/SMS Offer");
            }
        }
    }

    private void makeOwnOffer() {
        String[] o = {
            "1. 1 Day Validity",
            "2. 7 Days Validity",
            "3. 30 Days Validity",
            "0. Back"
        };
        int c = showMenu("Make Your Own Offer", o);
        if (c <= 0) {
            return;
        }
        if (c <= 3) {
            info("Custom‑offer flow (validity " + c + ") coming soon!");
        }
    }

    private void myAccountMenu() {
        String[] o = {
            "1. Personal Info",
            "2. Package Plan & Balance",
            "3. Recharge Account",
            "4. Internet Settings",
            "5. Reactivation Offer Eligibility",
            "6. Tax Certificate",
            "7. FNF List",
            "0. Back"
        };
        while (true) {
            int c = showMenu("My Account", o);
            if (c <= 0) {
                return;
            }
            if (c <= 7) {
                info("My Account option " + c + " selected.");
            }
        }
    }

    private void jazzTunesMenu() {
        String[] o = {
            "1. Subscribe to Jazz Tunes",
            "2. Subscribe Apni Dhun",
            "3. Browse RBT",
            "4. Search RBT",
            "5. Top List",
            "6. Latest Uploads",
            "7. Service Manage",
            "0. Back"
        };
        while (true) {
            int c = showMenu("Jazztunes", o);
            if (c <= 0) {
                return;
            }
            if (c <= 7) {
                info("Jazztunes option " + c + " selected.");
            }
        }
    }

    private void jazzWhatsApp() {
        info("""
             Jazz WhatsApp – Everytime Everywhere!
             
             For best services, send "HI" to 0300‑3008000
             on WhatsApp from your smartphone.""");
    }

    private void vasMenu() {
        String[] o = {
            "1. List of Activated VAS",
            "2. New VAS Subscription",
            "3. VAS Un‑subscription",
            "4. Top VAS",
            "5. Best VAS for You",
            "0. Back"
        };
        while (true) {
            int c = showMenu("Value‑Added Services", o);
            if (c <= 0) {
                return;
            }
            if (c <= 5) {
                info("VAS option " + c + " selected.");
            }
        }
    }

    private void moreMenu() {
        String[] o = {
            "10. Block on Stolen / Restoration",
            "11. 4G Activation / Deactivation",
            "12. International Roaming",
            "13. Balance Share & Recharge History",
            "0. Back"
        };
        while (true) {
            int c = showMenu("More Options", o);
            switch (c) {
                case 10 ->
                    stolenMenu();
                case 11 ->
                    dataToggleMenu();
                case 12 ->
                    intlRoamingMenu();
                case 13 ->
                    balanceHistoryMenu();
                case 0 -> {
                    return;
                }
            }
        }
    }

    private void stolenMenu() {
        String[] o = {"1. Number Blocking", "2. Number Restoration", "0. Back"};
        while (true) {
            int c = showMenu("SIM Blocking", o);
            if (c <= 0) {
                return;
            }
            if (c <= 2) {
                info("SIM Blocking option " + c + " selected.");
            }
        }
    }

    private void dataToggleMenu() {
        String[] o = {"1. Data ON", "2. Data OFF", "0. Back"};
        while (true) {
            int c = showMenu("4G Activation / Deactivation", o);
            if (c <= 0) {
                return;
            }
            if (c == 1 || c == 2) {
                info("Data " + (c == 1 ? "ON" : "OFF") + " requested.");
            }
        }
    }

    private void intlRoamingMenu() {
        String[] o = {
            "1. IR Internet Bundles (30+ countries)",
            "2. Saudi Bundles",
            "3. IR Activation / Deactivation",
            "4. IR Information",
            "5. IR Tips",
            "0. Back"
        };
        while (true) {
            int c = showMenu("International Roaming", o);
            if (c <= 0) {
                return;
            }
            if (c <= 5) {
                info("IR option " + c + " selected.");
            }
        }
    }

    private void balanceHistoryMenu() {
        String[] o = {"1. Balance Share History", "2. Balance History", "0. Back"};
        while (true) {
            int c = showMenu("Balance & Share History", o);
            if (c <= 0) {
                return;
            }
            if (c == 1 || c == 2) {
                info("Balance history option " + c + " selected.");
            }
        }
    }
}
