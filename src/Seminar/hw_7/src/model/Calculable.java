package model;

public interface Calculable<T> {
    T sum (T a, T b);
    T sub (T a, T b);
    T multy (T a, T b);
    T div (T a, T b);
}
