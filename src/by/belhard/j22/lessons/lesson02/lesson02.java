package by.belhard.j22.lessons.lesson02;

public class lesson02 {

    public static void main(String[] args) {
        byte b=126;
        int r=150;
        double d=(double)b/r;
        System.out.println(b);
        //b-=10; == b=b-10
        r=r+b;
        System.out.println(b);
        System.out.println(r);
        System.out.println(d);

        char c1='a';
        char c2=90;
        System.out.println(c1+" "+c2);

    }
}
