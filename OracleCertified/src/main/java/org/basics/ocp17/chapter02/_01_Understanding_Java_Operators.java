package org.basics.ocp17.chapter02;

public class _01_Understanding_Java_Operators {

    public static void main(String[] args) {
        operatorsTest();
    }

    public static void operatorsTest(){
        int cookies = 4;
        // (4) -> Burada ilk önce azaltım operatörü çalışır sonrasında çarpma işlemi yapılır sonrasında toplama işlemi yapılır.
        double reward = 3 + 2 * --cookies;
        System.out.println("Zoo animal receives: " + reward + " reward points");
    }

}

/**
 *
 * 1. Operatör: Bir java operatörü değişkenlere, değerlere, literallere uyguladığımız, kullandığımız ve bir sonuç döndüren özel karakterlerdir.
 * 2. Operand : Operatörün uygulandığı değer yada değişkenlere verilen isimdir. Örneğin: "var c = a + b;" (Burada a ve operand olmaktadır. artı işareti ise operatör olmaktadır. Eşittir ibaresi ise atama operatörü olmaktadır.)
 * 3. Java 3 tip operatörü destekler. Bunlar: unary, binary ve ternary dir.
 * 4. Operatörler soldan sağa doğru değerlendirilmek zorunda değillerdir.Bazıları sağdan sola doğru evaluate edilebilir.
 * 5. Operator Precedence : Javada matematiksel operatörler ile ilgili kurallar günlük hayatımızda nasıl kullanılıyorsa aynı şekilde javada kullanılmaktadır.
 * 6. Örneğin toplama ve çarpma işleminin gerçekleştirildiği bir işlemde ilk önce çarpma işlemi gerçekleştirilir.
 *
 * 7.   -------------           Order Of Operator Precedence        -------------
 *      -------------------------------------------------------------------------
 *      Operator                            Symbols and examples                Evaluation
 *      --------------------                --------------------                ----------
 *      Post-unary operators                expression++, expression--          Left-to-right
 *      Pre-unary operators                 ++expression, --expression          Left-to-right
 *      Other unary operators               -, !, ~, +, (type)                  Right-to-left
 *      Cast                                (Type) reference                    Right-to-left
 *      Multiplication/division/modulus     *,/,%                               Left-to-right
 *      Addition/subtraction                +,-                                 Left-to-right
 *      Shift operators                     <<, >>, >>>                         Left-to-right
 *      Relational operators                <, >, <=, >=, instance of           Left-to-right
 *      Equal to/not equal to               ==, !=                              Left-to-right
 *      Logical AND                         &                                   Left-to-right
 *      Logical exclusive OR                ^                                   Left-to-right
 *      Logical inclusive OR                |                                   Left-to-right
 *      Conditional AND                     &&                                  Left-to-right
 *      Conditional OR                      ||                                  Left-to-right
 *      Ternary Operators                   boolean exp1 ? exp2 : exp3          Right-to-left
 *      Assignment operators                =, +=, -=, *=, /=, %=, &=, ^=, |=,  Right-to-left
 *      Assignment operators                <<=, >>=, >>>=                      Right-to-left
 *      Arrow operator                      ->                                  Right-to-left
 *
 */
