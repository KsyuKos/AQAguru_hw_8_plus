package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class MapCollation {
    private final HashMap<Integer, String> map = new HashMap<>();

    public void addKeyValue(Integer key, String value) {
        map.put(key, value);
    }

    public void printMap() {
        System.out.println(map);
    }

    public void deleteKey(Integer key) {
        map.remove(key);
    }

    public void replaceValue(Integer key, String value) {
        map.replace(key, value);
    }

    public void searchKey(Integer key) {
        int count = 0;
        for (Map.Entry<Integer, String> set : map.entrySet()) {
            if (set.getKey().equals(key)) {
                count++;
                System.out.println(map.get(key));
                break;
            }
        }
        if (count == 0) {
            System.out.println("Не найден товар");
        }
    }
}
