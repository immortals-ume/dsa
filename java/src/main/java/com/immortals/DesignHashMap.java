package com.immortals;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DesignHashMap {

    static Logger logger = Logger.getLogger(DesignHashMap.class.getName());
    int[] items;

    public DesignHashMap() {
        items = new int[1000001];
        Arrays.fill(items, -1);
    }

    public static void main(String[] args) {
        if (logger.isLoggable(Level.INFO)) {
            int key = 1;
            int value = 2;
            DesignHashMap obj = new DesignHashMap();
            obj.put(key, value);
            int param = obj.get(key);
            obj.remove(key);
            logger.log(Level.INFO, String.valueOf(param));
        }
    }

    public void put(int key, int value) {
        items[key] = value;
    }

    public int get(int key) {
        return items[key];
    }

    public void remove(int key) {
        items[key] = -1;
    }
}
