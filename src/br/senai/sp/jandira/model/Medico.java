package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class Medico extends Pessoa{

    public Medico(Integer valueOf, String par, String par1) {
    }

    private static int contador = 100;
    private Integer codigo;
    private String crm;
    private ArrayList<Especialidade> especialidades;
    //private ArrayList<PlanoDeSaude> planos;

    public Medico() {
      atualizarCodigo();
    }

    public Medico(int codigo) {
        contador++;
        this.codigo = contador;
    }

    public Medico(Integer valueOf, String string, String string0, String string1, String string2, LocalDate dataNascimento, ArrayList<Especialidade> especialidades) {
        
    }

    
    public String getCrm() {
      return crm;
    }

    public void setCrm(String crm) {
	this.crm = crm;
    }

    public ArrayList<Especialidade> getEspecialidades() {
	return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
	this.especialidades = especialidades;
    }       

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Medico.contador = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
        

    // acesso
    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }
    
     public Medico(int codigo, String crm, String nome, String telefone, String email, LocalDate dataNascimento, ArrayList especialidades) {
        this.codigo = codigo;
        this.crm = crm;
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        setDataNascimento(dataNascimento);
        this.especialidades = especialidades;
        this.contador = this.codigo;
    }
    public String getMedicoSeparadoPorPontoEVirgula() {
        String medicoStr = this.codigo + ";" + this.crm + ";" + this.getNome() + 
        ";" + super.getTelefone() + ";" + super.getTelefone() + ";" +
        super.getEmail() + ";" + super.getDataNascimento();
        return medicoStr;
    } 
}
