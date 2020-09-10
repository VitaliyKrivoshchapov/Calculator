public class Rim {
    String number1;
    String znak;
    String number2;
    final String arrArab[] = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV",
   "XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL","XLI","XLII","XLIII","XLIV",
   "XLV","XLVI","XLVII","XLVIII","XLIX","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX","LXXI",
   "LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI",
   "XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};

    public void setNumber1(String number1) {
        this.number1 = number1;
    }
    public void setZnak(String znak) {
        this.znak = znak;
    }
    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public  int rimToArab(String number)
    { int rez= 0;
        for (int i = 0; i < arrArab.length; i++)
        {
            if (arrArab[i].equals(number)) rez = i;

        }return rez + 1;
    }

    public String arabToRim (int number){
        return arrArab[number - 1];
    }

    public void outRim()
    { int rezOutRim;
      int rezArab;
      switch (znak)
        {
            case "+":
            {   int n = rimToArab(number1);
                int k = rimToArab(number2);
                rezArab = n + k;
                System.out.println(arabToRim(rezArab));
                break;
            }
            case "-":
            {   int n = rimToArab(number1);
                int k = rimToArab(number2);
                rezArab = n - k;
                if (k>n) System.out.println("I don't know negative numbers");
                else System.out.println(arabToRim(rezArab));
                break;
            }

            case "*":
            {
                int n = rimToArab(number1);
                int k = rimToArab(number2);
                rezArab = n * k;
                System.out.println(arabToRim(rezArab));
                    break;
            }
            case "/":
            {   int n = rimToArab(number1);
                int k = rimToArab(number2);
                if (k == 0)
                        { System.out.println("I can't divide by zero");break;}
                rezArab = n / k;
                System.out.println(arabToRim(rezArab));
                break;
            }
        }

    }
}
