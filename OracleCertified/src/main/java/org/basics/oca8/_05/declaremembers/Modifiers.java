package org.basics.oca8._05.declaremembers;

public class Modifiers {

    private int privateNumber = 100;
    int defaultNumber = 200;
    protected int protectedNumber = 300;
    public int publicNumber = 400;

}

/**
 *
 * access modifier : private, protected, public
 * access level    : private, protected, public, default
 * private bir değişkene yada methoda sadece aynı sınıf içerisinden erişim sağlanabilir.
 * default bir değişkene sadece kendi paketinden erişim sağlanabilir.
 * protected bir değişkene kendi paketi ve başka paketlerden erişim sağlanabilir
 * ancak protected bir değişkene farklı bir paketten sadece kalıtım yoluyla erişim sağlanaiblir.
 * public bir değişkene her yerden erişim sağlayabilirsiniz. Nesne referansı ile ulaşamazsınız.
 * final keyword'ü methodlar için override edilemez anlamındadır.
 * abstract lar classlar ve methodlar için kullanılabilir.
 * bir sınıfta bir tane bile abstract method varsa sınıf abstract olmak zorundadır.
 * bir abstract sınıfta abstract method tanımlama zorunluluğu yoktur.
 * synchronized anahtar kelimesi, methodlar ve initialization bloklar için kullanılır.
 * native -> anahtar kelimesi methodlar için kullanılır.
 * strictfp -> anahtar kelimesi ne için kullanılır?
 *
 *
 */
