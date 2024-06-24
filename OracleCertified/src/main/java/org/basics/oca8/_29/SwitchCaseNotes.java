package org.basics.oca8._29;

public class SwitchCaseNotes {
    public static void main(String[] args) {
        int key = 5;
        switch (key){
            case 0:
                case 2:
                    case 4:
                        case 6:
                            case 8:
                                System.out.println("çift");
                                break;
            default:
                System.out.println("tek");
                break;
        }
    }
}

/**
 *
 * switch - case
 * eğer çok fazla if-else-if-else şeklinde bir yapı varsa bu durumda tercih edebiliriz.
 *      switch(expression)
 *          case constant1 : code block;
 *          case constant2 : code block;
 *          case constant3 : code block;
 *          default : code block;
 *
 * char, shorti byte, int yada bunların wraperları kullanılabilir.
 * Character, Short, Byte, Integer, String de kullanılabilir.
 * Enum larda kullanılabilir.
 * double, float, long kullanılamazlar.
 * switch-case yapısında "break" anahtar kelimesi kullanılmaktadır.
 *
 *
 */
