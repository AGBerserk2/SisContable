package com.example.interfaces;

public interface  IInventario {
    public int totalProductos();
    public int totalDineroEnInventario();
    public int totalDineroEnInventarioPorCategoria(int IdCategoria);
    public int totalProductosPorCategoria(int IdCategoria);
}
