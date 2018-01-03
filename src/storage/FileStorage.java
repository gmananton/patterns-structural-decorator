package storage;

/**
 * Created by Anton Mikhaylov on 29.12.2017.
 */
public class FileStorage {

    private String data;

    public String getData() {
        return data == null ? "NO DATA IN FILE" : data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
