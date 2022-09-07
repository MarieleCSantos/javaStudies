package entities;

public class PessoaFisica extends Pessoa{
    private Double gastosComSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double valorImposto() {
        double impostos;
        if(getRendaAnual() < 20000.00) {
            impostos = getRendaAnual() * 0.15;
        } else  {
            impostos = getRendaAnual() * 0.25;
        }

        if(gastosComSaude != 0){
            impostos -= gastosComSaude * 0.5;
        }

        return impostos;
    }
}
