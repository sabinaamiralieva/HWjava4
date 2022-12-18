package samiralieva;

public class HomeWork {
    public static void main(String[] args) {
        //Математические операторы + - * / % ++ --
        int a = 12;
        byte b = 13;
        double c = 11.1;

        System.out.println("a-b=" + (a-b));
        System.out.println("b+c=" + (b+c));
        System.out.println("a%b=" + (a%b));
        System.out.println("c/a=" + (c/a));
        System.out.println("b*c=" + (b*c));

        //Логические операторы && || !
        int q = 1;
        int w = 1;
        int e = 1;
        int r = 1;
        System.out.println(++q);
        System.out.println(w++);
        System.out.println(--e);
        System.out.println(r--);
        if (w+e+r==q && q>=w) {
            System.out.println("Ок");
        }
        else {
            System.out.println("Ошибка");
        }

        //Переполнения при вычислениях
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(max);
        System.out.println(min-1);
        System.out.println(max+1);







    }
}
