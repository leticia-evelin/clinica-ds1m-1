package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class Medico extends Pessoa{

    private static int contador = 100;
    private Integer codigo;
    private String crm;
    private ArrayList<Especialidade> especialidades;
    
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Medico() {
      atualizarCodigo();
    }

    public Medico(int codigo) {
        contador++;
        this.codigo = contador;
    }

    public Medico(Integer codigo, String crm, String nome, String telefone, String email, String dataNascimento, ArrayList especialidades) {
        this.codigo = codigo;
        this.crm = crm;
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        setDataNascimento(dataNascimento);
        this.especialidades = especialidades;
        this.contador = codigo++;
    }

    
    public String getCrm() {
      return crm;
    }

    public void setCrm(String crm) {
	this.crm = crm;
    }

//    public String getEspecialidadesStr() {
//        return especialidades.toString();
//    }
    
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
        
        return this.codigo + ";" + this.crm + ";" + getNome() + ";" + 
        getTelefone() + ";" + getEmail() + ";" + 
        getDataNascimento() + ";" + getCodigosEspecialidades();
    } 
    
    public String getCodigosEspecialidades() {
        String codigosEspecialidades = "";
        for (Especialidade especialidade : especialidades) {
            codigosEspecialidades += especialidade.getCodigo() + ";";
        }
        return codigosEspecialidades;
    }

     public ArrayList<String> getListaDeEspecialidadesDoMedico() {
        DefaultListModel<String> listaModel = new DefaultListModel<>();
        ArrayList<String> dados = new ArrayList<>();
        
        for (Especialidade especialidade : especialidades) {
            dados.add(especialidade.getNome());
        }
          
        listaModel.addAll(dados);
        
        return dados; 
    }
}
