import javax.swing.*;
import java.util.ArrayList;

// Projeto para cadastrar alunos utilizando Arrays sem tamanho padrão definido
public class Main {
    public static void main(String[] args) {
        int numeroCadastro;
        numeroCadastro = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos alunos deseja cadastrar?"));

        ArrayList<String> nome = new ArrayList<>();
        ArrayList<String> universidade = new ArrayList<>();
        ArrayList<String> cursos = new ArrayList<>();
        ArrayList<Double> nota1 = new ArrayList<>();
        ArrayList<Double>nota2 = new ArrayList<>();
        ArrayList<Double> media = new ArrayList<>();

        for (int i = 0; i < numeroCadastro; i++){
            nome.add(JOptionPane.showInputDialog(null, "Digite o nome do aluno: "));
            universidade.add(JOptionPane.showInputDialog(null, "Digite a universidade do aluno: "));
            cursos.add(JOptionPane.showInputDialog(null, "Digite o curso: "));
            nota1.add(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 1: ")));
            nota2.add(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota 2: ")));
            media.add((nota1.get(i)+nota2.get(i))/2);
        }

        for(int i = 0; i < numeroCadastro; i++){
            System.out.println("Aluno: " + nome.get(i)
                    + "\nUniversidade: " + universidade.get(i)
                    + "\nCurso: " + cursos.get(i)
                    + "\nMédia: " + media.get(i));
            System.out.println("--------------------------------------------------------\n");
        }
        int  action = 0;

        while (action != 5){

            action = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual ação deseja realizar?\n1 - Ordenar alunos por media\n2 - Ordenar alunos por nome (A-Z)"));
            if(action == 1){

                for(int i = 0; i < numeroCadastro; i++){
                    for(int j = i+1; j < numeroCadastro; j++){
                        if(media.get(i) < media.get(j)){
                            nome.add(i, nome.get(j));
                            universidade.add(i, universidade.get(j));
                            cursos.add(i, cursos.get(j));
                            nota1.add(i, nota1.get(j));
                            nota2.add(i, nota2.get(j));
                            media.add(i, media.get(j));

                        }
                    }
                    System.out.println("Aluno: " + nome.get(i)
                            + "\nUniversidade: " + universidade.get(i)
                            + "\nCurso: " + cursos.get(i)
                            + "\nMédia: " + media.get(i));
                    System.out.println("--------------------------------------------------------\n");

                }
            } else if (action == 2) {
                for(int i = 0; i < numeroCadastro; i++){
                    for(int j = i+1; j < numeroCadastro; j++){
                        if(nome.get(i).compareTo(nome.get(j)) > 0){
                            nome.add(i, nome.get(j));
                            universidade.add(i, universidade.get(j));
                            cursos.add(i, cursos.get(j));
                            nota1.add(i, nota1.get(j));
                            nota2.add(i, nota2.get(j));
                            media.add(i, media.get(j));
                        }
                    }
                    System.out.println("Aluno: " + nome.get(i)
                            + "\nUniversidade: " + universidade.get(i)
                            + "\nCurso: " + cursos.get(i)
                            + "\nMédia: " + media.get(i));
                    System.out.println("--------------------------------------------------------\n");

                }

            }

        }



    }
}