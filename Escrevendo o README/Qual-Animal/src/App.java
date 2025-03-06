import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String MAR, // Significa Mamífero, Ave ou Reptiu
        QBVA, // Significa Quadrupede, Bípede, Voador, ou Aquático;
        CH, // Significa Carnívoro ou Herbívoro
        OV, // Significa Onívoros e frutívoros
        NND, // Significa Não-voadoras, Nadadoras ou De Rapina
        TP, // Sigifica Tropical ou Polar;
        CCS; // Significa Com casco Carnívoros ou Sem patas

        System.out.println("----- Descubra qual Animal -----");

        System.out.println("Que tipo de animal ele é?");
        System.out.print("Mamífero = M / Ave = A / Reptiu = R: ");
        MAR = scan.nextLine();

        if (MAR.equals("M")) {
            System.out.println();
            System.out.println("Ele é?");
            System.out.print("Quadrupede = Q / Bipede = B / Voador = V / Aquático = A: ");
            QBVA = scan.nextLine();

            if (QBVA.equals("Q")) {
                System.out.println();
                System.out.println("Qual a alimentação dele? ");
                System.out.print("Carnívoro = C / Herbívoro = H: ");
                CH = scan.nextLine();

                if (CH.equals("C")) {
                    System.out.println();
                    System.out.println("Ele é o Leão.");
                }
                else if (CH.equals("H")) {
                    System.out.println();
                    System.out.println("Ele é o Cavalo.");
                }
            }
            else if (QBVA.equals("B")) {
                System.out.println();
                System.out.println("Qual a alimentação deles? ");
                OV = scan.nextLine();
                if (OV.equals("O")) {
                    System.out.println();
                    System.out.println("Ele é o Homem.");
                }
                else if (OV.equals("V")) {
                    System.out.println();
                    System.out.println("Ele é o Macaco.");
                }
            }
            else if (QBVA.equals("V")) {
                System.out.println();
                System.out.println("Ele é o Morcego.");
            }
            else if (QBVA.equals("A")) {
                System.out.println();
                System.out.println("Ele é a Baleia.");
            }
        }
        else if (MAR.equals("A")) {
            System.out.println();
            System.out.println("Ele é?");
            System.out.print("Não-Voadoras = NV / Nadadoras = NA / De Rapina = D: ");
            NND = scan.nextLine();

            if (NND.equals("NV")) {
                System.out.println();
                System.out.println("Qual Habitat Naturual? ");
                System.out.print("Tropical = T / Polar = P: ");
                TP = scan.nextLine();
                if (TP.equals("T")) {
                    System.out.println();
                    System.out.println("Ele é o Avestruz.");
                }
                else if (TP.equals("P")) {
                    System.out.println();
                    System.out.println("Ele é o Pinguim.");
                }
            }
            else if (NND.equals("NA")) {
                System.out.println();
                System.out.println("Ele é o Pato.");
            }
            else if (NND.equals("D")) {
                System.out.println();
                System.out.println("Ele é a Águia.");
            }
        }
        else if (MAR.equals("R")) {
            System.out.println();
            System.out.println("Qual Habitat Naturual? ");
            System.out.print("Com casco = CC / Carnívoros = C / Sem patas = S: ");
            CCS = scan.nextLine();

            if (CCS.equals("CC")) {
                System.out.println();
                System.out.println("Ele é a Tartaruga");
            }
            else if (CCS.equals("C")) {
                System.out.println();
                System.out.println("Ele é o Crocodilo");
            }
            else if (CCS.equals("S")) {
                System.out.println();
                System.out.println("Ele é a Cobra");
            }
        }

        scan.close();
    }
}
