package ungar.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_login.*
import ungar.navigationcomponent.model.User

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //implicit deep links, in this example going to web and typing
        //'example.com/links/{some_username}, the phone will ask you
        //which app to use, and using this one it will open the login
        //fragment with username filled with the one you put into the link.
        //Update: removed deep link

        /*
        val usernameDeepLink = args.username
        edit_text_username.setText(usernameDeepLink)
        */

        btnConfirm.setOnClickListener {
            //https://youtu.be/i3nRZEbkWks?t=367
            val firstname = edit_text_firstname.text.toString()
            val username = edit_text_username.text.toString()
            val password = edit_text_password.text.toString()

            val user = User(firstname, username, password)

            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(user)
            findNavController().navigate(action)
        }
    }
}