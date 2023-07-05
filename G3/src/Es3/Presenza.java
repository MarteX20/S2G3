package Es3;

public class Presenza {
        private String nomeDipendente;
        private int giorniPresenza;

        public Presenza(String _nomeDipendente, int _giorniPresenza) {
            this.nomeDipendente = _nomeDipendente;
            this.giorniPresenza = _giorniPresenza;
        }

        public String getNomeDipendente() {
            return nomeDipendente;
        }

        public int getGiorniPresenza() {
            return giorniPresenza;
        }

        @Override
        public String toString() {
            return "Nome e cognome dipendente: " + nomeDipendente + " giorni presenza: " + giorniPresenza;
        }
}