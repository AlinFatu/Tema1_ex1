package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int val=1;
        int spc=1;
        char value='#';
        char space=' ';
        int aux=1;
        do{
            do{
                for (int i = aux; i <= val; i++) {
                    System.out.print(value);
                }
                for (int i = aux; i <=spc; i++) {
                    System.out.print(space);
                }
                val++;
                spc++;
            }while(val<4 && spc<4);
            do{
                for (int i = aux; i <= val; i++) {
                    System.out.print(value);
                }
                if(spc==4) {
                    spc--;
                }
                for (int i = aux; i <= spc; i++) {
                    System.out.print(space);
                }

                val--;
                spc--;
            }while(val>=1 && spc>=1 || spc==0);

        }while(val!=0 && spc>0);
        System.out.print(space);
    }
}
