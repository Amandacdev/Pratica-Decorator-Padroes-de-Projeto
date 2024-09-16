public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data);
        super.writeData(compressedData);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return decompress(data);
    }

    private String compress(String data) {
        return "Comprimido(" + data + ")";
    }

    private String decompress(String data) {
        // Simulação de descompressão
        return data.replace("Comprimido(", "").replace(")", "");
    }
}
