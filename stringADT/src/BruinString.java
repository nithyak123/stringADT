public class BruinString {
    private char[] data;
    private int length;

    // overloaded constructors
    public BruinString(){
        this.data = new char[0];
        this.length = 0;
    }
    public BruinString(char[] data){
        this.data = data;
        this.length = data.length;
    }
    public BruinString(String data){
        this.data = data.toCharArray();
        this.length = data.length();
    }

    // length method
    public int length(){
        return length;
    }

    // overloaded insert method
    public void insert(int index, char ch){
        char[] newData = new char[length + 1];
        for (int i = 0; i < index; i++){
            newData[i] = data[i]; }
        newData[index] = ch;
        for (int i = index + 1; i < length + 1; i++){
            newData[i] = data[i-1];
        }
        length++;
        data = newData;
    }
    // TODO 1: FIX THIS
    public void insert(int index, char[] data){
        for (int i = 0; i < data.length; i++){
            insert(index + 1, data[i]);
        }
    }
    // TODO 2: TEST THIS
    public void insert(int index, String data){
        insert(index, data.toCharArray());
    }

    // to string override
    public String toString(){
        return new String(data);
    }
}