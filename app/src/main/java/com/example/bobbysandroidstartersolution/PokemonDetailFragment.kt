package com.example.bobbysandroidstartersolution

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class PokemonDetailFragment : Fragment() {

    companion object {
        const val ARG_POKEMON = "pokemon"

        fun newInstance(pokemon: Pokemon): PokemonDetailFragment {
            val args = Bundle()
            args.putSerializable(ARG_POKEMON, pokemon)
            val fragment = PokemonDetailFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_pokemon_detail, container, false)
        val pokemon: Pokemon? = arguments?.getSerializable(ARG_POKEMON) as Pokemon?
        view.findViewById<TextView>(R.id.pokemonNameTextView).text = pokemon?.name
        view.findViewById<TextView>(R.id.pokemonNameIDView).text = pokemon?.id.toString()
        // Populate other views with Pokémon details
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        (activity as? AppCompatActivity)?.supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
