package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите пример");
        String x = in.nextLine();
        while (x.isEmpty()==true){
            System.out.println("Вы не ввели ни одного значения");
            System.out.println("Введите пример");
            x = in.nextLine();
        }

        Primer line = new Primer();
        line.Search(x);
        if((line.a1>10)|(line.b2>10))
        {
            System.out.println("Калькулятор умеет считать с числами от 1 до 10");
        }
        else {
            if (line.res == 1) {
                System.out.println(line.calc());
            } else {
                if ((line.a1>0)&(line.b2>0)){
                System.out.println(line.Transfer(line.calc()));}
                else{ System.out.println("Параметры заданы не верно");}
            }
        }


    }
    public static class Primer
    {
        int a1;
        int  b2;
        char op;
        int res;
        void Search(String l)
        {
        try {
            int s = l.indexOf(" ");
            int e = l.lastIndexOf(" ");
            op = l.charAt(s + 1);
            String a = l.substring(0, s);
            String b = l.substring(++e, l.length());

            a1 = Transfer(a);
            b2 = Transfer(b);
            if ((a1==0)&(b2==0)) {
                a1 = Integer.valueOf(a);
                b2 = Integer.valueOf(b);
                res = 1;
            }
        }
        catch (Exception e)
        {System.out.println("ХЗ");}

        }
        int calc()
        {
            int r =0;
            String cas = String.valueOf(op);
             switch (cas) {
                 case "+" : r = a1+b2;
                         break;
                 case "-": r = a1-b2;
                         break;
                 case "/":
                     if(a1==0){System.out.println("Делить на ноль нельзя");break;}
                     r = a1/b2;
                        break;
                 case "*":
                     r = a1*b2;
                        break;
             }

            return r;
        }
        int Transfer(String a) {
            int w = 0;
            String[] rim = new String[]{"I","II", "III","IV","V", "VI","VII","VIII","IX", "X","XI",
                    "XII","XIII","XIV","XV", "XVI","XVII", "XVIII","XIX","XX","XXI",
                    "XXII","XXIII","XXIV","XXV", "XXVI","XXVII", "XXVIII","XXIX","XXX","XXXI",
                    "XXXII","XXXIII","XXXIV","XXXV", "XXXVI","XXXVII", "XXXVIII","XXXIX","XL",
                    "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
                    "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
                    "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
                    "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
                    "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
                    "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","LC",
                    "LCI","LCII","LCIII","LCIV","LCV","LCVI","LCVII","LCVIII","LCIX","C"
            };
            for (int i = 0; i <rim.length; i++) {
                if (a.equals(rim[i])) {
                    w = i + 1;

                }
            }
            return w;
        }
            String Transfer(int a)
            {
                String w=null;
                String[] rim = new String[]{"I","II", "III","IV","V", "VI","VII","VIII","IX", "X","XI",
                        "XII","XIII","XIV","XV", "XVI","XVII", "XVIII","XIX","XX","XXI",
                        "XXII","XXIII","XXIV","XXV", "XXVI","XXVII", "XXVIII","XXIX","XXX","XXXI",
                        "XXXII","XXXIII","XXXIV","XXXV", "XXXVI","XXXVII", "XXXVIII","XXXIX","XL",
                        "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
                        "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
                        "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
                        "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
                        "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
                        "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","LC",
                        "LCI","LCII","LCIII","LCIV","LCV","LCVI","LCVII","LCVIII","LCIX","C"
                        };

                    for (int j=0;j<rim.length; j++)
                    {
                        int g=j+1;
                       if(a==g)
                        {
                            w=rim[j];
                        }                    }

                return w;
        }

    }
}
