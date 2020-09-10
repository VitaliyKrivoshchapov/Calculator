public class Arab {
    String number1;
    String znak;
    String number2;

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public void setZnak(String znak) {
        this.znak = znak;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }


    public void out()
    {
        int numberInt1 = Integer.parseInt(number1);
        int numberInt2 = Integer.parseInt(number2);
               switch (znak)
        {
            case "+":
                System.out.println(numberInt1 + numberInt2); break;
            case "-":
                System.out.println(numberInt1 - numberInt2);break;
            case "*":
                System.out.println(numberInt1 * numberInt2);break;
            case "/":
                if (numberInt2 == 0){ System.out.println("I can't divide by zero");break;}
                System.out.println(numberInt1 / numberInt2);break;

        }

    }

}
