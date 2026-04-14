package ex3.util;

import ex3.Main;
import ex3.view.HomeView;

public class Input {
    public static void input(String number) {
            if (number.equals("1")) {

            }else if (number.equals("2")) {

            }else if (number.equals("3")) {

            }else if (number.equals("4")) {

            }else if (number.equals("5")) {

            }else if (number.equals("6")) {

            }else if (number.equals("q")) {
                Main.key = false;
            }else{
                System.out.println("형식에 맞는 숫자를 입력해주세요");
            }
        }


}
