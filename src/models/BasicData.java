package models;


public abstract class BasicData {

    public String name;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void breakLine() {
        System.out.println("----------------------------");
    }


}
