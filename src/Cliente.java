public class Cliente extends Pessoa implements IPessoa {
    protected static int id=0;
    protected int idCliente;
    public Cliente() {
        id++;
        this.idCliente = id;

    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Cliente.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    protected boolean cartaoLeoni;
    public Cliente(String nome, int idade, String telefone, String cpf, boolean cartaoLeoni) {
        super(nome, idade, telefone, cpf);
        this.cartaoLeoni = cartaoLeoni;
    }

    @Override
    public void exibir() {
        System.out.printf("========== CLIENTE " + idCliente +" ==========\n");
        System.out.printf("Nome:"+ nome+ "\n");
        System.out.printf("Idade:"+idade+ "\n");
        System.out.printf("Telefone"+ telefone + "\n");
        System.out.printf("Cpf"+cpf + "\n");
        System.out.printf("Possui cartão:"+ cartaoLeoni + "\n");
    }

    public boolean isCartaoLeoni() {
        return cartaoLeoni;
    }

    public void setCartaoLeoni(boolean cartaoLeoni) {
        this.cartaoLeoni = cartaoLeoni;
    }
}
