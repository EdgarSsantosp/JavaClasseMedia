public class Aluno {
  private String nome;
  private double nota1;
  private double nota2;
  private double nota3;
  private int faltas;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNota1(double nota1) {
    this.nota1 = nota1;
  }

  public double getNota1() {
    return this.nota1;
  }

  public void setNota2(double nota2) {
    this.nota2 = nota2;
  }

  public double getNota2() {
    return this.nota2;
  }

  public void setNota3(double nota3) {
    this.nota3 = nota3;
  }

  public double getNota3() {
    return this.nota3;
  }

  public void setFaltas(int faltas) {
    this.faltas = faltas;
  }

  public int getFaltas() {
    return this.faltas;
  }
  
}