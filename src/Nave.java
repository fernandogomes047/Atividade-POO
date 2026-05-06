public abstract class Nave {
    protected int id;
    protected String nome;
    protected int capacidade;

    public Nave(int id, String nome, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public abstract String getTipo();

    protected boolean podeLevar(int quantidade){
        return quantidade <= capacidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}


