package assign4;

import java.util.Scanner;

public class PurchaseCar {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("1.Purchase Car:\n2.Sell car:\n3.exit: ");

        String carName;

        do {
            do {
                choice = scan.nextInt();
                String car1 = "Ford Mustang";
                String car2 = "Audi Q3";
                String car3 = "Toyota Corolla";
                String car4 = "Suzuki Mehran";
                String car5 = "Bugatti Chiron";
                String car6 = "Nissan Jonga";
                String car7 = "Volkswagen Passat";
                String car8 = "Tesla Roadster";
                String car9 = "BMW X1";
                String car10 = "Ferrari F80";
                int p1 = 1900000;
                int p2 = 1000000;
                int p3 = 1800000;
                int p4 = 320000;
                int p5 = 2500000;
                int p6 = 2000000;
                int p7 = 1900000;
                int p8 = 1900000;
                int p9 = 2300000;
                int p10 = 2000000;

                switch (choice) {

                    case 1:
                        System.out.println("cars for sale:\n");
                        System.out.println("1.   " + car1 + "          Rs." + p1);
                        System.out.println("2.   " + car2 + "               Rs." + p2);
                        System.out.println("3.   " + car3 + "        Rs." + p3);
                        System.out.println("4.   " + car4 + "         Rs." + p4);
                        System.out.println("5.   " + car5 + "        Rs." + p5);
                        System.out.println("6.   " + car6 + "          Rs." + p6);
                        System.out.println("7.   " + car7 + "     Rs." + p7);
                        System.out.println("8.   " + car8 + "        Rs." + p8);
                        System.out.println("9.   " + car9 + "                Rs." + p9);
                        System.out.println("10.  " + car10 + "           Rs." + p10);
                        System.out.println("11.Return to main menu  ");


                        break;
                    case 2:
                        System.out.print("Enter the model of car you want to sell:");
                        carName = scan.next();

                        System.out.println("Enter the MAX. speed of " + carName);
                        double carSpeed = scan.nextDouble();
                        if (carSpeed < 30) {
                            System.out.println("Re enter the speed");
                        }

                        if (carSpeed > 30 && carSpeed < 60) {
                            System.out.println(+carSpeed);
                            System.out.println("I hope it's not Horse driven Cart");
                        } else if (carSpeed > 50 && carSpeed <= 120) {
                            System.out.println("Your " + carName + " has Good speed ");
                        } else if (carSpeed > 120 && carSpeed <= 250) {
                            System.out.println("Avoid from over speed ");
                        }
                        System.out.println("Enter the price of " + carName);
                        int carPrice = scan.nextInt();
                        if (carPrice <= 2500000) {
                            System.out.println("So you want to sell your, " + carName + "in  Rs." + carPrice);
                        }
                        double cp = carSpeed * 9880;

                        if (carPrice >= cp) {
                            System.out.println("Sorry I can't purchase your, " + carName + "in  Rs." + carPrice);
                            System.out.println("I can sell your " + carName + ",Within   Rs. " + cp);
                        }

                        if (carPrice <= cp) {

                            System.out.println("I can sell your " + carName + ",Within   Rs. " + cp);
                        }

                        break;
                    default:
                        System.exit(0b0);
                        break;
                }


                int count;
                count = scan.nextInt();
                switch (count) {
                    case 1:
                        System.out.println("1.   " + car1 + "          Rs." + p1);

                        System.out.println(" Enter the price in which you want to purchase :    ");
                        int carPrice1 = scan.nextInt();
                        int cp1 = 240 * 7269;
                        if (carPrice1 < cp1) {
                            System.out.println("Rs. " + carPrice1 + "sale price can't be less than " + cp1);
                        } else if (carPrice1 > cp1 && carPrice1 == 1900000) {
                            System.out.println("Rs. " + carPrice1 + "Thanks for purchasing ");
                        }
                        break;
                    case 2:
                        System.out.println("2.   " + car2 + "               Rs." + p2);
                        System.out.println(" Enter the price in which you want to purchase :    ");
                        int carPrice2 = scan.nextInt();
                        int cp2 = 180 * 5500;
                        if (carPrice2 < cp2) {
                            System.out.println("Rs. " + carPrice2 + "sale price can't be less than " + cp2);
                        } else if (carPrice2 > cp2 && carPrice2 == 1050000) {
                            System.out.println("Rs. " + carPrice2 + "  Thanks for purchasing ");

                        }
                        break;
                    case 3:
                        System.out.println("3.   " + car3 + "        Rs." + p3);
                        System.out.println(" Enter the price in which you want to purchase :    ");
                        int carPrice3 = scan.nextInt();
                        int cp3 = 200 * 8600;
                        if (carPrice3 < cp3) {
                            System.out.println("Rs. " + carPrice3 + "   sale price can't be less than " + cp3);
                        } else if (carPrice3 > cp3 && carPrice3 == 1850000) {
                            System.out.println("Rs. " + carPrice3 + "  Thanks for purchasing ");
                        }
                        break;
                    case 4:
                        System.out.println("4.   " + car4 + "         Rs." + p4);
                        System.out.println(" Enter the price in which you want to purchase :    ");
                        int carPrice4 = scan.nextInt();
                        int cp4 = 100 * 3150;
                        if (carPrice4 < cp4) {
                            System.out.println("Rs. " + carPrice4 + "   sale price can't be less than " + cp4);
                        } else if (carPrice4 > cp4 && carPrice4 == 328000) {
                            System.out.println("Rs. " + carPrice4 + "  Thanks for purchasing ");
                        }
                        break;
                    case 5:
                        System.out.println("5.   " + car5 + "        Rs." + p5);
                        System.out.println(" Enter the price in which you want to purchase :    ");
                        int carPrice5 = scan.nextInt();
                        int cp5 = 280 * 8600;
                        if (carPrice5 < cp5) {
                            System.out.println("Rs. " + carPrice5 + "  but sale price can't be less than " + cp5);
                        } else if (carPrice5 > cp5 && carPrice5 == 2570000) {
                            System.out.println("Rs. " + carPrice5 + "  Thanks for purchasing ");

                        }
                        break;
                    case 6:
                        System.out.println("6.   " + car6 + "          Rs." + p6);
                        System.out.println(" Enter the price in which you want to purchase :    ");
                        int carPrice6 = scan.nextInt();
                        int cp6 = 260 * 7500;
                        if (carPrice6 < cp6) {
                            System.out.println("Rs. " + carPrice6 + "  but sale price can't be less than " + cp6);
                        } else if (carPrice6 > cp6 && carPrice6 == 2010000) {
                            System.out.println("Rs. " + carPrice6 + "  Thanks for purchasing ");
                        }
                        break;
                    case 7:
                        System.out.println("7.   " + car7 + "     Rs." + p7);
                        System.out.println(" Enter the price in which you want to purchase :    ");
                        int carPrice7 = scan.nextInt();
                        int cp7 = 260 * 7200;
                        if (carPrice7 < cp7) {
                            System.out.println("Rs. " + carPrice7 + "  but sale price can't be less than " + cp7);
                        } else if (carPrice7 > cp7 && carPrice7 == 1905000) {
                            System.out.println("Rs. " + carPrice7 + "  Thanks for purchasing ");
                        }
                        break;
                    case 8:
                        System.out.println("8.   " + car8 + "        Rs." + p8);
                        System.out.println(" Enter the price in which you want to purchase :    ");
                        int carPrice8 = scan.nextInt();
                        int cp8 = 280 * 6750;
                        if (carPrice8 < cp8) {
                            System.out.println("Rs. " + carPrice8 + "  but sale price can't be less than " + cp8);
                        } else if (carPrice8 > cp8 && carPrice8 == 1910000) {
                            System.out.println("Rs. " + carPrice8 + "  Thanks for purchasing ");
                        }
                        break;
                    case 9:
                        System.out.println("9.   " + car9 + "                Rs." + p9);
                        System.out.println(" Enter the price in which you want to purchase :    ");
                        int carPrice9 = scan.nextInt();
                        int cp9 = 280 * 8170;
                        if (carPrice9 < cp9) {
                            System.out.println("Rs. " + carPrice9 + "  but sale price can't be less than " + cp9);
                        } else if (carPrice9 > cp9 && carPrice9 == 2306798) {
                            System.out.println("Rs. " + carPrice9 + "  Thanks for purchasing ");
                        }
                        break;
                    case 10:
                        System.out.println("10.  " + car10 + "           Rs." + p10);
                        System.out.println(" Enter the price in which you want to purchase :    ");
                        int carPrice10 = scan.nextInt();
                        int cp10 = 260 * 7599;
                        if (carPrice10 < cp10) {
                            System.out.println("Rs. " + carPrice10 + "  but sale price can't be less than " + cp10);
                        } else if (carPrice10 > cp10 && carPrice10 == 2010000) {
                            System.out.println("Rs. " + carPrice10 + "  Thanks for purchasing ");
                        }
                        break;
                    default:
                        System.out.println("Main menu");

                        break;
                }

            } while (choice <= 3);
        } while (choice == 11);
    }
}







