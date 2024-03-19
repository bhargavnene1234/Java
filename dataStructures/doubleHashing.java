package dataStructures;

import java.util.ArrayList;

public class doubleHashing {
    String[] hashTable;
    int usedCellNumber;

    public doubleHashing(int size){
        hashTable=new String[size];
        usedCellNumber=0;
    }

    public int modASCIIHashFunction(String word,int numOfCells){
        char ch[];
        ch=word.toCharArray();
        int index,sum;
        for(sum=0,index=0;index<word.length();index++){
            sum+=ch[index];
        }
        return sum % numOfCells;
    }

    private int addAllTogether(int sum){
        int value=0;
        while(sum>0){
            value=sum%10;
            sum=sum/10;
        }
        return value;
    }

    public int secondHash(String word,int len_hashtable){
        char ch[];
        ch=word.toCharArray();
        int index,sum;
        for(sum=0,index=0;index<word.length();index++){
            sum+=ch[index];
        }
        while(sum>hashTable.length){
            sum=addAllTogether(sum);
        }
        return sum%len_hashtable;
    }

    public double getLoadFactor(){
        double loadFactor=usedCellNumber*1.0/hashTable.length;
        return loadFactor;
    }

    public void rehash(String word){
        usedCellNumber=0;
        ArrayList<String> temp=new ArrayList<String>();
        for(String item:hashTable){
            if(item!=null){
                temp.add(item);
            }
            temp.add(word);
            hashTable=new String[hashTable.length*2];
            for(String obj:temp){
                insert(obj);
            }
        }
    }

    public void insert(String word){
        double loadFactor=getLoadFactor();
        if(loadFactor>=0.75){
            rehash(word);
        }
        else{
            int varX=modASCIIHashFunction(word, hashTable.length);
            int varY=secondHash(word, hashTable.length);
            for(int i=0;i<hashTable.length;i++){
                int new_index=(varX+i*varY)%hashTable.length;
                if(hashTable[new_index]==null){
                    hashTable[new_index]=word;
                    System.out.println("Word inserted at location : "+new_index);
                    break;
                }
                else{
                    System.out.println("finding new location");
                }
            }
        }
        usedCellNumber++;
    }

    public boolean search(String word){
        int varX=modASCIIHashFunction(word, hashTable.length);
        int varY=secondHash(word, hashTable.length);
        for(int i=0;i<hashTable.length;i++){
            int new_index=(varX+i*varY)%hashTable.length;
            if(hashTable[new_index]!=null && hashTable[new_index].equals(word)){
                System.out.println("Word found at location : "+new_index);
                return true;
            }

        }
        System.out.println("Word not found");
        return false;
    }

    public void display(){
        if(hashTable==null){
            System.out.println("Hashtable doesnot exist");
        }
        else{
            System.out.println("Hashtable");
            for(int index=0;index<hashTable.length;index++){
                System.out.println("Index "+index+", Key:"+hashTable[index]);
            }
        }
    }

    public void delete(String word){
        int varX=modASCIIHashFunction(word, hashTable.length);
        int varY=secondHash(word, hashTable.length);
        for(int i=0;i<hashTable.length;i++){
            int new_index=(varX+i*varY)%hashTable.length;
            if(hashTable[new_index]!=null && hashTable[new_index].equals(word)){
                hashTable[new_index]=null;
                System.out.println("Word deleted from location : "+new_index);
            }
        }
        System.out.println("Word not found");
    }
}
