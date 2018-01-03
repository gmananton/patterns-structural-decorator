package decorator;

import storage.FileStorage;

/**
 * Created by Anton Mikhaylov on 25.12.2017.
 * Имплементация датасорса - содержит базовую логику чтения/записи из файла
 */
public class FileDatasource implements Datasource {

    private FileStorage storage;

    public FileDatasource(FileStorage storage) {
        this.storage = storage;
    }

    @Override
    public String readData() {
        return storage.getData();
    }

    @Override
    public void writeData(String data) {
        storage.setData(data);
    }
}
