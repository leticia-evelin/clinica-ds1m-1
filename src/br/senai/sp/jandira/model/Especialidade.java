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
            atualizarCodigo();
        }
                
        public Especialidade(String nome, String descricao) {
            this.nome = nome;
            this.descricao = descricao;
            atualizarCodigo();
        }
            
                
        
	public Especialidade() {
           atualizarCodigo();
	}
        
	public void atualizarCodigo() {
            
            this.codigo = contador;
            contador++;
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
	
        public String getDadosEspecialidade() {
            return "Nome:" + this.nome + "," + this.descricao;
        }
        
        public static int getContador() {
            return contador;
        } 
//	public int getQuantidade() {
//		return quantidade;
//	}
		
}
