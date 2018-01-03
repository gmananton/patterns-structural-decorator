package decorator;

/**
 * Created by Anton Mikhaylov on 25.12.2017.
 */
public interface Datasource {
    String readData();
    void writeData(String data);
}
