public class NaveExploracao extends Nave{
    public NaveExploracao(int id, String nome, int capacidade){
        super(id, nome, capacidade);
    }

    @Override
    public String getTipo() {
        return "Exploração";
    }
}
