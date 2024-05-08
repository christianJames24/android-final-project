package com.example.bobbysandroidstartersolution

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.fragment.app.Fragment

class PokemonListFragment : Fragment() {

    interface OnPokemonSelectedListener {
        fun onPokemonSelected(pokemon: Pokemon)
    }

    private var listener: OnPokemonSelectedListener? = null
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_pokemon_list, container, false)
        val listView: ListView = view.findViewById(R.id.pokemonListView)
        val searchEditText: EditText = view.findViewById(R.id.searchEditText)

        adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, PokemonData.samplePokemons.map { "${it.id} - ${it.name}" })
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = adapter.getItem(position)  // Get the actual item displayed in the filtered list
            val selectedPokemon = PokemonData.samplePokemons.find { it.name == selectedItem?.split(" - ")?.get(1) } // Extract the name and find the matching Pokemon
            selectedPokemon?.let {
                listener?.onPokemonSelected(it)
            }
        }


        // Set up the search functionality
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                adapter.filter.filter(s)
            }
            override fun afterTextChanged(s: Editable?) {}
        })

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
