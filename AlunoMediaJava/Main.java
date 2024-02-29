
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("## PROGRAMA DA MEDIA  ##");

    System.out.println("Informe seu nome:");
    String nome = ler.next();

    System.out.println("Informe a nota 1:");
    double n1 = ler.nextDouble();

    System.out.println("Informe a nota 2:");
    double n2 = ler.nextDouble();

    System.out.println("Informe a nota 3:");
    double n3 = ler.nextDouble();

    System.out.println("Informe a qtd de faltas:");
    int faltas = ler.nextInt();


    Aluno aluno = new Aluno();
    aluno.setNome(nome);
    aluno.setNota1(n1);
    aluno.setNota2(n2);
    aluno.setNota3(n3);
    aluno.setFaltas(faltas);


    CalculadoraMedia calc = new CalculadoraMedia();
    Resultado r = calc.calcular(aluno);

    System.out.println("A média é " + r.getMedia());
    System.out.println("Situação: " + r.getSituacao());

    
  }
}