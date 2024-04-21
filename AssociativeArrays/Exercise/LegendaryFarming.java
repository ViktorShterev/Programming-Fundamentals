package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junks = new LinkedHashMap<>();

        boolean isWin = false;

        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputArr = input.split("\\s+");

            for (int i = 0; i < inputArr.length; i += 2) {
                int quantity = Integer.parseInt(inputArr[i]);
                String material = inputArr[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    materials.put(material, materials.get(material) + quantity);
                } else {
                    if (!junks.containsKey(material)) {
                        junks.put(material, quantity);
                    } else {
                        junks.put(material, junks.get(material) + quantity);
                    }
                }
                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }
        materials.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junks.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
