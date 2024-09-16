public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encrypt(data);
        super.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return decrypt(data);
    }

    private String encrypt(String data) {
        // Simulação de encriptação
        return "Criptografado(" + data + ")";
    }

    private String decrypt(String data) {
        // Simulação de decriptação
        return data.replace("Criptografado(", "").replace(")", "");
    }
}
