import java.util.ArrayList;
import java.util.List;

public class SILab2 {
    // ["0", "#", "0", "0", "0", "#", "0", "#", "#"]
    public static List<String> function(List<String> list) {
        if (list.size() <= 0) { // 1
            throw new IllegalArgumentException("List length should be greater than 0"); //2
        }
        int n = list.size(); //3
        int rootOfN = (int) Math.sqrt(n); //3
        if (rootOfN * rootOfN  != n) {//3
            throw new IllegalArgumentException("List length should be a perfect square"); //4
        }
        List<String> numMines = new ArrayList<>(); //5
        for (int i = 0; i < n; i++) { // 6 (6.1, 6.2, 6.3)
            if (!list.get(i).equals("#")) { // 7
                int num = 0; // 8
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) { //9
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){ // 10
                        num += 2; //11
                    }
                    else { //12
                        num  += 1; // 13
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ //14
                    num++; //15
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){  // 16
                    num++; //17
                }
                numMines.add(String.valueOf(num)); //18
            }
            else { //19
                numMines.add(list.get(i)); //20
            }
        }
        return numMines; //21
    }//22

}