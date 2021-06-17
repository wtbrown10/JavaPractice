package com.will;

public class Challenge2 {
    public int fib(int pos){
        if(pos == 0){
            return 0;
        } if(pos == 1){
            return 1;
        } else {
            return fib(pos - 1) + fib(pos - 2);
        }
    }
}
