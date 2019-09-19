package pl.baroman.entity;

import javax.persistence.*;

@Entity(name = "test_entity")
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int testValue;

    public TestEntity() {
    }

    public TestEntity(int testValue) {
        this.testValue = testValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTestValue() {
        return testValue;
    }

    public void setTestValue(int testValue) {
        this.testValue = testValue;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "id=" + id +
                ", testValue=" + testValue +
                '}';
    }
}
