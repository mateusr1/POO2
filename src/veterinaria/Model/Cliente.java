package veterinaria.Model;

/**
 * Created by Jhordan on 24/11/2015.
 */
public class Cliente implements BaseBean {
    private Integer clienteId;
    private String clienteNome;
    private Integer clienteCPF;
    private Integer clienteCNPJ;
    private String clienteEndereco;

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public Integer getClienteCPF() {
        return clienteCPF;
    }

    public void setClienteCPF(Integer clienteCPF) {
        this.clienteCPF = clienteCPF;
    }

    public Integer getClienteCNPJ() {
        return clienteCNPJ;
    }

    public void setClienteCNPJ(Integer clienteCNPJ) {
        this.clienteCNPJ = clienteCNPJ;
    }

    public String getClienteEndereco() {
        return clienteEndereco;
    }

    public void setClienteEndereco(String clienteEndereco) {
        this.clienteEndereco = clienteEndereco;
    }

    public String getclienteId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getclienteNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getclienteCPF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getclienteCNPJ() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getclienteEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
