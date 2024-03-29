package com.rajeshchinni;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    // https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>(exits);   // newly added. this is immutable now.
        this.exits.put("Q", 0);
    }

    // getters
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        //return exits;
        return new HashMap<String, Integer>(exits);

    }

    // methods
//    public void addExit(String direction, int location){
//        exits.put(direction, location);
//    }
}
