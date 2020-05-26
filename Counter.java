package com.company;

import java.util.stream.IntStream;

public class Counter extends Thread
{
    private final int min;

    Counter(int minimo,String nome)
    {
        super(nome);
        setName(nome);
        min = minimo;
    }

    //Metodo di run(), si occupa dell' esecuzione dei thread
    @Override
    public void run()
    {
        IntStream.rangeClosed(min, (min + 10)).forEach(i -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                //TryCatch vuoto per far funzionare lo sleep
            }
            System.out.println(Thread.currentThread().getName() + i);
        });
    }
}
