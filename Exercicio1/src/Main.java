import utils.DiaHora;

public class Main {

    public static void main(String[] args) {
        DiaHora horario1 = new DiaHora("Segunda", 7, 10);
        DiaHora horario2 = new DiaHora("Segunda", 9, 10);
        Disciplina matematica1 = new Disciplina("Matematica", 1, horario1);
        Disciplina matematica2 = new Disciplina("Matematica", 2, horario2);

        Professor p1 = new Professor("Vagner", "12345678", "012345");
        Aluno a1 = new Aluno("Luis", "1123131", "sp23026922");

        p1.solicitarDisciplina(matematica1);
        a1.solicitarDisciplina(matematica1);
        p1.solicitarDisciplina(matematica2);
        a1.solicitarDisciplina(matematica2);

    }
}
