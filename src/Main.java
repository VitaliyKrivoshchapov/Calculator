import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String arrInput[] = input.split(" ");
        String regexArab = "\\d.[-,+,*,\\/].\\d";
        String regexRim = "^[I,V,X]{0,3}.[-,+,*,\\/].[I,V,X]{0,3}$";

        Pattern patternArab = Pattern.compile(regexArab);
        Pattern patternRim = Pattern.compile(regexRim);
        Matcher matcherArab = patternArab.matcher(input);
        Matcher matcherRim = patternRim.matcher(input);

        boolean flagArab = matcherArab.find();
        boolean flagRim = matcherRim.find();

        if ((flagArab) ^ (flagRim))
           {
              if (flagArab)
               {
                Arab calcAr = new Arab();
                calcAr.setNumber1(arrInput[0]);
                calcAr.setNumber2(arrInput[2]);
                calcAr.setZnak(arrInput[1]);
                calcAr.out();
               }
              if (flagRim)
              {
                Rim calcRim = new Rim();
                calcRim.setNumber1(arrInput[0]);
                calcRim.setNumber2(arrInput[2]);
                calcRim.setZnak(arrInput[1]);
                calcRim.outRim();
              }
          }  else System.out.println("Wrong format");
        }
    }
