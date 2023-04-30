package org.example;

public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        System.out.println(sumCalculator.sum(3));
    }
}
class SumCalculator{
    public int sum(int n){
        if (n <= 0){
            throw new IllegalArgumentException("Number isn't correct!");
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res+=i;
        }
        return res;
    }

}