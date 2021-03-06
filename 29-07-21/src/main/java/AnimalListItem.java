import java.util.Objects;

public class AnimalListItem {
    private de.kittlaus.classes.Animal value;
    private AnimalListItem next;

    public AnimalListItem(de.kittlaus.classes.Animal value) {
        this.value = value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        if (next!=null) {
            this.next = next;
        }
    }

    public de.kittlaus.classes.Animal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalListItem that = (AnimalListItem) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}