public class EditorVideo extends Funcionario {



    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do editor de video:");
        return super.getBonificacao() + 100;
    }
}
