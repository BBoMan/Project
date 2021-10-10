package chap05;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

abstract class PairMap {
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap {

    public Dictionary(int block) {
        keyArray = new String[block];
        valueArray = new String[block];
    }

    @Override
    public String get(String key) {
        int count=0;
        int i=0;
        for(i=0; i<keyArray.length; i++) {
            if(keyArray[i].equals(key)) {
                break;
            }
            else
                count++;
        }
        if(count == keyArray.length)
            return null;
        else
            return valueArray[i];
    }
    @Override
    public void put(String key, String value) {
        for(int i=0; i<keyArray.length; i++) {
            if(keyArray[i] == null){
                keyArray[i] = key;
                valueArray[i] = value;
                break;
            }
            if(keyArray[i].equals(key)){
                valueArray[i] = value;
                break;
            }

        }
    }
    @Override
    public String delete(String key) {
        int i=0;
        String value=null;
        for(i=0; i<keyArray.length; i++) {
            if(keyArray[i].equals(key)) {
                value = valueArray[i];
                valueArray[i] = null;
                break;
            }
        }
        return value;
    }
    @Override
    public int length() {
        int i;
        for(i=0; i<keyArray.length; i++){
            if(keyArray[i] == null)
                break;
        }
        return i;
    }

}
public class Prac5_10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
