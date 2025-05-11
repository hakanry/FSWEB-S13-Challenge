package org.example.enums;

public enum Plan {
    BASIC("BASIC_PLAN",1);

    private final int  price;
    private final String name;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return ("Plan Adı: "+name+" Ücret: "+price);
    }
}
