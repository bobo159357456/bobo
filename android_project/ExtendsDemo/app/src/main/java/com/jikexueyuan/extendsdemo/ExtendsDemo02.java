package com.jikexueyuan.extendsdemo;

/**
 * Created by zmzp on 14-12-4.
 */
class People{
      private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Worker extends People{
    public void tell(){
        System.out.println(getAge());
    }
}
//class PetWorker extends Worker{
//    public void tell(){
//        System.out.println(age);
//    }
//}
public class ExtendsDemo02 {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.setAge(100);
        w.tell();

    }
}
