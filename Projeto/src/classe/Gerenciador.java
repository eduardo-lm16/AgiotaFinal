package classe;

public class Gerenciador {
    
    public static int idLogado;
    public static Pessoa usuarioLogado;

    public static int getIdLogado() {
        return idLogado;
    }

    public static void setIdLogado(int idLogado) {
        Gerenciador.idLogado = idLogado;
    }
    
    public static Pessoa gerUsuarioLogado(){
        return usuarioLogado;
    }
    
    public static void setUsuarioLogado(Pessoa usuario){
        Gerenciador.usuarioLogado = usuario;
        Gerenciador.setIdLogado(usuario.getId());
    }
    
    public static void limparDados(){
        Gerenciador.usuarioLogado.limparDados();
        Gerenciador.idLogado = 0;
    }
}
