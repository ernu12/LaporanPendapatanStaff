package com.staffincome.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Masukan Nama : ");
			String name = sc.nextLine();
			System.out.println("Masukan ID : ");
			String id = sc.nextLine();
			System.out.println("Masukan Jenis Pendapatan : ");
			String jenisPendapatan = sc.nextLine();
			System.out.println("Masukan Jumlah Pendapatan : ");
			double jumlahPendapatan = sc.nextDouble();
			System.out.println("Masukan Presentase Pajak Penghasilan : ");
			double presentasePajakPenghasilan = sc.nextDouble();

			Income income = new Income(jenisPendapatan, jumlahPendapatan, presentasePajakPenghasilan,0.0);
			Staff staff = new Staff(name, id, income);

			System.out.println("Staff dengan nama " + staff.getName());
			System.out.println("dengan ID " + staff.getId());
			System.out.println("memiliki jenis pendapatan " + income.getIncomeType());
			System.out.println("dengan jumlah pendapatan Rp." + income.getAmount());
			System.out.println("dan presentase pajak penghasilan " + income.getTax() + "%");
			System.out.println("dan memiliki total pajak Rp." + income.getTotalTax());
			System.out.println("dengan Total Net Income Rp." + staff.calculateNetIncome());
		}

	}
}
