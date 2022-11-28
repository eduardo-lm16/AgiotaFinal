/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import java.util.Date;

/**
 *
 * @author aluno
 */
        
 
public class Divida {
    private int id;
    private int id_devedor;
    private int id_agiota;
    private float taxa_juros;
    private int parcelas;
    private Date datainicial;
    private float valor_inicial;
    private boolean pago;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_devedor() {
        return id_devedor;
    }

    public void setId_devedor(int id_devedor) {
        this.id_devedor = id_devedor;
    }

    public int getId_agiota() {
        return id_agiota;
    }

    public void setId_agiota(int id_agiota) {
        this.id_agiota = id_agiota;
    }

    public float getTaxa_juros() {
        return taxa_juros;
    }

    public void setTaxa_juros(float taxa_juros) {
        this.taxa_juros = taxa_juros;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public Date getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(Date datainicial) {
        this.datainicial = datainicial;
    }

    public float getValor_inicial() {
        return valor_inicial;
    }

    public void setValor_inicial(float valor_inicial) {
        this.valor_inicial = valor_inicial;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
    
    
    
    
}
