package decorator;

/**
 * Created by Anton Mikhaylov on 03.01.2018.
 * Шифрующий / дешифрующий декоратор
 *  - "Шифрует" данные переда записью в источник (добавляются стрелки в начале и конце строки)
 *  - Читает и "расшифровывает" данные из источника, убирая стрелки
 */
public class EncryptionDecorator extends DatasourceDecorator {

    public EncryptionDecorator(Datasource ds) {
        super(ds);
    }

    @Override
    public String readData() {
        String dataFromSource = super.readData();
        return decode(dataFromSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    private String encode(String data) {
        String encoded = "--> " + data + " <--";
        System.out.println("Data encoded to: " + encoded);
        return encoded;
    }

    private String decode(String data) {
        System.out.println("Decoding data: " + data);
        return data
                .replace("--> ", "")
                .replace(" <--", "");
    }
}
