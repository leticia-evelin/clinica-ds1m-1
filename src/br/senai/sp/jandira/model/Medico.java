package br.senai.sp.jandira.model;

import java.util.ArrayList;


public class Medico extends Pessoa{

    public Medico(Integer valueOf, String par, String par1) {
    }

    private static int contador = 100;
    private Integer codigo;
    private String crm;
    private ArrayList<Especialidade> especialidades;
    private ArrayList<PlanoDeSaude> planos;

    public Medico() {
      atualizarCodigo();
    }

    public Medico(int codigo) {
        this.codigo = codigo;
        this.contador = this.codigo;
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
    
    public String getMedicoSeparadoPorPontoEVirgula() {
        String medicoStr = this.codigo + ";" + this.crm + ";" + this.getNome() + 
        ";" + super.getTelefone() + ";" + super.getTelefone() + ";" +
        super.getEmail() + ";" + super.getDataNascimento();
        return medicoStr;
    } 
    

}
