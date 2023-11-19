package Casestudies.Parkinglot.Models;

import java.time.ZonedDateTime;

public class BaseModel {
    private Long ID;
    private ZonedDateTime created_At;
    private ZonedDateTime updated_At;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public ZonedDateTime getCreated_At() {
        return created_At;
    }

    public void setCreated_At(ZonedDateTime created_At) {
        this.created_At = created_At;
    }

    public ZonedDateTime getUpdated_At() {
        return updated_At;
    }

    public void setUpdated_At(ZonedDateTime updated_At) {
        this.updated_At = updated_At;
    }
}
