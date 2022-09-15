package br.senai.sp.jandira;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		
		System.out.println(especialidade.getNome());
		
		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("Unimed");
		plano.setTipoDoPlano("Bronze");
		
		//JOptionPane.showMessageDialog(null, plano.getDadosDoPlano());
		
		PlanoDeSaude planoBradesco = new PlanoDeSaude();
		planoBradesco.setOperadora("Bradesco");
		planoBradesco.setTipoDoPlano("Ouro");
		
		System.out.println(planoBradesco.getTipoDoPlano());
		
		//JOptionPane.showMessageDialog(null, planoBradesco.getOperadora());
		
		System.out.println(planoBradesco.getDadosDoPlano());
		
		Paciente paciente = new Paciente();
		paciente.setNome("Pedro da Silva");
		paciente.setEmail("pedro@uol.com.br");
		paciente.setPlanoDeSaude(plano);
		
		System.out.println(paciente.getPlanoDeSaude().getOperadora());
		
	}

}
