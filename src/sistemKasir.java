import java.util.Scanner;

public class sistemKasir {
	private static int menu;
	
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void main(String[] args) {
		double nasgor=15000,naswon=15000,nasdeg=15000,jusrek=15000;
		String[] nama_menu = new String[5];
		double[] total = new double[99];
		int menu = 1;
			Scanner masukkan = new Scanner(System.in);
				for(int i=1;i<99;i++) {
					if(menu<6) {
					System.out.println(" ==================================================");
					System.out.println("    ============== Menu Restoran =============");
					System.out.println("|== 1. Nasi Goreng  2. Nasi Rawon  3. Nasi Gudeg ==|");
					System.out.println("|== 4. Jus Jeruk    5. Hitung Total  6. KELUAR   ==|");
					System.out.println(" ==================================================");
					}
					System.out.print("Pilih Menu : ");
					menu = masukkan.nextInt();
					switch(menu) {
					case 1:
						nama_menu[1]="Nasi Goreng";
						System.out.print("Berapa buting : ");
						int jumlah1 = masukkan.nextInt();
						total[i]=nasgor*jumlah1;
						System.out.println("Total Sementara : "+total[i]);
						break;
					case 2:
						nama_menu[2]="Nasi Rawon";
						System.out.print("Berapa buting : ");
						int jumlah2 = masukkan.nextInt();
						total[i]=naswon*jumlah2;
						System.out.println("Total Sementara : "+total[i]);
						break;
					case 3:
						nama_menu[3]="Nasi Gudeg";
						System.out.print("Berapa buting : ");
						int jumlah3 = masukkan.nextInt();
						total[i]=nasdeg*jumlah3;
						System.out.println("Total Sementara : "+total[i]);
						break;
					case 4:
						nama_menu[4]="Jus Jeruk";
						System.out.print("Berapa buting : ");
						int jumlah4 = masukkan.nextInt();
						total[i]=jusrek*jumlah4;
						System.out.println("Total Sementara : "+total[i]);
						break;
					case 5:
						for(int j=0;j<i;j++) {
							total[i]+=total[j];
						}
//						total[i]=total[0]+total[1]+total[2]+total[3]+total[4];
						System.out.println("Total yang harus dibayar : Rp "+total[i]);
						break;
					}//penutup switch
					if(menu==5) break;
					if(menu==6)	System.exit(0); // System.exit(0);
					if(menu>6) {
						System.out.println("Salah Input!");
					
					}
				}//penutup FOR
				System.out.print(">>> Menu yang dipilih : ");
				if(nama_menu[1]=="Nasi Goreng") {
					System.out.print("1. "+nama_menu[1]+" ");
				}
				if(nama_menu[2]=="Nasi Rawon") {
					System.out.print("2. "+nama_menu[2]+" ");
				}
				if(nama_menu[3]=="Nasi Gudeg") {
					System.out.print("3. "+nama_menu[3]+" ");
				}
				if(nama_menu[4]=="Jus Jeruk") {
					System.out.print("4. "+nama_menu[4]+" ");
				}
	}
}
