package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MedicoDAO {
    
    private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList<>();
    private Especialidade especialidade;
    private ArrayList<Especialidade> especialidades;
    
    private static final String ARQUIVO = "C:\\Users\\22282118\\projeto-java\\medico.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282118\\projeto-java\\medico_temp.txt";
    
   //casa:
//    private static final String ARQUIVO = "C:\\Users\\Sony\\projeto-java\\medico.txt";
//    private static final String ARQUIVO_TEMP = "C:\\Users\\Sony\\projeto-java\\medico_temp.txt";
    
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO);
    
    private static final int QUANTIDADE_INDICES_ARQUIVO_PADRAO = 6;
    
    public MedicoDAO() {
    
    }  
    
    public MedicoDAO(Medico medico) {
        this.medicos.add(medico);          
    }

    public static void gravar(Medico medico) {
        medicos.add(medico);
        
        // Gravar o medico no arquivo medico.txt
        
        try {
            BufferedWriter bw = Files.newBufferedWriter(
           PATH,
           StandardOpenOption.APPEND,
           StandardOpenOption.WRITE);
            
            bw.write(medico.getMedicoSeparadoPorPontoEVirgula());
            bw.newLine();
            bw.close();
            
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(
           null,
           "Ocorreu um erro ao gravar.\n\nEntre em contato com o suporte.",
           "ERRO",
           JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static boolean excluir (Integer codigo) {
       for(Medico m : medicos ) {
           if(m.getCodigo().equals(codigo)) {
               medicos.remove(m);
               break;
            }
        }
       atualizarArquivo();
       return false;
    }
    
    public static Medico getMedico(Integer codigo) {
       for(Medico m : medicos) {
           if(m.getCodigo().equals(codigo)) {
               return m;
            }
        }
        return null;
    }
    
    public static void atualizar(Medico medico){
        for(Medico m : medicos) {
          if(m.getCodigo().equals(medico.getCodigo())) {
              medicos.set(medicos.indexOf(m), medico);
              break;
            }          
        }
        atualizarArquivo();
    }
    
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static void atualizarArquivo() {
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);
        
        try {
            
           // Criar o arquivo temporário
           arquivoTemp.createNewFile();
           
           // Abrir o arquivo temporário para escrita
           BufferedWriter bwTemp = Files.newBufferedWriter(
                   PATH_TEMP,
                   StandardOpenOption.APPEND,
                   StandardOpenOption.WRITE);
           
           // Iterar a lista para adicionar os planos no arquivo temporário
           for(Medico m : medicos) {
               bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
               bwTemp.newLine();
           }
           
           // Fechar o arquivo temporário
           bwTemp.close();
           
           // Excluir o arquivo atual - medico.txt
           arquivoAtual.delete();
           
           // Renomear o arquivo temporário
           arquivoTemp.renameTo(arquivoAtual);
           
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
           null, 
           "Ocorreu um erro ao  criar o arquivo!", 
           "Erro", 
           JOptionPane.ERROR_MESSAGE);
        }    
    }
       
     public static ArrayList<Medico> listarTodos() {
        return medicos;
      }
   
    public static void getListaDeMedicos() throws IOException {
         try {
             BufferedReader br = Files.newBufferedReader(PATH);
           
             String linha = "";
            
            linha = br.readLine();
            
            
           while(linha != null && !linha.isEmpty()) {
               String[] linhaVetor = linha.split(";");
            
               ArrayList<Especialidade> especialidades = new ArrayList<>();

               
               int i = 0;
 
               while(linhaVetor.length > i + QUANTIDADE_INDICES_ARQUIVO_PADRAO){
                   especialidades.add(EspecialidadesDAO.getEspecialidade(Integer.valueOf(linhaVetor[QUANTIDADE_INDICES_ARQUIVO_PADRAO + i])));
                    i++;
                }
                    
                String[] data = linhaVetor[5].split("/");           

                Medico novoMedico = new Medico(Integer.valueOf(linhaVetor[0]),
                linhaVetor[1],
                linhaVetor[2],
                linhaVetor[3],
                linhaVetor[4],
                linhaVetor[5],
                especialidades);

                
                medicos.add(novoMedico);
                linha = br.readLine();
            }
            
            br.close();
           
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
           null, "Ocorreu um erro ao abrir o arquivo",
           "Erro de leitura",
           JOptionPane.ERROR_MESSAGE);
        }     
    }
    
    public static DefaultTableModel getTableModel() {
        // Receberá as especialidades
        Object[][] dados = new Object[medicos.size()][4];
        
        int i = 0;
        
        for(Medico m : medicos) {
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
            i++;    
        }
        
        String[] titulos = {"Códigos", "CRM", "Nome do Médico", "Telefone"};
        
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        return tableModel;
    }   
}
