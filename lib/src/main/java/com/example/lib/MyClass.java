package com.example.lib;

public class MyClass {
    public static void main(String[] avg){
        int x;
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a>b){
            x=a;
            a=b;
            b=x;
        }
        if(a>c){
            x=a;
            a=c;
            c=x;
        }
        if(b>c){
            x=b;
            b=c;
            c=x;
        }
        if((a+b)>c)
            System.out.println("可以拼成三角形~");
        else
            System.out.println("不能拼成三角形!");
    }
}
