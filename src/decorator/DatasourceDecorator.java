package decorator;

/**
 * Created by Anton Mikhaylov on 03.01.2018.
 * Базовый декоратор, содержащий ссылку на оборачиваемый датасорс
 */
public class DatasourceDecorator implements Datasource {

    private Datasource ds;

    public DatasourceDecorator(Datasource ds) {
        this.ds = ds;
    }

    @Override
    public String readData() {
        return ds.readData();
    }

    @Override
    public void writeData(String data) {
        ds.writeData(data);
    }
}
