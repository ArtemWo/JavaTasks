package TasksJava;

public class MainTaskHW23_09_22 {
    public static void main(String[] args) {
       /* Second level: ���� ���� ������ �� ������ � ������� ���� ������� �����.
        ����� ���� ����� ������� ������� ������.  � ���� �������� ���� ����� �������
        ������ � ��� ��� ���� ���� ��� ��� ����� 20 �����. �������� �����, ������������
        true ���� � ���� ��������.��� hour - ����� � ����� � ��������� �� 0 �� 23*/

        System.out.println(vasiaInTrouble (true, 6));
        System.out.println(vasiaInTrouble (true, 21));

    }
    public static boolean vasiaInTrouble (boolean singing, int hour){

        return singing && hour <7 || hour >20;
    }
}
