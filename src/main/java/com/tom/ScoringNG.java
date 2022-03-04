package com.tom;

public class ScoringNG {
    public static void main(String[] args) {
        String [] name={"ken","jenny","benny","jack","hank"};
        int [] math={56,78,96,55,37};
        int [] english={46,48,93,88,100};
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i]+"\t"+english[i]+"\t"+math[i]+"\t"+(english[i]+math[i])/2);

        }
    }
}
