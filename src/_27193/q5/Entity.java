package _27193.q5;


import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws VehDataException {
        if (id <= 0) throw new VehDataException("ID should be greater than 0 (27193)");
        if (createdDate == null || updatedDate == null) throw new VehDataException("Dates cannot be empty (27193)");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public LocalDate getCreatedDate() { return createdDate; }
    public LocalDate getUpdatedDate() { return updatedDate; }
}