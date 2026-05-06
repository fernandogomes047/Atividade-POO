public class Astronauta {
    private int id;
    private String nome;
    private String especialidade;

    public Astronauta(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getId() {return id;}

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
