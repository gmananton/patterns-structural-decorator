import decorator.CompressionDecorator;
import decorator.Datasource;
import decorator.EncryptionDecorator;
import decorator.FileDatasource;
import storage.FileStorage;

/**
 * Created by Anton Mikhaylov on 25.12.2017.
 */
public class Main {

    public static void main(String[] args) {

        FileStorage storage = new FileStorage();

        Datasource encryptedDS =
                new CompressionDecorator(
                        new EncryptionDecorator(
                                new FileDatasource(storage)
                )
        );


        String myData = "GMAN'S DATA";

        System.out.println("Writing data to DS... : " + myData);
        encryptedDS.writeData(myData);
        System.out.println("Reading data from DS...");
        System.out.println(encryptedDS.readData());

    }
}
