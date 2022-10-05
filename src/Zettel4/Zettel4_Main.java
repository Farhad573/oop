package Zettel4;

public class Zettel4_Main {

    public static void main(String[] args) {
        showBillboard("");
    }

    private static void showBillboard(String message) {
        String upperHand = "ooO-----(_)--------";
         String downHand = "----------------Ooo";
         String firstline = "                   ";
         String secondline = "                   ";
         String hair= "       \\|||||/";
         String eyes= "       ( O O )";
         String firstleg= "       |_| |_|";
         String secondleg= "        || ||";
         String thirdleg= "       ooO Ooo";
        if(message.length() > 84) {
            System.out.println("the text is too long and can not be printed");
        }
        else {
            String m = message;
            int counter = message.length() - 19;
            int a = counter / 2;

            int space = message.length() - 19;

            if (counter > 0) {
                while (a > 0) {
                    hair = " " + hair;
                    eyes = " " + eyes;
                    firstleg = " " + firstleg;
                    secondleg = " " + secondleg;
                    thirdleg = " " + thirdleg;
                    upperHand = "-" + upperHand;
                    downHand = "-" + downHand;
                    firstline = " " + firstline;
                    secondline = " " + secondline;
                    a--;
                }
                if (counter % 2 == 0) {
                    upperHand = upperHand + "-".repeat(space / 2);
                    downHand = downHand + "-".repeat(space / 2);
                    firstline = firstline + " ".repeat(space / 2);
                    secondline = secondline + " ".repeat(space / 2);

                } else if (counter % 2 == 1) {

                    upperHand = upperHand + "-".repeat((space + 1) / 2);
                    downHand = downHand + "-".repeat((space + 1) / 2);
                    firstline = firstline + " ".repeat((space + 1) / 2);
                    secondline = secondline + " ".repeat((space + 1) / 2);

                }
                hair = " " + hair;
                eyes = " " + eyes;
                firstleg = " " + firstleg;
                secondleg = " " + secondleg;
                thirdleg = " " + thirdleg;
                upperHand = "|" + "-" + upperHand + "-" + "|";
                downHand = "|" + "-" + downHand + "-" + "|";
                firstline = "|" + " " + firstline + " " + "|";
                secondline = "|" + " " + secondline + " " + "|";
            } else {
                upperHand = "|" + upperHand + "|";
                downHand = "|" + downHand + "|";
                firstline = "|" + firstline + "|";
                secondline = "|" + secondline + "|";
            }
            System.out.println(hair);
            System.out.println(eyes);
            System.out.println(upperHand);
            System.out.println(firstline);
            int spacenum = 19 - message.length();
            if (message.length() > 19) {
                System.out.println("|" + " " + m + " " + "|");
            } else if (spacenum % 2 == 0) {
                System.out.println("|" + " ".repeat(spacenum / 2) + m + " ".repeat(spacenum / 2) + "|");

            } else {
                System.out.println("|" + " ".repeat(spacenum / 2) + m + " ".repeat((spacenum + 1) / 2) + "|");
            }


            System.out.println(secondline);
            System.out.println(downHand);
            System.out.println(firstleg);
            System.out.println(secondleg);
            System.out.println(thirdleg);


        }
    }
}
