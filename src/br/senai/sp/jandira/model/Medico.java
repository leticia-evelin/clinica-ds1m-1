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
//        this.codigo = codigo;;
        this.contador = codigo++;
    }

    
    public String getCrm() {
      return crm;
    }

    public void setCrm(String crm) {
	this.crm = crm;
    }

    public String getEspecialidadesStr() {
        return especialidades.toString();
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
        
//          String medicoStr = this.codigo + ";" + this.crm + ";" + this.getNome() + 
//          ";" + super.getTelefone() + ";" +
//          super.getEmail() + ";" + super.getDataNascimento();
//           return medicoStr;
                
        String getCodigoEspecialidades = "";
        for (Especialidade e : especialidades) {
            getCodigoEspecialidades += e.getCodigo() + ";";
        }
        return this.codigo + ";" + this.crm + ";" + getNome() + ";" + 
        getTelefone() + ";" + getEmail() + ";" + 
        getDataNascimento() + ";" + getCodigoEspecialidades;
    } 
//    
     public ArrayList<String> getListaDeEspecialidadesDoMedico() {
        ArrayList<String> dados = new ArrayList<>();
        for (Especialidade e : especialidades) {
            dados.add(e.getNome());
        }
            DefaultListModel<String> ListaModel = new DefaultListModel<>();
        
        ListaModel.addAll(dados);
        
        return dados; 
    }
}
