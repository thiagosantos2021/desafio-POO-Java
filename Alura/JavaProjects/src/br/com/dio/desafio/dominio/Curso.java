package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	private int cargaHorária;
	
	public Curso() {
		super();
	}
	
	@Override
	public double calcularXP() {
		return XP_PADRAO + cargaHorária;
	}
	
	public int getCargaHorária() {
		return cargaHorária;
	}
	public void setCargaHorária(int cargaHorária) {
		this.cargaHorária = cargaHorária;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHorária=" + cargaHorária + "]";
	}
}
