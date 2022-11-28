package classe;

public class Pessoa {
    // atributos
    private int id;
    private String nome;
    private String sobrenome;
    private String rg;
    private String email;
    private int sexoId;
    private String telefone;
    private String cpf;
    private int estadoId;
    private String bairro;
    private String cidade;
    private String rua;
    private String cep;
    private String numero;
    private String senha;
    private boolean agiota;
    
    //set
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setRg(String usuario) {
        this.rg = usuario;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setSexoId(int sexo) {
        this.sexoId = sexo;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setEstadoId(int estado) {
        this.estadoId = estado;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setAgiota(boolean agiota){
        this.agiota = agiota;
    }
    
    //get
    public int getId() {
        return id;
    }

    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public String getRg() {
        return rg;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getSexoId() {
        return sexoId;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public int getEstadoId() {
        return estadoId;
    }
    
    public String getBairro() {
        return bairro;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public String getRua() {
        return rua;
    }
    
    public String getCep () {
        return cep;
    }
     
    public String getNumero () {
        return numero;
    }
    
    public String getSenha () {
        return senha;
    }
    
    public boolean getAgiota() {
        return agiota;
    }
    
    //Criar um método construtor e inicializar os atributos.
    public Pessoa(){
        this.nome = "";
        this.rg = "";
        this.email = "";
        this.sexoId = 0;
        this.telefone = "";
        this.cpf = "";
        this.estadoId = 0;
        this.cidade = "";
        this.rua = "";
        this.cep = "";
        this.numero = "";
        this.senha = "";
        this.agiota = false;
    }
    
    public void limparDados() {
        this.setNome("");
        this.setRg("");
        this.setEmail("");
        this.setSexoId(0);
        this.setTelefone("");
        this.setCpf("");
        this.setEstadoId(0);
        this.setCidade("");
        this.setRua("");
        this.setCep("");
        this.setNumero("");
        this.setSenha("");
        this.setAgiota(false);
    }
    
}
