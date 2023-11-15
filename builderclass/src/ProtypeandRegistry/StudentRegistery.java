package ProtypeandRegistry;

import java.util.Map;
import java.util.HashMap;
public class StudentRegistery {
    private Map<String,Student> mapregistry = new HashMap<>();
    public void add(String key, Student student) {
        mapregistry.put(key, student);
    }

    public Student get(String key) {
        return mapregistry.get(key);
    }

}
