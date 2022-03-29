package model;

import java.util.Arrays;

public class Smartphone implements Radio, GPS{

    protected String modelName;
    protected String manufacturer;
    protected Contact[] contactArray;

    public Smartphone(){

    }

    public Smartphone(String modelName, String manufacturer, Contact[] contactArray) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.contactArray = contactArray;
    }



    @Override
    public boolean startRadio(){
        System.out.println("Radio starting");
        return true;
    }
    @Override
    public boolean stopRadio(){
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String getPosition() {
        return "Hamburg";
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Contact[] getContactArray() {
        return contactArray;
    }

    public void setContactArray(Contact[] contactArray) {
        this.contactArray = contactArray;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Smartphone that = (Smartphone) o;

        if (modelName != null ? !modelName.equals(that.modelName) : that.modelName != null) return false;
        if (manufacturer != null ? !manufacturer.equals(that.manufacturer) : that.manufacturer != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(contactArray, that.contactArray);
    }
    @Override
    public int hashCode() {
        int result = modelName != null ? modelName.hashCode() : 0;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(contactArray);
        return result;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", contactArray=" + Arrays.toString(contactArray) +
                '}';
    }
}
