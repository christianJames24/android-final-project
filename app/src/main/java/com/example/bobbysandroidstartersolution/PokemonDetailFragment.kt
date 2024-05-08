package com.example.bobbysandroidstartersolution

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

        view.findViewById<TextView>(R.id.pokemonNameIDView).text = "ID: " + pokemon?.id.toString()
        view.findViewById<TextView>(R.id.pokemonNameTextView).text = "Name: " + pokemon?.name
        view.findViewById<TextView>(R.id.pokemonClassificationTextView).text = "Classification: " + pokemon?.pokemonClassification
        view.findViewById<TextView>(R.id.pokemonDescriptionView).text = "Description: " + pokemon?.pokemonDescription
        view.findViewById<TextView>(R.id.eggGroupView).text = "Egg Group: " + pokemon?.eggGroup
        pokemon?.type?.let { setupTypesListView(view, it) }
        view.findViewById<TextView>(R.id.hiddenAbility).text = "Hidden Ability: " + pokemon?.hiddenAbility

        view.findViewById<Button>(R.id.levelUpAttacks).setOnClickListener {
            pokemon?.levelUpAttacks?.let { showMovesDialog(it, "Level-up Moves") }
        }
        view.findViewById<Button>(R.id.tmAttacks).setOnClickListener {
            pokemon?.tmAttacks?.let { showMovesDialog(it, "Technical Machine Moves") }
        }
        view.findViewById<Button>(R.id.eggAttacks).setOnClickListener {
            pokemon?.eggMoves?.let { showMovesDialog(it, "Egg Moves") }
        }
        view.findViewById<Button>(R.id.moveTutorAttacks).setOnClickListener {
            pokemon?.moveTutorAttacks?.let { showMovesDialog(it, "Move Tutor Moves") }
        }

        view.findViewById<TextView>(R.id.malePercentage).text = "Male Percentage: " + pokemon?.malePercentage.toString()
        view.findViewById<TextView>(R.id.femalePercentage).text = "Female Percentage: " + pokemon?.femalePercentage.toString()
        view.findViewById<TextView>(R.id.height).text = "Height: " + pokemon?.height.toString()
        view.findViewById<TextView>(R.id.weight).text = "Weight: " + pokemon?.weight.toString()
        view.findViewById<TextView>(R.id.baseHP).text = "Base Health: " + pokemon?.baseHP.toString()
        view.findViewById<TextView>(R.id.baseAttack).text = "Base Attack: " + pokemon?.baseAttack.toString()
        view.findViewById<TextView>(R.id.baseDefence).text = "Base Defence: " + pokemon?.baseDefence.toString()
        view.findViewById<TextView>(R.id.baseSAttack).text = "Base Special Attack: " + pokemon?.baseSAttack.toString()
        view.findViewById<TextView>(R.id.baseSDefence).text = "Base Special Defence: " + pokemon?.baseSDefence.toString()
        view.findViewById<TextView>(R.id.baseSpeed).text = "Base Speed: " + pokemon?.baseSpeed.toString()

        val imageView: ImageView = view.findViewById(R.id.pokemonImageView)
        pokemon?.imageUrl?.let { imageUrl ->
            val drawableName = imageUrl.substringAfterLast("/").substringBefore(".")
            val imageResId = context?.let { ctx ->
                ctx.resources.getIdentifier(drawableName, "drawable", ctx.packageName)
            } ?: 0

            if (imageResId != 0) {
                imageView.setImageResource(imageResId)
            } else {
                imageView.setImageResource(R.drawable.missing)
            }
        }

        view.findViewById<Button>(R.id.weaknessesButton).setOnClickListener {
            pokemon?.type?.let {
                val (weaknesses, resistances) = calculateTypeEffectiveness(it)
                showTypeEffectivenessDialog(weaknesses, resistances)
            }
        }

        view.findViewById<Button>(R.id.returnMenu).setOnClickListener {
            if (fragmentManager?.backStackEntryCount ?: 0 > 0) {
                fragmentManager?.popBackStack()
            } else {
                activity?.finish()
            }
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        (activity as? AppCompatActivity)?.supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupTypesListView(view: View, types: List<String>) {
        val typesListView: ListView = view.findViewById(R.id.typeView)
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, types)
        typesListView.adapter = adapter
    }

    private fun showMovesDialog(moves: List<String>, title: String) {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle(title)
            .setItems(moves.toTypedArray()) { _, which ->
                Toast.makeText(requireContext(), "Selected: ${moves[which]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Close") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun calculateTypeEffectiveness(types: List<String>): Pair<List<String>, List<String>> {
        val weaknessesMap = mapOf(
            "Normal" to listOf("Fighting"),
            "Fire" to listOf("Water", "Ground", "Rock"),
            "Water" to listOf("Electric", "Grass"),
            "Electric" to listOf("Ground"),
            "Grass" to listOf("Fire", "Ice", "Poison", "Flying", "Bug"),
            "Ice" to listOf("Fire", "Fighting", "Rock", "Steel"),
            "Fighting" to listOf("Flying", "Psychic", "Fairy"),
            "Poison" to listOf("Ground", "Psychic"),
            "Ground" to listOf("Water", "Grass", "Ice"),
            "Flying" to listOf("Electric", "Ice", "Rock"),
            "Psychic" to listOf("Bug", "Ghost", "Dark"),
            "Bug" to listOf("Fire", "Flying", "Rock"),
            "Rock" to listOf("Water", "Grass", "Fighting", "Ground", "Steel"),
            "Ghost" to listOf("Ghost", "Dark"),
            "Dragon" to listOf("Ice", "Dragon", "Fairy"),
            "Dark" to listOf("Fighting", "Bug", "Fairy"),
            "Steel" to listOf("Fire", "Fighting", "Ground"),
            "Fairy" to listOf("Poison", "Steel")
        )

        val resistancesMap = mapOf(
            "Normal" to listOf(),
            "Fire" to listOf("Fire", "Grass", "Ice", "Bug", "Steel", "Fairy"),
            "Water" to listOf("Fire", "Water", "Ice", "Steel"),
            "Electric" to listOf("Electric", "Flying", "Steel"),
            "Grass" to listOf("Water", "Electric", "Grass", "Ground"),
            "Ice" to listOf(),
            "Fighting" to listOf("Bug", "Rock", "Dark"),
            "Poison" to listOf("Grass", "Fighting", "Poison", "Bug", "Fairy"),
            "Ground" to listOf("Poison", "Rock"),
            "Flying" to listOf("Grass", "Fighting", "Bug"),
            "Psychic" to listOf("Fighting", "Psychic"),
            "Bug" to listOf("Grass", "Fighting", "Ground"),
            "Rock" to listOf("Normal", "Fire", "Poison", "Flying"),
            "Ghost" to listOf("Poison", "Bug"),
            "Dragon" to listOf("Fire", "Water", "Electric", "Grass"),
            "Dark" to listOf("Ghost", "Dark"),
            "Steel" to listOf("Normal", "Grass", "Ice", "Flying", "Psychic", "Bug", "Rock", "Dragon", "Steel", "Fairy"),
            "Fairy" to listOf("Fighting", "Bug", "Dark")
        )

        val weaknesses = mutableSetOf<String>()
        val resistances = mutableSetOf<String>()

        types.forEach { type ->
            weaknessesMap[type]?.let {
                weaknesses.addAll(it)
            }
            resistancesMap[type]?.let {
                resistances.addAll(it)
            }
        }

        // Remove any resistances that are also listed as weaknesses due to dual typing neutralization
        val finalWeaknesses = weaknesses.filterNot { resistances.contains(it) }.distinct()
        val finalResistances = resistances.filterNot { weaknesses.contains(it) }.distinct()

        return Pair(finalWeaknesses, finalResistances)
    }


    private fun showTypeEffectivenessDialog(weaknesses: List<String>, resistances: List<String>) {
        val message = "Weaknesses: ${weaknesses.joinToString(", ")}\nResistances: ${resistances.joinToString(", ")}"
        AlertDialog.Builder(requireContext())
            .setTitle("Type Effectiveness")
            .setMessage(message)
            .setPositiveButton("Close") { dialog, _ -> dialog.dismiss() }
            .show()
    }
}
