package com.antariksh.contactsmenu;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pickContact = (Button) findViewById(R.id.contactButton);

        pickContact.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_INSERT_OR_EDIT);         //Activity Action: Pick an existing item, or insert a new item, and then edit it
                intent.setType(ContactsContract.Contacts.CONTENT_ITEM_TYPE);

                startActivity(intent);
            }
        });
    }
}
