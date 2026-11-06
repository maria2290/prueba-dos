package com.pena.pruebados.dao;

import com.pena.pruebados.model.CartaPokemon;

import java.util.List;

public interface CartaDao {

    List<CartaPokemon> leerCartasPokemon();

    List<CartaEnergia> leerCartasEnergia();

    void guardarCartasPokemon(List<CartaPokemon> cartas);

    void guardarCartasEnergia(List<CartaEnergia> cartas);
}


