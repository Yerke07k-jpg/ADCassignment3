public class MyTestingClass {
    private int id;
    private String data;

    public MyTestingClass(int id, String data) {
        this.id = id;
        this.data = data;
    }

    @Override
    public int hashCode() {

        int h = 0;
        for (int i = 0; i < data.length(); i++) {
            h = 31 * h + data.charAt(i);
        }
        h = h + id * 17;
        return h;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyTestingClass)) return false;
        MyTestingClass other = (MyTestingClass) obj;
        return id == other.id;
    }
}