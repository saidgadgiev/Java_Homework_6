import java.util.Scanner;
public class Task_1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Task_2 nb = new Task_2();

        nb.addNotebook("Asus", 8, 512, "Ubuntu", "black");
        nb.addNotebook("Dell", 16, 2048, "Windows 10", "gray");
        nb.addNotebook("Packard Bell", 8, 1024, "Windows 10", "black");
        nb.addNotebook("Lenovo", 16, 1024, "Windows 11", "black");
        nb.addNotebook("IMac", 24, 1024, "MAC OS", "White");

        //nb.showNotebooks();

        nb.showMenu();
        System.out.print("Введите цифру, соответствующую необходимому критерию: ");
        int res = sc.nextInt();
        sc.nextLine();

        String query;

        switch(res) {
            case 1:
                nb.showRamAvailable();
                System.out.print("Введите объем ОЗУ: ");
                query = sc.nextLine();
                nb.showQueryResult("ram", query);
                break;
            case 2:
                nb.showSsdAvailable();
                System.out.print("Введите объем SSD: ");
                query = sc.nextLine();
                nb.showQueryResult("ssd", query);
                break;
            case 3:
                nb.showOsAvailable();
                System.out.print("Операционная система: ");
                query = sc.nextLine();
                nb.showQueryResult("OS", query);
                break;
            case 4:
                nb.showColorAvailable();
                System.out.print("Цвет: ");
                query = sc.nextLine();
                nb.showQueryResult("color", query);
                break;
        }
    }
}