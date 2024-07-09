package FinalExamPrep2;

import java.util.*;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> heroes = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String heroName = input.split(" ")[0];
            int hpPoints = Integer.parseInt(input.split(" ")[1]);
            int mpPoints = Integer.parseInt(input.split(" ")[2]);

            heroes.put(heroName, new ArrayList<>());
            heroes.get(heroName).add(0, hpPoints);
            heroes.get(heroName).add(1, mpPoints);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String hero = command.split(" - ")[1];

            if (command.startsWith("CastSpell")) {
                int MpNeeded = Integer.parseInt(command.split(" - ")[2]);
                String spell = command.split(" - ")[3];
                int currentMp = heroes.get(hero).get(1);

                if (currentMp >= MpNeeded) {
                    int newMp = currentMp - MpNeeded;
                    heroes.get(hero).set(1, newMp);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", hero, spell, newMp);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", hero, spell);
                }
            } else if (command.startsWith("TakeDamage")) {
                int HpNeeded = Integer.parseInt(command.split(" - ")[2]);
                String attacker = command.split(" - ")[3];
                int currentHp = heroes.get(hero).get(0);

                if (currentHp > HpNeeded) {
                    int newHp = currentHp - HpNeeded;
                    heroes.get(hero).set(0, newHp);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", hero, HpNeeded, attacker, newHp);
                } else {
                    heroes.remove(hero);
                    System.out.printf("%s has been killed by %s!%n", hero, attacker);
                }
            } else if (command.startsWith("Recharge")) {
                int recharging = Integer.parseInt(command.split(" - ")[2]);
                int currentMp = heroes.get(hero).get(1);
                int newMp = recharging + currentMp;

                if (newMp > 200) {
                    newMp = 200;
                }
                int amount = newMp - currentMp;

                heroes.get(hero).set(1, newMp);
                System.out.printf("%s recharged for %d MP!%n", hero, amount);
            } else if (command.startsWith("Heal")) {
                int recharging = Integer.parseInt(command.split(" - ")[2]);
                int currentHp = heroes.get(hero).get(0);
                int newHp = recharging + currentHp;

                if (newHp > 100) {
                    newHp = 100;
                }
                int amount = newHp - currentHp;

                heroes.get(hero).set(0, newHp);
                System.out.printf("%s healed for %d HP!%n", hero, amount);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : heroes.entrySet()) {
            System.out.println(entry.getKey());
            System.out.printf("HP: %d%n", entry.getValue().get(0));
            System.out.printf("MP: %d%n", entry.getValue().get(1));
        }
    }
}
