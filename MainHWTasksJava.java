package HW;

public class MainHWTasksJava {
    public static void main(String[] args) {
        /*Second level: C ������� ��������� if �������� �����,
         ����������� ����� ����� n � ��������� �� ����� �������
         �������� �� ��� ������������� , ������������� ��� �����.*/
        System.out.println(sum(2, 2));
        System.out.println(sum(3, 2));
    }

    public static int sum(int a, int b){
        int summ = a + b;

        if (a==b){
            summ = summ *2;
        }
        return summ;
    }
}