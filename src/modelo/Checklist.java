package modelo;

public class Checklist {
    
    private Integer idChecklist;
    private Integer idVeiculo;
    private Integer idEntrada;
    private String luzes;
    private String carroceria;
    private String pressao;
    private String vidros;
    private String pneu;
    private String observacao;

    public Integer getIdChecklist() {
        return idChecklist;
    }

    public void setIdChecklist(Integer idChecklist) {
        this.idChecklist = idChecklist;
    }

    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getLuzes() {
        return luzes;
    }

    public void setLuzes(String luzes) {
        this.luzes = luzes;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public String getVidros() {
        return vidros;
    }

    public void setVidros(String vidros) {
        this.vidros = vidros;
    }

    public String getPneu() {
        return pneu;
    }

    public void setPneu(String pneu) {
        this.pneu = pneu;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }
    
}
