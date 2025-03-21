package br.senac.sp.livraria.enumeration;

public enum EstadoCivil {
    CASADO("Casado"),
    DIVORSIADO("Divorsiado"),
    SOLTEIRO("Solteiro"),
    UNIAO_ESTAVEL("União Estável"),
    VIUVO("Viúvo");

    private String rotulo;

    EstadoCivil(String rotulo){
        this.rotulo = rotulo;
    }

    @Override
    public String toString() {
        return this.rotulo;
    }
}
