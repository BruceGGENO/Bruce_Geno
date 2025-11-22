package _27193.q10;

public class Category extends Entity {
    private String categoryName;
    private String categoryCode; // must be >=3 chars

    public Category(int id, String categoryName, String categoryCode) {
        super(id);
        setCategoryName(categoryName);
        setCategoryCode(categoryCode);
    }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) {
        if (categoryName == null || categoryName.trim().isEmpty()) throw new IllegalArgumentException("categoryName cannot be empty (27193)");
        this.categoryName = categoryName.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public String getCategoryCode() { return categoryCode; }
    public void setCategoryCode(String categoryCode) {
        if (categoryCode == null || categoryCode.trim().length() < 3) throw new IllegalArgumentException("categoryCode must be at least 3 characters (27193)");
        this.categoryCode = categoryCode.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

   
    public String toString() {
        return "Category {" +"id=" + id +", categoryName='" + categoryName + '\'' +  ", categoryCode='" + categoryCode + '\'' +'}';
    }
}