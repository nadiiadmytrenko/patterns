package structural;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> types = new HashMap<>();

    public static TreeType getType(String name) {
        if (!types.containsKey(name)) {
            types.put(name, new TreeType(name));
        }
        return types.get(name);
    }
}