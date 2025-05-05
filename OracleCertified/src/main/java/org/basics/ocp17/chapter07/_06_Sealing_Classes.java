package org.basics.ocp17.chapter07;

public class _06_Sealing_Classes {

    public static void main(String[] args) {

    }

}

sealed class Bearer permits Kodiak, Panda{}
final class Kodiak extends Bearer{}
non-sealed class Panda extends Bearer{}

// class sealed Frog permts GlassFrog{}     // -> DOES NOT COMPILE (sealed ifadesi class ifadesinden önce olmalıydı.)

abstract sealed class Wolf permits Timber{}
final class Timber extends Wolf{}
// final class MyWolf extends Wolf{}       // -> DOES NOT COMPILE (Wolf class'ı sadece Timber class'ına izin verdiği için compile time hatası verir.)

// sealed class Penguin permits Emperor{}   // -> DOES NOT COMPILE (izin verilen class tarafından extends edilmediği için compile-time hatası verir.)

final class Emperor{}

sealed class Antelope permits Gazelle{}
final class Gazelle extends Antelope{}
// class George extends Gazelle{}           // -> DOES NOT COMPILE (izin verilen class'lar arasında olmadığı için compile-time hatası verir.)

sealed class Mammal permits Equine{}
sealed class Equine extends Mammal permits Zebra{}
final class Zebra extends Equine{}

sealed class Wolf2 permits Timber2{}
non-sealed class Timber2 extends Wolf2{}
class MyWolf extends Timber2{}

sealed class Snake2 permits Cobra2{}
final class Cobra2 extends Snake2{}

sealed class Snake3 {}
final class Cobra3 extends Snake3{}

sealed class Snake4 permits Snake4.Cobra4, Sample{
    final class Cobra4 extends Snake4{}
}

final class Sample extends Snake4{}

sealed class Snake5{
    final class Cobra5 extends Snake5{}
}

sealed interface Swims permits Duck, Swan, Floats{}
final class Duck implements Swims{}
final class Swan implements Swims{}

non-sealed interface Floats extends Swims{}

/**
 *
 * Sealed class'lar JDK15 ile preview olarak tanıtıldı ve java 17 ile geldi.
 * Bir sınıf için sub class'larını kısıtlamak istersek yani belirli sınıflar bir sınıfı kalıtsın istersek sealed class kullanabilirirz.
 * Sealed bir sınıf yada interface, hangi sınıfları doğrudan extend edeceğini yada implement edeceğini belirtir.
 * Sealed, mühürlü, gizli, kapalı gibi türkçe anlamlara gelmektedir.
 * Bir sealed class kendisini extends edecek class'ları belirtir.
 * sealed       : Bu kelime sealed class tanımlamak için kullanılır.
 * Sealed class'lar veya interface'ler sadece ismini verdiğimiz class'lar yada interface'ler tarafından extend edilebilir yada implement edilebilir.
 * Sealed ifadesini hem class'lar hemde interface'lerde kullanabiliriz.
 * permits      : Sealed class'larda kullanılmaktadır. İzin verilen class ve interfaceler için kullanılmaktadır.
 * non-sealed   : Sealed bir class'ı yada interface'i extends eden bir class'a yada interface'e uygulanır. Buda sealed'da permits ile belirtilmemiş class'lar yada interface'ler tarafından extends edilebileceğini belirtir.
 * sealed class'lar yaygın olarak abstract modifier'lar ile tanımlanırlar ama zorunlu değildir.
 * sealed bir class'ta permit işlemi yapılabilmesi için ilgili class'ların öncesinde tanımlanmış olması gerekmektedir.
 * Bir sealed class'ta permits işlemi yapılmasına rağmen izin verilen class, sealed class'ı extends etmiyorsa compile-time hatası verecektir.
 * sealed class'lar ile permit edilen class'lar aynı pakette yeralmak zorundadır.
 * Direkt olarak sealed class'ını kalıtan class'lar mutlaka final, sealed veya non-sealed keyword'lerini kullanmak zorundadır.
 * Bir sealed class başka bir sealed class'ı kalıtabilir.
 * "non-sealed" modifier, sealed class'ı potansiyel olarak diğer class'lara açar.
 * "permits" ifadesini hangi durumlarda yazmayabiliriz?
 * 1- Sealed class ile sub class aynı source file'da yer alıyorsa bu durumda permits ifadesi zorunlu değildir.
 * 2- Bir class içinde başka bir class tanımlanabilir ve buna nested class'lar denir. Bu durumda sealed classların kullanımı farklıdır.
 * 3- sealed class'lar farklı bir dosyada is "permits" zorunludur.
 * 4- sealed class'lar farklı bir dosyada değilse "permits" zorunlu değildir ama kullanılabilir.
 * 5- nested class'lar içinde "permits" zorunlu değildir ama kullanılabilir.
 * Class'lar sealed olabileceği gibi interface'lerde sealed olabilirler. Sealed interfacelerde yine benzer özelliğe sahip olabilirler.
 * Sealed interface'i direkt olarak implement eden class yada extends eden interface, sealed interface ile aynı pakette olması gerekmektedir.
 * interface'lerde final kullanamayız. interface'lerde sealed, non sealed kullanabiliriz.
 * Sealed interface ile sub interface aynı source file'da yer alsa bile permits ifadesi zorunludur.
 * Reviewing Sealed Class Rules:
 * 1- Sealed class'lar "sealed" ve "permits" anahtar kelimelerini kullanırlar.
 * 2- Sealed class'ların sub class'ları aynı class'ta yada aynı modülde tanımlı olması gerekiyor.
 * 3- Sealed class'ların direkt olan sub class'ları final, sealed veya non-sealed olmak zorundadır.
 * 4- "permits" anahtar kelimesi için eğer sealed class ile direkt sub class aynı source file'da tanımlı iseler yada sub class'ı direkt olarak nested olarak kullanmış isek bu durumda opsiyoneldir ve kullanmayabiliriz.
 * 5- Interface'lerde sealed özelliğe sahiptir vw interface'i implement edecek sınıfları ve extends edecek sınıfları permits ile belirtebiliriz.
 *
 *
 */
