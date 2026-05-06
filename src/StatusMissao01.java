public enum StatusMissao01 {

    PLANEJADA ("PLANEJADA"),
    EM_ANDAMENTO ("EM ANDAMENTO"),
    CONCLUIDA ("CONCLUIDA"),
    CANCELADA ("CANCELADA");

    private final String descricao;

    StatusMissao01(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
