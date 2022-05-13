package CalculaMensalidade;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String nomAluno;
		double mensalidade, mensalidadeTotal;
		int numIrmaos;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		nomAluno=ler.next();
		System.out.println("Qual é a mensalidade deste aluno: ");
		mensalidade=ler.nextDouble();
		System.out.println("Informe a quantidade de irmãos: ");
		numIrmaos=ler.nextInt();
		
		aluno a1 = new aluno(nomAluno, mensalidade, numIrmaos);
		a1.mostrarMensalidade();
	}
	}


