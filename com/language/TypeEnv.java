package com.language;// TypeEnv.java
// Type environment for S
import java.util.*;

// <id, type> 
class Entry {
   Identifier id;
   Type type;
   
   Entry (Identifier id, Type t) {
     this.id = id;
     this.type = t;
   }
}

public class TypeEnv extends Stack<Entry> {
    public TypeEnv() { }
    
    public TypeEnv(Identifier id, Type t) {
        push(id, t);
    }
    
    public TypeEnv push(Identifier id, Type t) {
        super.push(new Entry(id, t));
	return this;
    }
    
    
    // (1) Contatins Function Implementation
    public boolean contains (Identifier v) {
       // Contains Implementation
        for(int i=0; i<size(); i++){
            if(this.get(i).id.equals(v)){
                return true;
            }
        }
        return false;
    }

    // (2) Get Function Implementation
    public Type get (Identifier v) {
        // Get Implementation
        for(int i=0; i<size(); i++){
            if(this.get(i).id.equals(v)){
                return this.get(i).type;
            }
        }
        return null;
    }

}