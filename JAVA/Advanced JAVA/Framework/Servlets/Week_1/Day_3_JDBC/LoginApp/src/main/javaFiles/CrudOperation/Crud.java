package javaFiles.CrudOperation;

import javaFiles.Employee;

public interface Crud {
    public abstract void create(Employee employee);
    public abstract void read(Employee employee);
    public abstract void update(Employee employee);
    public abstract void delete(Employee employee);
}
