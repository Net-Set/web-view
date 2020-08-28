package com.example.web_view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Signup extends AppCompatActivity {
    EditText emailId,password;
    Button btnSignup;
    TextView tvSignIn;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        mFirebaseAuth = FirebaseAuth.getInstance();
        emailId = findViewById(R.id.editText);
        password = findViewById(R.id.editText2);
        btnSignup = findViewById(R.id.button1);
        tvSignIn = findViewById(R.id.textView3);

        mAuthStateListener = new FirebaseAuth.AuthStateListener() {

            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();

                if( mFirebaseUser != null ){
                    Toast.makeText(Signup.this,"You are logged in ",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Signup.this,MainActivity.class);

                    startActivity(i);
                }
                else{
                    Toast.makeText(Signup.this,"",Toast.LENGTH_SHORT).show();
                }
            }
        };
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailId.getText().toString();
                String pwd = password.getText().toString();
                if(email.isEmpty()){
                    emailId.setError("please enter email id");
                    emailId.requestFocus();
                }
                else if(pwd.isEmpty()){
                    password.setError("Please enter you password");
                    password.requestFocus();


                }
                else if(email.isEmpty() && pwd.isEmpty()){
                    Toast.makeText(Signup.this, "Fields Are Empty", Toast.LENGTH_SHORT).show();
                }
                else if(!(email.isEmpty() && pwd.isEmpty())){
                    mFirebaseAuth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(Signup.this,new OnCompleteListener<AuthResult>(){
                        public void onComplete(@NonNull Task<AuthResult> task){
                            if(!task.isSuccessful()){
                                Toast.makeText(Signup.this,"login Unsuccessful",Toast.LENGTH_SHORT).show();

                            }
                            else{
                                Intent intToHome = new Intent(Signup.this,MainActivity.class);
                                startActivity(intToHome);
                            }
                        }
                    });
                }
                else{
                    Toast.makeText(Signup.this,"Error Occurred!",Toast.LENGTH_SHORT).show();
                }
            }

        });

    tvSignIn.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent intSignUp = new Intent(Signup.this,Login.class);
            startActivity(intSignUp);

        }
    });
}
protected  void onStart(){
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);

}
}
