import java.util.ArrayList;
import java.util.List;

public class Missao {
    private int id;
    private String nome;
    private String objetivo;
    private String dataLancamento;
    private StatusMissao status;
    private Nave nave;
    private List<Astronauta> astronautas = new ArrayList<>();

    public Missao(int id, String nome, String objetivo, String dataLancamento, StatusMissao status) {
        this.id = id;
        this.nome = nome;
        this.objetivo = objetivo;
        this.dataLancamento = dataLancamento;
        this.status = status;
    }

    public void adicionarAstronautas(Astronauta a) {
        astronautas.add(a);
    }

    public void definirNave(Nave nave){
        if(nave.podeLevar(astronautas.size())){
            this.nave = nave;
        } else {
            System.out.println("Capacidade insuficiente!");
        }
    }

    public void atualizarStatus(StatusMissao status){
        this.status = status;
    }
    public int getId(){
        return id;
    }

    public String resumo (){
        return "ID: " + id + " Nome: " + nome + " Status: " + status + " Nave: "
                + (nave != null ? nave.getNome(): "N/A") +
                " Astronautas: " + astronautas.size();
    }
}
