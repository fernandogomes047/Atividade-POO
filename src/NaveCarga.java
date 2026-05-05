public class NaveCarga extends Nave{
    public NaveCarga(int id, String nome, int capacidade) {
        super(id, nome, capacidade);
    }

    @Override
    public String getTipo() {
        return "Carga";
    }

}
