/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Marcelo
 */
public class MenuProduct {
    static Integer valueMenu = 0;
	static Scanner input = new Scanner(System.in);
	static ArrayList<Product> products = new ArrayList<Product>();
			
	public static void main(String[] args) {
		while (valueMenu != 3) {
			if (null == valueMenu) {
                            chamarMenu();
                        } else switch (valueMenu) {
                        case 1:
                            informarValues();
                            chamarMenu();
                            break;
                        case 2:
                            print();
                            chamarMenu();
                            break;
                        case 3:
                            System.exit(0);
                        default:
                            chamarMenu();
                            break;
                    }
		}
	}

	private static void print() {
            products.forEach((product) -> {
                System.out.println(product);
        });
		
	}

	private static void informarValues() {
		System.out.println("Informa o name do Product");
		String name = input.next();
		System.out.println("Informar quantidade do Pruduct");
		Integer amount = input.nextInt();
		System.out.println("Informar value do Product");
		Float value = input.nextFloat();
		
		Product newProduct = new Product(name, amount, value);
		products.add(newProduct);
	}

	private static void chamarMenu() {
		System.out.println("#########################");
		System.out.println("MENU");
		System.out.println("1:CADASTRE SEU PRODUTO");
		System.out.println("2:IMPRIMIR PRODUTO");
		System.out.println("3:SAIR");
		
		valueMenu = input.nextInt();
	
}

    private static class Produto {

        public Produto() {
        }
    }
}