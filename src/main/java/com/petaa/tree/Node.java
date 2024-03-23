package com.petaa.tree;

public class Node<T> {
    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;

    /**
     * Конструктор
     * @param data данные в узле
     * @param leftChild ссылка на левое поддерево
     * @param rightChild ссылка на правое поддерево
     */
    public Node(T data, Node<T> leftChild, Node<T> rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }
}