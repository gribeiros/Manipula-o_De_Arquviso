package aplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Produto> produto = new ArrayList<Produto>();
		System.out.print("Local da pasta:");
		String local = sc.next();
		System.out.println();
		
		File pasta = new File(local);
		
		boolean s = new File(local+"//Arquivos").mkdir();
		
		String arquivo = (local+"//Arquivos//teste2.csv");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) {

			System.out.print("Quantidade de produtos:");
			int a = sc.nextInt();
			sc.nextLine();
			for (int b = 0; b < a; b++) {
				System.out.println();
				System.out.println("Produto " + (b + 1) + ":");
				System.out.println();
				System.out.print("Nome:");
				String nome = sc.next();
				System.out.print("Preço:");
				Double preco = sc.nextDouble();
				System.out.print("Quantidade:");
				Integer quantidade = sc.nextInt();
				produto.add(new Produto(nome, preco, quantidade));
			}

			for (Produto p : produto) {
				bw.write("Nome: " + p.getNome() + ", " + "Preço: " + String.format("%.2f", p.getPreco()) + "$, "
						+ "Quantidade: " + p.getQuantidade() + ", " + "Preço Unitario: "
						+ String.format("%.2f", p.precoUni()) + "$");
				bw.newLine();
			}
			System.out.println("Salvo!!");

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
