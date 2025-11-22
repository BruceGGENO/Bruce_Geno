package _27193.q3;


import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws PayrollDataException {
        if (id <= 0) throw new PayrollDataException("ID > 0 27193");
        if (createdDate == null || updatedDate == null) throw new PayrollDataException("Date must not be null 27193");

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