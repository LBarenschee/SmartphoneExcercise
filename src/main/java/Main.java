import model.BusinessContact;
import model.Contact;
import model.Friend;
import model.Smartphone;

public class Main {

    public static void main(String[] args) {

        Smartphone onePlus = new Smartphone();
        System.out.println(onePlus);

        Contact[] contacts = new Contact[]{new Friend("Anton", "012345"), new BusinessContact("Meier", "Hansen")};
        onePlus.setContactArray(contacts);
        onePlus.setManufacturer("onePlus");
        onePlus.setModelName("Model Name: 7T");
        System.out.println("Hersteller: " + onePlus.getManufacturer());
        System.out.println(onePlus);
    }
}
