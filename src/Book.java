public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;
    private int quantity;

    Book(String title,String author,String ISBN,int quantity){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.isAvailable=quantity>0;
        this.quantity=quantity;
    }


    public void issueBooks(Member m1){
        if(this.isAvailable){
            if(m1.getIssuedBook()==null){
                this.quantity--;
                this.isAvailable=this.quantity>0;
                m1.setIssuedBook(this.title);
                System.out.println(this.title+" has issued to the "+m1.getMemberName());
            }else{
                System.out.println("You have already Issued one Book please return that book before issue another one");
            }

        }else{
            System.out.println(this.title +" is not available");
        }
    }


    public void returnBooks(Member m1){
       if(m1.getIssuedBook().equals(this.title)){
           this.quantity++;
           this.isAvailable=this.quantity>0;
            m1.setIssuedBook(null);
           System.out.println(this.title + " has been returned from "+m1.getMemberName());
       }else{
           System.out.println("You don't have borrowed this book");
       }
    }

    public void bookDetails(){
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+this.author);
        System.out.println("ISBN : "+this.ISBN);
        System.out.println("isAvailable : "+this.isAvailable);
        System.out.println("Quantity : "+this.quantity);
    }


}
