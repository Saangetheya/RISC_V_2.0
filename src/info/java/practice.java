package info.java;

import java.util.HashMap;

public class practice {
    public static void main(String[] args) {
        Reg reg = new Reg();
        reg.name="dkkd";
        reg.code=0;
        has.x.put(reg,10);
        System.out.println(has.x.get(reg));
    }
}
class has{
    static HashMap<Reg,Integer>x = new HashMap<>();
}
class data{
    static Reg[] regs = new Reg[5];

}
class Reg{
    int code;
    String name;
}
class test2 {
    public static void main(String args[]){
        String s = "add  t1 t2 t3";
        String[] array = s.split(" ");
        String[] final_array = new String[4];
        int x=0;

        for(int i=0; i<array.length; i++){
            if(!array[i].equals("")){
                final_array[x] = array[i];
                System.out.println(final_array[x]);
                System.out.println("------");
                x++;
            }
        }
    }
}