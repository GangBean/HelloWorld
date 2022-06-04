package javaexercise.chapter6;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells (ArrayList<String> loc) {
        this.locationCells = loc;
    }

    public String checkYourself (String userInput) {
        String result = "miss";
        int idx = locationCells.indexOf(userInput);

        if (idx >= 0) {
            locationCells.remove(idx);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : locationCells) {
            stringBuilder.append(s);
        }
        return "DotCom{" +
                "locationCells=" + stringBuilder.toString() +
                ", name='" + name + '\'' +
                '}';
    }
}
