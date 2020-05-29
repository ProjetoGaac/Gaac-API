/** Class that represents Subject
 * @author Gabriel Batista
 * @version 1.0.0 */

package br.com.gaac.domain;

public class CourseType{

    private String nome;
    private String descricacao;

    public CourseType(String nome, String descricacao){
        this.nome = nome;
        this.descricacao = descricacao;
    }

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricacao() {
		return this.descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}


}