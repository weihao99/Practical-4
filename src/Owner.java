public class Owner {
    private String name;
    private String icNo;
    
    public Owner(String name, String icNo){
        this.name = name;
        this.icNo = icNo;
    }
    
    public String toString(){
        return String.format("%-13s %-14s",this.name, this.icNo);
    }
}
