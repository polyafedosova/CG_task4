package ru.vsu.fedosova_p_o.draw;

public interface IFilter<T> {

    boolean accept(T value);
}
