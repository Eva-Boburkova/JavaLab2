package com.petaa.tree;

public class Tree<T> extends Node<T> {
    /**
     * Конструктор
     *
     * @param data       данные в узле
     * @param leftChild  ссылка на левое поддерево
     * @param rightChild ссылка на правое поддерево
     */
    public Tree(T data, Node<T> leftChild, Node<T> rightChild) {
        super(data, leftChild, rightChild);
    }
}
