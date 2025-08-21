package Pessoa;

public abstract class Pessoa {
    String nome;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public abstract String getTipoVoz(){
        return "Filho";
    }
}

