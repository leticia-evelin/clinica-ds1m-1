
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadesDAO { // Simular nosso banco de dados
    
    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282118\\projeto-java\\especialidade.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    
   public EspecialidadesDAO(Especialidade especialidade) {
       this.especialidades.add(especialidade);
       
   }
   
   public EspecialidadesDAO() {
       
   }
   
   public static void gravar(Especialidade especialidade) {
       especialidades.add(especialidade);
       
       // Gravar a especialidade no arquivo especialidade.txt
       
           //buffer de escrita
        try {
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            bw.write(especialidade.getEspecialidadeSeparadoPorPontoEVirgula());
            bw.newLine();
            bw.close();
            
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(
                   null,
                   "Ocorreu um erro ao gravar.\n\nEntre em contato com o suporte.",
                   "Erro ao gravar",
                   JOptionPane.ERROR_MESSAGE);
        }
   
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
   public static void getListaEspecialidades() {
		
        
        try {
             BufferedReader br = Files.newBufferedReader(PATH);
           
             String linha = br.readLine();
            
            //linha = br.readLine();
            
            while(linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Especialidade novoEspecialidade = new Especialidade(
                        Integer.valueOf(linhaVetor[0]),
                       linhaVetor[1],
                       linhaVetor[2]);
                especialidades.add(novoEspecialidade);
                linha = br.readLine();
            }
            
            br.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null, "Ocorreu um erro ao abrir o arquivo",
                    "Erro de leitura",
                    JOptionPane.ERROR_MESSAGE);
        }
        
       
       
//        Especialidade e1 = new Especialidade("Cardiologia", "Cuida do coração");
//        Especialidade e2 = new Especialidade("Otorrino", "Cuida do ouvido");
//        Especialidade e3 = new Especialidade("Fisioterapia", "Cuida dos ossos e músculos");
//        Especialidade e4 = new Especialidade("Oftalmologista", "Cuida da visão");
//        Especialidade e5 = new Especialidade("Pnelmologista", "Cuida do pulmão");
//        
//        especialidades.add(e1);
//        especialidades.add(e2);
//        especialidades.add(e3);
//        especialidades.add(e4);
//        especialidades.add(e5);
         
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
