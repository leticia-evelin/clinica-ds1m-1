
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadesDAO { // Simular nosso banco de dados
    
    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    
   public EspecialidadesDAO(Especialidade especialidade) {
       this.especialidades.add(especialidade);
       
   }
   
   public EspecialidadesDAO() {
       
   }
   
   public static void gravar(Especialidade especialidade) {
       especialidades.add(especialidade);
   }
   
   public static boolean excluir (Integer codigo) {
       for(Especialidade e : especialidades) {
           if(e.getCodigo().equals(codigo)) {
               especialidades.remove(e);
               return true;
           }
       }
       return false;
   }
   
   public static Especialidade getEspecialidade(Integer codigo) {
       for(Especialidade e : especialidades) {
           if(e.getCodigo().equals(codigo)) {
               return e;
           }
       }
        return null;
   }
   
   public static void atualizar(Especialidade especialidade) {
      for(Especialidade e : especialidades) {
          if(e.getCodigo().equals(especialidade.getCodigo())) {
              especialidades.set(especialidades.indexOf(e), especialidade);
              break;
          }
          
      }
  }
   
   public static ArrayList<Especialidade> listarTodos() {
       return especialidades;
   }
   
   
   
   
   // Criar e inserir na lista de planos
   public static void criarEspecialidades() {
		
        Especialidade e1 = new Especialidade("Cardiologia", "Cuida do coração");
        Especialidade e2 = new Especialidade("Otorrino", "Cuidado ouvido");
        Especialidade e3 = new Especialidade("Fisioterapia", "Cuida dos ossos e músculos");
        Especialidade e4 = new Especialidade("Oftalmo", "Cuida da visão");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
        
        }
   

   
    public static DefaultTableModel getTableModel() {
        // Receberá as especialidades
        Object[][] dados = new Object[especialidades.size()][3];
        
        int i = 0;
        
        for(Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
            
        }
        
        String[] titulos = {"Códigos", "Especialidade", "Descrição da especialidade"};
        
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        
        return tableModel;
    }
    
    
    
   
    
}
