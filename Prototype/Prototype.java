package Prototype;

public class Prototype implements Cloneable {
    private String field;

    public Prototype(String field) {
        this.field = field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Prototype{" + "field='" + field + '\'' + '}';
    }
}
