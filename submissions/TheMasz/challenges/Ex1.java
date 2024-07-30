package challenges;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1 {
    private Integer arrNum[];
    private Integer num;
    private ArrayList<Integer> primeNumber = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> combineNumber = new ArrayList<>();

    public Ex1(Integer[] arrNum, Integer num) {
        this.arrNum = arrNum;
        this.num = num;
    }

    private ArrayList<ArrayList<Integer>> calc() {
        for (int i = 0; i < arrNum.length; i++) {
            if (isPrime(arrNum[i])) {
                primeNumber.add(arrNum[i]);
            }
        }

        for (int i = 0; i < primeNumber.size(); i++) {
            for (int j = i; j < primeNumber.size(); j++) {
                if (primeNumber.get(i) + primeNumber.get(j) == num) {
                    ArrayList<Integer> result = new ArrayList<>(Arrays.asList(primeNumber.get(i), primeNumber.get(j)));
                    combineNumber.add(result);
                }
            }
        }

        return combineNumber;
    }

    private boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "output: " + calc();
    }

}
