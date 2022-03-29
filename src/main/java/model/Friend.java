package model;

public class Friend extends Contact {
    protected String phoneNumber;


    public Friend(String name, String phoneNumber){
        super(name);
        this.phoneNumber = phoneNumber;
    }

    public Friend(){

    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}
