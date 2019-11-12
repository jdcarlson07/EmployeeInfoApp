package com.example.employeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter(View v)
    {
        EditText Fname = this.findViewById(R.id.enterFname);
        String fName = Fname.getText().toString();

        EditText Lname = this.findViewById(R.id.enterLname);
        String lName = Lname.getText().toString();

        EditText Age = this.findViewById(R.id.enterAge);
        int age = Integer.parseInt(Age.getText().toString());

        EditText Height = this.findViewById(R.id.enterHeight);
        int height = Integer.parseInt(Height.getText().toString());

        EditText Weight = this.findViewById(R.id.enterWeight);
        int weight = Integer.parseInt(Weight.getText().toString());

        Employee Jarrett = new Employee(fName, lName, age, height, weight);

        TextView FnameDisplay = this.findViewById(R.id.FirstNameDisplay);

        TextView LnameDisplay = this.findViewById(R.id.LastNameDisplay);

        TextView AgeDisplay = this.findViewById(R.id.AgeDisplay);

        TextView HeightDisplay = this.findViewById(R.id.HeightDisplay);

        TextView WeightDisplay = this.findViewById(R.id.WeightDisplay);

        FnameDisplay.setText(Jarrett.firstName);
        LnameDisplay.setText(Jarrett.lastName);
        AgeDisplay.setText(Integer.toString(Jarrett.age));
        HeightDisplay.setText(Integer.toString(Jarrett.height));
        WeightDisplay.setText(Integer.toString(Jarrett.weight));

    }
}
