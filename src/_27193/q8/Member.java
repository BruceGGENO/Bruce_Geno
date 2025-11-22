package _27193.q8;
public class Member extends Book {
    private String memberName;
    private int memberId;
    private String contactNumber;

    public Member(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber) throws LibExceptions {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN);
        if (memberId <= 0) throw new LibExceptions("Member ID must be > 0 27197");
        this.memberName = memberName;
        this.memberId = memberId;
        this.contactNumber = contactNumber;
    }
}