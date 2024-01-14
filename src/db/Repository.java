package db;

public interface Repository <T>{
    void create(T t);
    void read(T t);
    void update(T t);
    void delete(T t);

}
