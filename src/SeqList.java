/**
 * @ClassName: SeqList
 * @Author: 邹双双
 * Date: 2020/6/8 9:45
 * @Description:
 */
public class  SeqList <E>{
    private E[] data = (E[])new Object[100];
    private int size;

    public void add(E elem){
        data[size] =(E) elem;
        size++;
    }
    public E get(int index){
        return data[index];
    }
    public static void main(String[] args) {
       /* SeqList <String > seqList = new SeqList<>();
        seqList.add("aaa");
        seqList.add("bbb");

        String s =(String) seqList.get(0);
        System.out.println(s);
        SeqList <Animal> animal = new SeqList<>();
        animal.add(new Animal());
        animal.add(new Animal());*/
        SeqList<Integer> seqList1 = new SeqList<>();
        //装箱操作，把普通类型（int）转化为包装类
        //Integer num = new Integer(10);
        //自动装箱
        Integer num = 10;
        seqList1.add(num);
        //拆箱操作，把Integer转化为Int称作拆箱
        int value = num.intValue();
        int value2 = num;//自动拆箱


    }
}
