package _27193.q1;

import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;


    
    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) {
        if (id <= 0) System.out.println("ID must be > 0 (27193)");
        if (createdDate == null || updatedDate == null) System.out.println("Dates cannot be null (27193)");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }
}