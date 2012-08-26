/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="os")
public class OS implements Serializable{
    private static final long serialVersionUID = 2701286121141430427L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_os;
    
    @OneToOne(cascade= CascadeType.ALL, optional=false, fetch= FetchType.EAGER)
    @JoinColumn(name="id_cliente")
    private Cliente cliente;
    
    @OneToOne(cascade= CascadeType.ALL, optional=false, fetch= FetchType.EAGER)
    @JoinColumn(name="id_tipo_servico")
    private TipoServico tipo_servico;
    
    @OneToOne(cascade= CascadeType.ALL, optional=false, fetch= FetchType.EAGER)
    @JoinColumn(name="id_funcionario")
    private Funcionario funcionario_responsavel;
    
    private String historico;
    private String descricao;
    
    @Temporal(TemporalType.DATE)
    private Date data_inicial;
    
    @Temporal(TemporalType.DATE)
    private Date data_final;

    public long getId_os() {
        return id_os;
    }

    public void setId_os(long id_os) {
        this.id_os = id_os;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoServico getTipo_servico() {
        return tipo_servico;
    }

    public void setTipo_servico(TipoServico tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    public Funcionario getFuncionario_responsavel() {
        return funcionario_responsavel;
    }

    public void setFuncionario_responsavel(Funcionario funcionario_responsavel) {
        this.funcionario_responsavel = funcionario_responsavel;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_inicial() {
        return data_inicial;
    }

    public void setData_inicial(Date data_inicial) {
        this.data_inicial = data_inicial;
    }

    public Date getData_final() {
        return data_final;
    }

    public void setData_final(Date data_final) {
        this.data_final = data_final;
    }
    
}
