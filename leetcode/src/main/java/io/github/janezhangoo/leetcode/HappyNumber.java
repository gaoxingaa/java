package io.github.janezhangoo.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args){
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(19));
    }

    public boolean isHappy(int n) {
        Set<Integer> looped = new HashSet<>();
        while(n != 1 && !looped.contains(n)){
            looped.add(n);
            int sum = 0;
            while(n >= 10){
                int tail = n%10;
                n = n/10;
                sum += tail * tail;
            }
            sum += n * n;
            n = sum;
        }
        return n == 1;
    }

}
