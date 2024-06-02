package org.basics.solid;

/**
 *  (Dependency Inversion Principle) - Bağımlılıkların Tersine Çevrilmesi Prensibi
 *  Yüksek seviyeli modüller düşük seviyeli modüllere bağımlı olmamalıdır; her ikisi de soyutlamalara bağımlı olmalıdır.
 *  Soyutlamalar, detaylara bağımlı olmamalıdır; detaylar soyutlamalara bağımlı olmalıdır.
 *  Bu örnekte, Application sınıfı doğrudan MySQLDatabase sınıfına bağımlı değildir.
 *  Bunun yerine, Database arayüzüne bağımlıdır, bu da farklı veri tabanı uygulamalarının kolayca değiştirilebilmesini sağlar.
 */
interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Database");
    }
}

class Application {
    private Database database;

    public Application(Database database) {
        this.database = database;
    }

    public void start() {
        database.connect();
    }
}

public class Test {
    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        Application app = new Application(db);
        app.start();
    }
}

