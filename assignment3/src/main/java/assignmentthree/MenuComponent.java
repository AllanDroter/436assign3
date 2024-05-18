package assignmentthree;

public abstract class MenuComponent {

    // Menu classes
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public MenuIterator getMenuIterator() {
        throw new UnsupportedOperationException();
    }

    // MenuItem classes
    public int getItemNumber() {
        throw new UnsupportedOperationException();  //
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getCost() {
        throw new UnsupportedOperationException();
    }

    // In both classes
    public void print() {
        throw new UnsupportedOperationException();
    }
}
