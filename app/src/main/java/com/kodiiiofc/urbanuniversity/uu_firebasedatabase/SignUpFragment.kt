package com.kodiiiofc.urbanuniversity.uu_firebasedatabase

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.kodiiiofc.urbanuniversity.uu_firebasedatabase.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        auth = Firebase.auth
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.signUpBtn.setOnClickListener {
            signUpUser()
        }
        binding.alredyHasAccountTv.setOnClickListener {
            toLoginFragment()
        }

    }

    private fun toLoginFragment() {
        findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)
    }

    private fun signUpUser() {
        val email = binding.emailEt.text.toString().trim()
        val pass = binding.passwordEt.text.toString()
        val confirmPass = binding.confirmPasswordEt.text.toString()

        if (email.isBlank() || pass.isBlank() || confirmPass.isBlank()) {
            Toast.makeText(requireContext(), "Email и пароль не могут быть пустыми.", Toast.LENGTH_LONG).show()
            return
        }

        if (pass != confirmPass) {
            Toast.makeText(requireContext(), "Пароли не совпадают", Toast.LENGTH_LONG).show()
            return
        }

        auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(requireActivity()) {
            if (it.isSuccessful) {
                Toast.makeText(requireContext(), "Пользователь зарегистрирован успешно", Toast.LENGTH_LONG).show()
                findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)
            } else {
                if (auth.currentUser != null) {
                    Toast.makeText(requireContext(), "Пользователь уже существует", Toast.LENGTH_LONG).show()
                    findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)
                }
                Toast.makeText(requireContext(), "Регистрация не прошла", Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}