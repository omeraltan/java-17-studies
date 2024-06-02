package org.basics.ocp8.chapter02.enums;

enum CoffeeSize {
    BIG(8, "B"), HUGE(10, "B"), OVERWHELMING(16, "A") {
        @Override
        public String getLidCode() {
            return "A";
        }
    };

    private int ounces;
    private String lidCode;

    CoffeeSize(int ounces, String lidCode) {
        this.ounces = ounces;
        this.lidCode = lidCode;
    }

    public int getOunces() {
        return ounces;
    }

    public String getLidCode() {
        return lidCode;
    }
}

class CoffeeTest {
    public static void main(String[] args) {
        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println(size + " " + size.getOunces() + " " + size.getLidCode());
        }
    }
}

