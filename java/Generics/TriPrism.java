public class TriPrism<T extends Number> {// generic class which extends only numbers
    // instance variable
    private T length;
    private T base;
    private T height;
    // getters and setters
    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getBase() {
        return base;
    }

    public void setBase(T base) {
        this.base = base;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }
    // getVolume function which returns the volume of the prism
    public Number getVolume(){
        return length.doubleValue()*(0.5*base.doubleValue()*height.doubleValue());
    }
}
