public class CalculadoraMedia {

  public Resultado calcular(Aluno aluno) {
    double media = ((aluno.getNota1() * 1 + aluno.getNota2() * 2 + aluno.getNota3() * 3)) / 6;

    String situacao = "";
    if (aluno.getFaltas() > 30)
      situacao = "Reprovado por Falta";
    else if (media >= 8)
      situacao = "Aprovado com sucesso";
    else if (media >= 6)
      situacao = "Aprovado";
    else if (media >= 3)
      situacao = "Recuperação";
    else if (media > 0)
      situacao = "Reprovado";
    else 
      situacao = "Desistente";

    
    Resultado r = new Resultado();
    r.setMedia(media);
    r.setSituacao(situacao);

    return r;
  }
}