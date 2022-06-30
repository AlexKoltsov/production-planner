package com.kotlsov.production.planner.common.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity<ID extends Serializable> implements Serializable {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    protected ID id;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    protected LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    protected LocalDateTime updatedAt;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "("
            + "id = " + this.id + ", "
            + "createdAt = " + this.createdAt + ", "
            + "updatedAt = " + this.updatedAt + ")";
    }
}
