package Es3;

public class Es3main {
    public static void main(String[] args) {
        RegistroPresenze registro = new RegistroPresenze();

        registro.aggiungiPresenza("Luca Iannice", 5);
        registro.aggiungiPresenza("Manuel Centini", 6);
        registro.aggiungiPresenza("Gerry Scotti", 15);

        String fileName = "presenze.txt";

        registro.salvaPresenze(fileName);
        registro.getElencoPresenze().clear();
        registro.leggiPresenzeSalvate(fileName);
        registro.stampaPresenze();
    }
}
