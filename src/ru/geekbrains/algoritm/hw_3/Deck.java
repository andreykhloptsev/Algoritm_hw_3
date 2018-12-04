package ru.geekbrains.algoritm.hw_3;


public class Deck<Item> {
    private int size=0;
    private Object[] array = new Object[2];
    private int last=0;


    public Deck() {
    }

    public int getSize() {
        return size;
    }

    private boolean isEmpty(){
        return size==0;
    }

    private void resize(int capacity){
        Object[] temp = new Object[capacity];
        System.arraycopy(array,0,temp,0,size);
        array=temp;
    }

    public void addRight(Item item){
        if (array.length<size+1) {
            resize(array.length*2);
        }
        size++;
        array[last]=(Object)item;
        last++;
    }

    public void addLeft(Item item){
        if (array.length<size+1) {
            resize(array.length*2);
        }
        size++;
        for (int i = last-1; i >=0 ; i--) {
            array[i+1]=array[i];
        }
        array[0]=(Object)item;
        last++;
    }

    public Item deleteRight() throws NoSuchFieldException {
        if (isEmpty()){
            throw new NoSuchFieldException();
        }
        Item item = (Item)array[last-1];
        array[last-1]=null;
        last--;
        size--;
        if (size>0&&size<array.length/4)
        {
            resize(array.length/2);
        }
        return item;
    }

    public Item deleteLeft() throws NoSuchFieldException {
        if (isEmpty()){
            throw new NoSuchFieldException();
        }
        Item item = (Item)array[0];
        for (int i = 1; i <last ; i++) {
            array[i-1]=array[i];
        }
        last--;
        array[last]=null;
        size--;
        if (size>0&&size<array.length/4)
        {
            resize(array.length/2);
        }
        return item;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder= new StringBuilder(size*2);
        for (int i = 0; i <size ; i++) {
            stringBuilder.append(array[i]+" ");
        }
        return stringBuilder.toString();
    }
}
