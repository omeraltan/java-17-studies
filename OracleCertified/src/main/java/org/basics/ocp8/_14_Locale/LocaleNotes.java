package org.basics.ocp8._14_Locale;

import java.util.Locale;

public class LocaleNotes {

    public static void main(String[] args) {

        System.out.println(Locale.GERMAN);  // -> de
        System.out.println(Locale.GERMANY); // -> de_DE

    }

}

/**
 *
 * Java'da Resource Bundle (kaynak kümesi), uluslararasılaştırma (i18n) ve yerelleştirme (l10n) için kullanılan bir yapı olup,
 * uygulamanızın çoklu dil ve kültürlere uygun şekilde çalışmasını sağlar.
 * Resource Bundle, dil dosyalarını (genellikle .properties dosyaları) ve diğer kaynakları yöneterek,
 * kullanıcıların uygulamanızı kendi dillerinde ve yerel ayarlarında kullanmalarını mümkün kılar.
 *
 * Pratikte "Locales" 'lerin neden geçersiz olduğunu alnadığınızdan emin olun:
 * US   : Bir ülke olmadan dil olabilir ama tersi mümkün değildir.
 * enUS : UnderScore olmadığı için geçerli değildir.
 * EN   : Dil lowerCase olmalıdır.
 *
 *
 *              fr                      en_US
 *              |                      |     |
 *         Language only        Language     Country
 * Bu yapılardan ikiside geçerlidir ve legaldir. Sadece dil kodu olarak veya hem dil kodu hemde ülke kodu olarak kullanabilirsiniz.
 *
 * Dosya uzantılarının ".properties" olması gerektiğini unutmayınız.
 * Örneğin : resource.properties, resource_tr.properties, resource_en.properties
 * İlgili dosyaların resoruce altında olmsı gerekmektedir.
 *
 */
