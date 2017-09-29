package com.example.users.myblog;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AuthenticationActivity extends AppCompatActivity {
      EditText username,password;
      ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);

        Button signInButton=(Button)findViewById(R.id.signInButton);
        signInButton.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                if(isFormValid()){
                    //perform login
                    performSignIn();
                }
            }
        });

        Button registerButton=(Button) findViewById(R.id.regiter_button);

            registerButton.setOnClickListener(new View.OnClickListener() {
                /**
                 * Called when a view has been clicked.
                 *
                 * @param v The view that was clicked.
                 */
                @Override
                public void onClick(View v) {
                    if (isFormValid()) {
                     // parent registration

                    }
                }
            });
            //initialising registration

    }
    private Boolean isFormValid(){
        if(username.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Username cannot be left empty", Toast.LENGTH_LONG).show();
            return false;
        }

        if(password.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Password cannot be left empty", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    private void performSignIn(){

    }

    private void performRegistration(){

    }

    class SignInTask extends AsyncTask<String, void, Boolean>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
        }

        /**
         * Override this method to perform a computation on a background thread. The
         * specified parameters are the parameters passed to {@link #execute}
         * by the caller of this task.
         * <p>
         * This method can call {@link #publishProgress} to publish updates
         * on the UI thread.
         *
         * @param params The parameters of the task.
         * @return A result, defined by the subclass of this task.
         * @see #onPreExecute()
         * @see #onPostExecute
         * @see #publishProgress
         */

        @Override
        protected Boolean doInBackground(String... params) {
            return null;
        }
    }



}
