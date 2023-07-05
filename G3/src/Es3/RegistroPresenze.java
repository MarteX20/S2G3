package Es3;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RegistroPresenze {
    private List<Presenza> elencoPresenze;

    public RegistroPresenze() {
        elencoPresenze = new ArrayList<>();
    }

    public void aggiungiPresenza(String nomeDipendente, int giorniPresenza) {
        Presenza presenza = new Presenza(nomeDipendente, giorniPresenza);
        elencoPresenze.add(presenza);
    }

    public void salvaPresenze(String fileName) {
        List<String> fileLines = new ArrayList<>();

        for (Presenza presenza : elencoPresenze) {
            String line = presenza.getNomeDipendente() + "," + presenza.getGiorniPresenza();
            fileLines.add(line);
        }

        try {
            FileUtils.writeLines(new File(fileName), fileLines);
            System.out.println("Presenze salvate correttamente!");
        } catch (IOException e) {
            System.out.println("Errore durante il salvataggio: " + e.getMessage());
        }
    }

    public void leggiPresenzeSalvate(String fileName) {
        try {
            List<String> fileLines = FileUtils.readLines(new File(fileName), "UTF-8");

            for (String line : fileLines) {
                String[] fields = line.split(",");
                if (fields.length == 2) {
                    String nomeDipendente = fields[0];
                    int giorniPresenza = Integer.parseInt(fields[1]);
                    Presenza presenza = new Presenza(nomeDipendente, giorniPresenza);
                    elencoPresenze.add(presenza);
                }
            }
            System.out.println("Presenze lette correttamente!");
        } catch (IOException e) {
            System.out.println("Errore durante la lettura delle presenze: " + e.getMessage());
        }
    }

    public List<Presenza> getElencoPresenze() {
        return elencoPresenze;
    }

    public void stampaPresenze() {
        for (Presenza presenza : elencoPresenze) {
            System.out.println(presenza);
        }
    }
}
