public class Main {
    public static void main(String[] args) {
        String data = "Dados importantes";

        DataSource fileDataSource = new FileDataSource("data.txt");
        fileDataSource.writeData(data);
        System.out.println(fileDataSource.readData());

        DataSource encryptedDataSource = new EncryptionDecorator(new FileDataSource("data.txt"));
        encryptedDataSource.writeData(data);
        System.out.println(encryptedDataSource.readData());

        DataSource compressedAndEncryptedDataSource = new CompressionDecorator(
                new EncryptionDecorator(new FileDataSource("data.txt"))
        );
        compressedAndEncryptedDataSource.writeData(data);
        System.out.println(compressedAndEncryptedDataSource.readData());
    }
}
