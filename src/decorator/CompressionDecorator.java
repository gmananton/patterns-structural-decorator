package decorator;

/**
 * Created by Anton Mikhaylov on 03.01.2018.
 * Декоратор, "сжимающий"/"распаковывающий" данные
 * "Сжатие" имитируется переводом в нижний регистр
 * "Распаковка" - переводом в верхний
 */
public class CompressionDecorator extends DatasourceDecorator {

    public CompressionDecorator(Datasource ds) {
        super(ds);
    }

    @Override
    public String readData() {
        String dataInDS = super.readData();
        System.out.println("Decompressing data from source: " + dataInDS);
        return dataInDS.toUpperCase();
    }

    @Override
    public void writeData(String data) {
        System.out.println("Compressing data: " + data);
        String compressedData = data.toLowerCase();
        System.out.println("Writing compressed data to DS: " + compressedData);
        super.writeData(compressedData);
    }
}
