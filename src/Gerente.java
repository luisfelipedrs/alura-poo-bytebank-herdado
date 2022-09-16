public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;
    public Gerente() {
        AutenticacaoUtil autenticador;
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do gerente:");
        return super.getSalario();
    }
}
