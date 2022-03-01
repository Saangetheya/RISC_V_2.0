package info.java;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("newtext.txt");
        int data = fileReader.read();
        while (data != -1) {
            //System.out.print((char)data);
            data = fileReader.read();
        }

    }
}
class regDet{
    static Registers[] registers = new Registers[32];
    regDet(){
        registers[0].name="r0";
        registers[0].number=0;
        registers[1].name="at";
        registers[1].number=1;
        registers[2].name="v0";
        registers[2].number=2;
        registers[3].name="v1";
        registers[3].number=3;
        registers[4].name="a0";
        registers[4].number=4;
        registers[5].name="a1";
        registers[5].number=5;
    }
}

class Registers{
    String name;
    int number;
}

class Memory{

}

class Instructions{
    void add(){}
}
class MyHashmap {
    static HashMap<Registers,Integer> hashMap = new HashMap<>();
}
