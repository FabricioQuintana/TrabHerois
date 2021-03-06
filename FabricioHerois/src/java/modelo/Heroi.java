/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "heroi")
@NamedQueries({
    @NamedQuery(name = "Heroi.findAll", query = "SELECT h FROM Heroi h")})
public class Heroi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "codnome")
    private String codnome;
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "foto")
    private String foto;
    @Column(name = "inteligencia")
    private Integer inteligencia;
    @Column(name = "forca")
    private Integer forca;
    @Column(name = "velocidade")
    private Integer velocidade;
    @Column(name = "projecadenergia")
    private Integer projecadenergia;
    @Column(name = "habilidadecombate")
    private Integer habilidadecombate;
    @ManyToMany(mappedBy = "heroiList")
    private List<Equipe> equipeList;
    @JoinColumn(name = "categoria", referencedColumnName = "codigo")
    @ManyToOne
    private Categoria categoria;
    @JoinColumn(name = "editora", referencedColumnName = "codigo")
    @ManyToOne
    private Editora editora;
    @JoinColumn(name = "regiao", referencedColumnName = "codigo")
    @ManyToOne
    private Regiao regiao;

    public Heroi() {
    }

    public Heroi(Integer codigo) {
        this.codigo = codigo;
    }

    public Heroi(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodnome() {
        return codnome;
    }

    public void setCodnome(String codnome) {
        this.codnome = codnome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getProjecadenergia() {
        return projecadenergia;
    }

    public void setProjecadenergia(Integer projecadenergia) {
        this.projecadenergia = projecadenergia;
    }

    public Integer getHabilidadecombate() {
        return habilidadecombate;
    }

    public void setHabilidadecombate(Integer habilidadecombate) {
        this.habilidadecombate = habilidadecombate;
    }

    public List<Equipe> getEquipeList() {
        return equipeList;
    }

    public void setEquipeList(List<Equipe> equipeList) {
        this.equipeList = equipeList;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Heroi)) {
            return false;
        }
        Heroi other = (Heroi) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Heroi[ codigo=" + codigo + " ]";
    }
    
}
