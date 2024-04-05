
package exercici4;

public class Exercici4 {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1.0,2.0);
    ComplexNumber c2 = new ComplexNumber(2.0,-3.0);

    ComplexNumber zero = ComplexNumber.ZERO;

    System.out.println("Hem creat el Nombre Complex  c1:");
    System.out.println("\t Part real = " + c1.getReal());
    System.out.println("\t Part imaginària = " + c1.getImaginary());

    System.out.println("\nHem creat el Nombre Complex c2:");
    System.out.println("\t Part real = " + c2.getReal());
    System.out.println("\t Part imaginària = " + c2.getImaginary());



    System.out.println("\nOperació de suma (c1 + ZERO):");
    ComplexNumber c3 = c1.add(ZERO);
    System.out.println("\t Part real = " + c3.getReal());
    System.out.println("\t Part imaginària = " + c3.getImaginary());

    System.out.println("\nOperació de suma (c1 + c2):");
    c3 = c1.add(c2);
    System.out.println("\t Part real = " + c3.getReal());
    System.out.println("\t Part imaginària = " + c3.getImaginary());

    System.out.println("\nDarrera suma duta a terme: ");
    System.out.print("(" + c1 + ") + (" + c2 + ") = (" + c3 + ")");

    }
    
}
