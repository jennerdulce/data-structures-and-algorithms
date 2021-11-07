package codechallenges.hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {


  public ArrayList<ArrayList<String>> leftJoinMethod(HashMap<String, String> hm1, HashMap<String, String> hm2) {
    ArrayList<ArrayList<String>> words = new ArrayList<>();
    if (hm1.size() > 0 && hm2.size() > 0) {
      for (String key : hm1.keySet()) {
        ArrayList<String> listOfWords = new ArrayList<>();
        listOfWords.add(key);
        listOfWords.add(hm1.get(key));
        if (hm2.containsKey(key)) {
          listOfWords.add(hm2.get(key));
        }
        words.add(listOfWords);
      }
    } else if (hm2.size() == 0) {
            for (String key : hm1.keySet()) {
            ArrayList<String> listOfWords = new ArrayList<>();
            listOfWords.add(key);
            listOfWords.add(hm1.get(key));
            listOfWords.add("null");
            words.add(listOfWords);
            }
    }
    return words;
    }
  }
