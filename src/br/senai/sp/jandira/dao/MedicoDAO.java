package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
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


public class MedicoDAO {
    
    private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282118\\projeto-java\\medico.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    
    public MedicoDAO(Medico medico) {
        this.medico.add(medico);
    }
    
    public MedicoDAO() {
    
}  
    public static void gravar(Medico medico) {
        medico.add(medico);
        
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
                   "Erro ao gravar",
                   JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static boolean excluir (Integer codigo) {
       for(Medico m : medicos ) {
           if(m.getCodigo().equals(codigo)) {
               medicos.remove(m);
               return true;
            }
        }
       return false;
    }
    
    
    public static void atualizar(Medico medico){
        for(Medico m : medicos) {
          if(m.getCodigo().equals(medico.getCodigo())) {
              medicos.set(medicos.indexOf(m), medico);
              break;
            }
        }
    }
    
    public static ArrayList<Medico> listarTodos() {
       return medicos;
    }
    
    public static void getListaDeMedicos() {
         try {
             BufferedReader br = Files.newBufferedReader(PATH);
           
             String linha = br.readLine();
            
            //linha = br.readLine();
            
            while(linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Medico novoMedico = new Medico(
                        Integer.valueOf(linhaVetor[0]),
                       linhaVetor[1],
                       linhaVetor[2]);
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
        Object[][] dados = new Object[medicos.size()][3];
        
        int i = 0;
        
        for(Medico m : medicos) {
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            i++;
            
        }
        
        String[] titulos = {"Códigos", "CRM", "Nome dos(as) Médicos(as)"};
        
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        
        return tableModel;
    }
    
}
