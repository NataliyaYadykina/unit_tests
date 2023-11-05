package homework.hw6;

import java.util.ArrayList;
import java.util.List;

public class NumbersList {

    private List<Integer> numList = new ArrayList<>();

    public NumbersList(List<Integer> numList) {
        this.numList = numList;
    }

    public List<Integer> getNumList() {
        return numList;
    }

}
