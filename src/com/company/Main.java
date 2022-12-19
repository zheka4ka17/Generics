package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox();
        magicBox.setObject(1);
        System.out.println(magicBox.getObject());
        magicBox.setObject("2");
        System.out.println(magicBox.getObject());
        magicBox.setObject( new ArrayList<String>(Arrays.asList("hocus","pocus","spell")));
        System.out.println(magicBox.getObject());
 //опредляем класс
        Object object = magicBox.getObject();
        Class clazz = object.getClass();
        System.out.println(clazz);

        MagicBoxGeneric<Number> magicBoxGeneric= new MagicBoxGeneric<>();
        magicBoxGeneric.setObject(1);

        MagicBoxGeneric<MagicBoxGeneric<Number>> magicBoxMagicBoxGeneric1=new MagicBoxGeneric<>();
        magicBoxMagicBoxGeneric1.setObject(magicBoxGeneric);
        System.out.println(magicBoxMagicBoxGeneric1.getObject().getObject());
    }
}
class MagicBox{
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

class MagicBoxGeneric <T>{
    private T object;



    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}