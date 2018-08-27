package com.aman.designPatterns;

public class BuilderPattern {

    private long accountNumber;
    private String owner;

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    private BuilderPattern(BuilderPatternBuilder builder){
        this.accountNumber = builder.accountNumber;
        this.owner = builder.owner;
    }

    public static class BuilderPatternBuilder{
        private long accountNumber;
        private String owner;

        public BuilderPatternBuilder(long accountNumber){
            this.accountNumber = accountNumber;
        }

        public BuilderPatternBuilder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public BuilderPattern build (){
            return new BuilderPattern(this);
        }
    }

    public static void main(String args[]){
        BuilderPattern builder = new BuilderPattern.BuilderPatternBuilder(100L).
                setOwner("Amandeep").build();

        System.out.println("Values are : "+builder.getAccountNumber() +
                " and owner is: "+ builder.getOwner());
    }
}
