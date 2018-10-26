public class ArrayList implements List {

    private Object[] arr;
    int size;

    public ArrayList(){
        this.arr = new Object[10];
        this.size = 0;
    }

    public void growArray(){
        Object [] newArr = new Object[arr.length * 2];

        for(int i= 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void add(Object obj){
        if(size == arr.length){
            growArray();
        }
        arr[size++] = obj;
    }
    public void add(int pos, Object obj){
        if(pos > size || pos < 0){
            throw new IllegalArgumentException("Error");
        }
        if(size == arr.length){
            growArray();
        }
        for(int i = size; i > pos; i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = obj;
        size++;
    }

    public Object get(int pos){
        if(pos > size || pos < 0){
            throw new IllegalArgumentException("Error");
        }
        return arr[pos];
    }
    public Object remove(int pos){
        if(pos > size || pos < 0){
            throw new IllegalArgumentException("Error");
        }
        Object temp = arr[pos];
        for(int i = pos; i < size -1; i++){
            arr[i] = arr[i+1];
        }
        --size;
        return temp;
    }

    public int size(){
        return size;
    }
}
