import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Aprendendo a abstrair um bootcamp usando POO");
		curso1.setCargaHorária(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Abstraindo Bootcamp");
		mentoria.setDescricao("Aprendendo a abstrair um bootcamp usando POO");
		mentoria.setData(LocalDate.now());
		
		/*Conteudo conteudo = new Curso();
		Conteudo conteudo = new Mentoria();
		List<String> palavras = new ArrayList<>();
		
		System.out.println(curso1);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Banco Pan Java Developer");
		bootcamp.setDescricao("Parceria entre o banco Pan e a DIO");
		bootcamp.getConteudos().add(mentoria);
		bootcamp.getConteudos().add(curso1);
		
		Dev dev = new Dev();
		dev.setNome("Thiago Santos");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Thiago: " + dev.getConteudosInscritos());
		dev.progredir();
		dev.progredir();
		System.out.println("Conteúdos Inscritos Thiago: " + dev.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Thiago: " + dev.getConteudosConcluidos());
		System.out.println("XP: " + dev.calcularTotalXP());
	}
}
