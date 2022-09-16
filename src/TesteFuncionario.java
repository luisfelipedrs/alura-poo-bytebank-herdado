public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario pipe = new Gerente();
        pipe.setNome("Luis Felipe");
        pipe.setCpf("i453oi23423");
        pipe.setSalario(4700.50);

        System.out.println(pipe.getNome());
        System.out.println(pipe.getBonificacao());
    }
}
