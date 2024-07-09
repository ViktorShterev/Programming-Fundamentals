package FinalExamPrep2;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> list = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String [] pieces = scanner.nextLine().split("\\|");
            String piece = pieces[0];
            String composer = pieces[1];
            String key = pieces[2];

            list.put(piece, new ArrayList<>());
            list.get(piece).add(0, composer);
            list.get(piece).add(1, key);
        }
        String command = scanner.nextLine();

        while (!command.equals("Stop")) {

            if (command.startsWith("Add")) {
                String addPiece = command.split("\\|")[1];
                String addComposer = command.split("\\|")[2];
                String addKey = command.split("\\|")[3];

                if (list.containsKey(addPiece)) {
                    System.out.println(addPiece + " is already in the collection!");
                } else {
                    list.put(addPiece, new ArrayList<>());
                    list.get(addPiece).add(0, addComposer);
                    list.get(addPiece).add(1, addKey);
                    System.out.printf("%s by %s in %s added to the collection!%n", addPiece, addComposer, addKey);
                }
            } else if (command.startsWith("Remove")) {
                String removePiece = command.split("\\|")[1];
                if (list.containsKey(removePiece)) {
                    list.remove(removePiece);
                    System.out.printf("Successfully removed %s!%n",removePiece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", removePiece);
                }
            } else if (command.startsWith("ChangeKey")) {
                String changePiece = command.split("\\|")[1];
                String newKey = command.split("\\|")[2];
                if (list.containsKey(changePiece)) {
                    list.get(changePiece).set(1, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", changePiece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", changePiece);
                }
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : list.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }
    }
}
