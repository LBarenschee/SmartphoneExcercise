package model;

public abstract class Contact {
    protected String name;



    protected Contact(String name ) {
        this.name = name;
    }
    protected Contact(){

    }

    public String getName() {
        return name;
    }

}
