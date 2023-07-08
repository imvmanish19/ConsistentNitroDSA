package DSABackup.customSorting;

public class Triplet {
    public Integer element;
    public Integer freq;
    public Integer index;

    public Triplet(Integer element, Integer freq, Integer index) {
        this.element = element;
        this.freq = freq;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "element=" + element +
                ", freq=" + freq +
                ", index=" + index +
                '}'+'\n';
    }
}
