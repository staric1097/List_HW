package Task;
// №6
// Тест двусвязаного цикличного списка, который сожержит в качестве данных строки, которые заносятся в него в упорядоченном по длинне и алфавиту порядке
public class Main {
    public static void main(String[] args) {
        MyList2Linked list1=new MyList2Linked();
        list1.add_OrderBy_len_al("wccw");
        list1.add_OrderBy_len_al("eevewwdds");
        list1.add_OrderBy_len_al("a3e3");
        list1.add_OrderBy_len_al("b22111300");
        list1.add_OrderBy_len_al("cccw");
        list1.add_OrderBy_len_al("cccw335g");
        list1.add_OrderBy_len_al("dccw");

        System.out.println(list1.toString());


    }
}
