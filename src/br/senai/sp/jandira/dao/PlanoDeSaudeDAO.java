package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO { // Simular nosso banco de dados

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }

    public PlanoDeSaudeDAO() {

    }

    // recebe plano de saúde, adiciona o planos de saúde no planos
    public static void gravar(PlanoDeSaude planoDeSaude) {
        planos.add(planoDeSaude);
    }

    public static boolean excluir(Integer codigo) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                planos.remove(p);
                return true; // vai fazer a função do break
            }
        }
        return false;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {

        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaude) {

        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(planoDeSaude.getCodigo())) {
            planos.set(planos.indexOf(p), planoDeSaude);
                break;
            }     
        }
    }

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;
    }

    // Criar e inserir na lista de planos
    public static void criarPlanosDeSaudeTeste() {
        PlanoDeSaude p1 = new PlanoDeSaude("Unimed", "Bronze");
        PlanoDeSaude p2 = new PlanoDeSaude("Unimed", "Ouro");
        PlanoDeSaude p3 = new PlanoDeSaude("Amil", "Advanced");
        PlanoDeSaude p4 = new PlanoDeSaude("Bradesco", "Exclusive");

        planos.add(p1);
        planos.add(p2);
        planos.add(p3);
        planos.add(p4);

    }

    public static DefaultTableModel getTableModel() {

        // Matriz que receberá os planos de saúde
        // que serão utilizados na tabela (JTable)
        Object[][] dados = new Object[planos.size()][3]; //duas dimensões, coluna linha - matriz

        // For each para extrair cada objeto plano de saúde do
        // array list planos e separar cada dado na matriz dados
        int i = 0;

        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }

        // Definir um vetor com os nomes das colunas da tabela
        String[] titulos = {"Códigos", "Nome da Operadora", "Tipo do plano"}; // Uma dimensão, uma linha

        // Criar o modelo que será utilizado pela JTable
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }

}
