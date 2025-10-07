import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Data {
    private LocalDate data;

    // Costruttore senza parametri
    public Data() {
        this.data = LocalDate.of(2000, 1, 1);
    }

    // Costruttore con parametri
    public Data(int giorno, int mese, int anno) throws DataException {
        setData(giorno, mese, anno);
    }

    // Metodo per impostare una data
    public void setData(int giorno, int mese, int anno) throws DataException {
        try {
            this.data = LocalDate.of(anno, mese, giorno);
        } catch (Exception e) {
            throw new DataException("Formato data non valido: " + giorno + "/" + mese + "/" + anno);
        }
    }

    // Metodo per ottenere la data formattata
    public String getData() {
        return String.format("%02d/%02d/%04d", data.getDayOfMonth(), data.getMonthValue(), data.getYear());
    }

    // Calcola la distanza in giorni tra due date
    public long distanzaGiorni(Data altra) {
        return Math.abs(ChronoUnit.DAYS.between(this.data, altra.data));
    }
}