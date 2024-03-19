package dataStructures;

import java.util.LinkedList;

public class directChaining {
    LinkedList<String>[] hashtable;
    int max_size_of_chain=5;

    @SuppressWarnings("unchecked")
    public directChaining(int size){
        hashtable=new LinkedList[size];
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

    public void insert(String word){
        int new_index=modASCIIHashFunction(word, hashtable.length);
        if(hashtable[new_index]==null){
            hashtable[new_index]=new LinkedList<String>();
            hashtable[new_index].add(word);
        }
        else{
            hashtable[new_index].add(word);
        }
    }

    public void display(){
        if(hashtable==null){
            System.out.println("Hashtable doesnot exist");
        }
        else{
            System.out.println("Hashtable");
            for(int index=0;index<hashtable.length;index++){
                System.out.println("Index "+index+", Key:"+hashtable[index]);
            }
        }
    }

    public boolean search(String word){
        int new_index=modASCIIHashFunction(word, hashtable.length);
        if(hashtable[new_index]!=null && hashtable[new_index].contains(word)){
            System.out.println("Word is at index :"+new_index);
            return true;
        }
        else{
            System.out.println("Word not found");
            return false;
        }
    }

    public void delete(String word){
        int new_index=modASCIIHashFunction(word, hashtable.length);
        boolean result=search(word); 
        if(result){
            hashtable[new_index].remove(word);
            System.out.println("Word is deleted");
        }
    }
}
