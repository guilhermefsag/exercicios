package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		// Esse programa registra um número de conta com 4 dígitos, um nome do titular da conta e se será feito um deposito inicial ou não.
		// Logo após você poderá fazer um depósito e um saque, sempre printando os valores atualizados.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		while (accNumber < 1000 || accNumber > 9999) {
			System.out.println("ERROR: Your account must be four digits. ");
			System.out.println("Enter account number: ");
			accNumber = sc.nextInt();
		}

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char confirm = sc.next().charAt(0);

		while (confirm != 'y' && confirm != 'n') {
			System.out.print("Is there na initial deposit (y/n)?");
			confirm = sc.next().charAt(0);
		}

		Account account;
		if (confirm == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accNumber, name, initialDeposit);
			System.out.println();
			System.out.println("Account data: ");
			System.out.println(account);
		} else {
			account = new Account(accNumber, name);
			System.out.println(account);
		}

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.addDeposit(deposit);
		System.out.println();
		System.out.println("Updadete account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a whithdraw value: ");
		double whithdraw = sc.nextDouble();
		account.whitdraw(whithdraw);
		System.out.println();
		System.out.println("Updadete account data");
		System.out.println(account);

		sc.close();
	}

}
