package org.basics.ocp6._21_Variable_Scope;

public class VariableScopeNotes {

}

/**
 * scope larına göre sıralama
 * static > instance > local
 * static değişkenler class load edildiğinde hazırdır. proje durana kadar, jvm çalıştığı sürece vardır.
 * instance değişkenler, nesne varsa vardır. nesne temizlenirse (Garbage Collection) bu değişkende uçar.
 * local değişken method çalışınca vardır. method tamamlanınca uçar (stack)
 */
