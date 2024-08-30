package main;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("****Dados do Funcionario****");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId(UUID.randomUUID());
		funcionario.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
		funcionario.setCpf(JOptionPane.showInputDialog("Digite o CPF: "));
		funcionario.setMatricula(JOptionPane.showInputDialog("Digite a Matricula: "));
		funcionario.setSalario((Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario: "))));
		
		System.out.println("\tId........: " + funcionario.getId());
		System.out.println("\tNome......: " + funcionario.getNome());
		System.out.println("\tCPF.......: " + funcionario.getCpf());
		System.out.println("\tMatricula.: " + funcionario.getMatricula());
		System.out.println("\tSalario...: " + funcionario.getSalario());
		
		
	}

}
