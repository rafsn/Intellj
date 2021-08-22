package Digital.statics;

public class ProgramadoUsuario {
    public static void main(String[] args){
        final var SuperUsuario = new SuperUsuario();

        SuperUsuario.getLogin();
        SuperUsuario.getSenha();
        String root = SuperUsuario.nome;
    }
}
