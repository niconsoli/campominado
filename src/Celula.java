public class Celula {
    public boolean temBomba;
    public boolean reveal;
    public boolean flagged;
    public int bombasAoRedor;

    @Override
    public String toString(){
        if (flagged) return "F";
        if (!reveal) return "?";
        if (temBomba) return "!";
        if (reveal) return Integer.toString(bombasAoRedor);
        return " ";
    }
}
