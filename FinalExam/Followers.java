package FinalExam;

import java.util.*;

public class Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<Integer>> followersMap = new LinkedHashMap<>();

        while (!input.equals("Log out")) {
            String username = input.split(": ")[1];

            if (input.startsWith("New follower")) {

                if (!followersMap.containsKey(username)) {
                    followersMap.put(username, new ArrayList<>());
                    followersMap.get(username).add(0, 0);
                    followersMap.get(username).add(1, 0);
                }
            } else if (input.startsWith("Like")) {
                int count = Integer.parseInt(input.split(": ")[2]);

                if (followersMap.containsKey(username)) {
                    int currentLikes = followersMap.get(username).get(0);
                    followersMap.get(username).set(0, currentLikes + count);
                } else {
                    followersMap.put(username, new ArrayList<>());
                    followersMap.get(username).add(0, count);
                    followersMap.get(username).add(1, 0);
                }
            } else if (input.startsWith("Comment")) {
                if (!followersMap.containsKey(username)) {
                    followersMap.put(username, new ArrayList<>());
                    followersMap.get(username).add(0, 0);
                    followersMap.get(username).add(1, 1);
                } else {
                    int currentComments = followersMap.get(username).get(1);
                    followersMap.get(username).set(1, currentComments + 1);
                }
            } else if (input.startsWith("Blocked")) {
                if (followersMap.containsKey(username)) {
                    followersMap.remove(username);
                } else {
                    System.out.printf("%s doesn't exist.%n", username);
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d followers%n", followersMap.size());
        for (Map.Entry<String, List<Integer>> entry : followersMap.entrySet()) {
            String name = entry.getKey();
            int likes = entry.getValue().get(0);
            int comments = entry.getValue().get(1);

            System.out.printf("%s: %d%n", name, likes + comments);
        }
    }
}
