public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Gravando dados em arquivo: " + filename);
    }

    @Override
    public String readData() {
        System.out.println("Lendo dados do arquivo: " + filename);
        return "Dados do arquivo";
    }
}
