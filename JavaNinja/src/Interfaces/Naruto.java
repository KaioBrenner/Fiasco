package Interfaces;

public class Naruto implements Ninja {
    @Override
    public void usarJutsu() {
        System.out.println("Naruto usa o Rasengan!");
    }

    @Override
    public void seMover() {
        System.out.println("Naruto se move rapidamente com o Shunshin no Jutsu!");
    }
}