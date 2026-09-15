//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Book1
        System.out.println("------------ Book Details ------------");
        Book b1=new Book("Ramayana","Valmiki","1234",1);
        b1.bookDetails();

        //Member1
        System.out.println("------------ Member Details ------------");
        Member m1=new Member(1,"Ram");
        m1.memberDetails();

        //Issue b1 to m1
        System.out.println("------------ Issue b1 to m1 ------------");
        b1.issueBooks(m1);

        //After issue a book
        System.out.println("------------ Book Details After Issued ------------");
        b1.bookDetails();

        //Member1
        System.out.println("------------ Member Details After Issued ------------");
        m1.memberDetails();


        System.out.println("------------ Return b1 to library ------------");
        b1.returnBooks(m1);

        //After issue a book
        System.out.println("------------ Book Details After Returned ------------");
        b1.bookDetails();

        //Member1
        System.out.println("------------ Member Details After Returned ------------");
        m1.memberDetails();

//        //book2
        Book b2=new Book("Arabian Nights","Mai","1214",1);
        b2.issueBooks(m1);

        b2.bookDetails();
        m1.memberDetails();
    }
}