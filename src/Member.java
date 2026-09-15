public class Member {
    private int memberId;
    private String name;
    private String issuedBook;

    Member(int memberId,String name){
        this.memberId=memberId;
        this.name=name;
    }

    public void setIssuedBook(String title){
        this.issuedBook=title;
    }


    public String getMemberName(){
       return this.name;
    }

    public String getIssuedBook(){
        return this.issuedBook;
    }

    public void memberDetails(){
        System.out.println("Member Id : "+this.memberId);
        System.out.println("Member Name : "+this.name);
        System.out.println("Issued Book : "+this.issuedBook);
    }
}
