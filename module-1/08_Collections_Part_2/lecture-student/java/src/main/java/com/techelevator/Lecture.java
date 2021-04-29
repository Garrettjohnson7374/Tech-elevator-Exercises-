package com.techelevator;

import java.util.*;

public class Lecture {

    //1. removeDuplicates([1,2,1,1,2,1,2]) -> [1,2] or [2,1]
    public List<Integer> removeDuplicates(List<Integer> input) {
        Set<Integer> noDupes = new HashSet<>(input);
        List<Integer> output = new ArrayList<>(noDupes);
        return output;
    }

    //2. musicalGroupNames() -> {2="duo",3="trio",4="quartet"}
    public Map<Integer,String> musicalGroupNames() {
        Map<Integer,String> musicalGroups = new HashMap<>();
        musicalGroups.put(2, "duo");
        musicalGroups.put(3, "trio");
        musicalGroups.put(4, "quartet");
        return musicalGroups;
    }

    //3. coinValues() -> {"penny"=1,"nickel"=5,"dime"=10,"quarter"=25}
    public Map<String,Integer> coinValues() {
        Map<String, Integer> coins = new HashMap<>();
        coins.put("penny",1);
        coins.put("nickel",5);
        coins.put("dime",10);
        coins.put("quarter",25);
        return coins;
    }

    //4. describeGroup(3, "violin") -> "violin trio"
    //   describeGroup(0, "trumpet") -> "trumpet group"
    public String describeGroup(int count, String instrument) {
        Map<Integer,String> groups = musicalGroupNames();
        String result = instrument + " ";
        if (groups.containsKey(count)) {
            result = result + groups.get(count);
        } else {
            result = result + "group";
        }
        return result;
    }

    //5. totalCents({"nickel","quarter","penny","penny"}) -> 32
    public int totalCents(String[] coins) {
        Map<String, Integer> values = coinValues();
        int total = 0;
        for(String coin : coins){
            int value = values.get(coin);
            total += value;
        }
        return total;
    }

    //6. validCoin("dime") -> "valid"
    //   validCoin("token") -> "invalid"
    public String validCoin(String coin) {
        Map<String, Integer> validate = coinValues();
        String result = "invalid";
        if (validate.containsKey(coin)) {
            result = "valid";
            return result;
        }
        return result;
    }

    //7. stateNames({"Ohio"="Columbus","Kentucky"="Frankfort","Indiana"="Indianapolis"})
    //             -> ["Ohio","Kentucky","Indianapolis"]
    public List<String> stateNames(Map<String,String> capitals) {
        Set<String> stateSet = capitals.keySet();
        List<String > result = new ArrayList<>(stateSet);
        return result;

    }

    //8. availableColors({"red"=true,"blue"=false,"green"=true,"yellow"=true,"gray"=false})
    //                  -> ["red","green","yellow"]
    public List<String> availableColors(Map<String,Boolean> availability) {
        List<String> colors = new ArrayList<>();
        Set<Map.Entry<String, Boolean>> allEntries = availability.entrySet();
        for(Map.Entry<String , Boolean> entry : allEntries){
            if (entry.getValue() == true){
                colors.add(entry.getKey());
            }

        }

        return colors;
    }

    //9. addBonus({"Player 1"=5000,"Player 2"=2500,"Player 3"=4500}, 500)
    //         -> {"Player 1"=5500,"Player 2"=3000,"Player 3"=5000}
    public void addBonus(Map<String,Integer> scores, int bonus) {


    }

    //10. Modify and return the given map as follows: for this problem the map may or may not contain the
    //    "a" and "b" keys. If both keys are present, append their 2 string values together and store the
    //    result under the key "ab".
    //    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
    //    mapAB({"a": "Hi"}) → {"a": "Hi"}
    //    mapAB({"b": "There"}) → {"b": "There"}

    public Map<String, String> mapAB(Map<String,String> input) {
        return input;
    }

}
