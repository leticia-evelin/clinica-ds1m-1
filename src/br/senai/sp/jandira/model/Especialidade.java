package br.senai.sp.jandira.model;

public class Especialidade {
	
        private static int contador = 0;
        private Integer codigo;
	private String nome;
	private String descricao;
        
	//private static int quantidade;
	
        // Construtores da classe
        
        
        public Especialidade(String nome) {
            this.nome = nome;
        }
                
                
                
        
	public Especialidade() {
           // contador++;
		//quantidade++;
	}
        
	
	// Métodos de acesso getters and setters
        public Integer getCodigo() {
            return codigo;
        }
        
	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
//	public int getQuantidade() {
//		return quantidade;
//	}
		
}
