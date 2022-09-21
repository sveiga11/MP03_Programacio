package UF4;

public class Client extends Person {
    private String numClient;

    @Override
    public String toString() {
        return "Client{" +
                "numClient='" + numClient + '\'' +
                "nom=" + getNom() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.setNom("Samu");

    }
}
