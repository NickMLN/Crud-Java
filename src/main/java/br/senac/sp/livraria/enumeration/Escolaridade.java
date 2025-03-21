package br.senac.sp.livraria.enumeration;

public enum Escolaridade {
    FUNDAMENTAL("Fundamental"),
    MEDIO("Médio"),
    GRADUACAO("Graduação"),
    POS("Pós-Graduação");

    private String rotulo;

    Escolaridade(String rotulo) {
        this.rotulo = rotulo;
    }

    @Override
    public String toString(){
        return this.rotulo;
    }
}
