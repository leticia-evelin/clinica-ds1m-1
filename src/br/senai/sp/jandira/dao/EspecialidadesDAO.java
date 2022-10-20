
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadesDAO { // Simular nosso banco de dados
    
    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    
   public EspecialidadesDAO(Especialidade especialidade) {
       this.especialidades.add(especialidade);
       
   }
   
   public EspecialidadesDAO() {
       
   }
   
   public static void gravar(Especialidade especialidade) {
       
   }
   
   public static void atualizar(Especialidade especialidade) {
      
  }
   
   public static ArrayList<Especialidade> listarTodos() {
       return especialidades;
   }
   
   
   
   
   // Criar e inserir na lista de planos
   public static void criarEspecialidades() {
       
       //Especialidade e1 = new Especialidade("Cardiologia","Cuida do coração.");
		
       Especialidade e2 = new Especialidade();
	e2.setNome("Otorrino");
	e2.setDescricao("Cuida do ouvido.");
		
       Especialidade e3 = new Especialidade();
	e3.setNome("Fisioterapia");
	e3.setDescricao("Cuida dos ossos e músculos.");
		
	Especialidade teste = new Especialidade();
		
       
   }
   

   
    
    
    
    
   
    
}
