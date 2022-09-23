package ch21.generic_wildcard.exam;

public class WildcardGeneric<W> {
    W wildcard;
    public void setWildcard(W wildcard){
        this.wildcard = wildcard;
    }
    public W getWildcard(){
        return wildcard;
    }
}
