import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int win = 0;
        int lost = 0;
        int allMatches = 0;

        while (!command.equals("End of tournaments")) {

            int matches = Integer.parseInt(scanner.nextLine());
            allMatches += matches;
            for (int i = 1; i <= matches; i++) {
                int myPoints = Integer.parseInt(scanner.nextLine());
                int otherPoints = Integer.parseInt(scanner.nextLine());

                if (myPoints > otherPoints) {
                    win++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, command, myPoints - otherPoints);
                } else {
                    lost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, command, Math.abs(myPoints - otherPoints));
                }
            }

            command = scanner.nextLine();
        }

        double percentWin = win * 1.0 / allMatches * 100;
        double percentLost = lost * 1.0 / allMatches * 100;

        System.out.printf("%.2f%% matches win%n", percentWin);
        System.out.printf("%.2f%% matches lost%n", percentLost);
    }
}
