package com.example.bobbysandroidstartersolution

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class PokemonListFragment : Fragment() {

    interface OnPokemonSelectedListener {
        fun onPokemonSelected(pokemon: Pokemon)
    }

    private var listener: OnPokemonSelectedListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_pokemon_list, container, false)
        val listView: ListView = view.findViewById(R.id.pokemonListView)
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, PokemonData.samplePokemons.map { it.name })
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            listener?.onPokemonSelected(PokemonData.samplePokemons[position])
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnPokemonSelectedListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnPokemonSelectedListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}
