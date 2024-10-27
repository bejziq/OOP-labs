package org.example.week4.Inheritence.CarComponents;

public class Components {
    private String name;
    private String barCode;

    public Components(String name, String barCode) {
        this.name = name;
        this.barCode = barCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void sayWhoIam() {
        System.out.println("I am writing this from class components");
    }
}
