package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    // Define output
    TextView displayData;

    // Define distance units
    EditText distanceInput;
    String[]distanceUnits = {"Distance List","Meters","Inches","Feet","Yards","Miles","Nautical Miles"};

    // Define weight units
    EditText weightInput;
    String[]weightUnits = {"Weight List","Kilograms","Ounces","Pounds","Troy Pounds","Stones","Short Tons","Long Tons"};

    // Define volume units
    EditText volumeInput;
    String[]volumeUnits = {"Volume List","Liters","Fluid Ounces","Quarts","Gallons","Imperial Gallons"};

    // Declaration of distance, weight and volume results
    String distanceResult = "";
    String weightResult = "";
    String volumeResult = "";

    // Define array adapter
    ArrayAdapter<String> adapter1;
    ArrayAdapter<String> adapter2;
    ArrayAdapter<String> adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define distance, weight and volume spinner
        Spinner spinnerOne = findViewById(R.id.spinner1);
        Spinner spinnerTwo = findViewById(R.id.spinner2);
        Spinner spinnerThree = findViewById(R.id.spinner3);

        // Define 3 adapters for distance, weight and volume
        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,distanceUnits);
        adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,weightUnits);
        adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,volumeUnits);

        // Define output to result
        displayData = (TextView)findViewById(R.id.result);

        // Define input of distance, weight and volume
        distanceInput = (EditText)findViewById(R.id.distanceValue);
        weightInput = (EditText)findViewById(R.id.weightValue);
        volumeInput = (EditText)findViewById(R.id.volumeValue);

        // Set adapter1 to spinnerOne, adapter2 to spinnerTwo and adapter3 to spinnerThree
        spinnerOne.setAdapter(adapter1);
        spinnerTwo.setAdapter(adapter2);
        spinnerThree.setAdapter(adapter3);

        // Function of distance spinner
        spinnerOne.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String distanceConverts = distanceInput.getText().toString(); // Get inputs from distance text field
                DistanceCal disCal = new DistanceCal(); // Declaration of disCal as DistanceCal
                try {
                    switch (position) {
                        case 0:
                            distanceResult = "Please choose the distance unit.";
                            break;
                        case 1: // Meters
                            double converted1 = Double.parseDouble(distanceConverts); // Convert String input into double value
                            String answer1 = disCal.meterCal(converted1); // Return calculated value from DistanceCal class
                            distanceResult = "Distance:\n" + answer1; // Set distanceResult as output from calculated answers
                            break;
                        case 2: // Inches
                            double converted2 = Double.parseDouble(distanceConverts);
                            String answer2 = disCal.inchesCal(converted2);
                            distanceResult = "Distance:\n" + answer2;
                            break;
                        case 3: // Feet
                            double converted3 = Double.parseDouble(distanceConverts);
                            String answer3 = disCal.feetCal(converted3);
                            distanceResult = "Distance:\n" + answer3;
                            break;
                        case 4: // Yards
                            double converted4 = Double.parseDouble(distanceConverts);
                            String answer4 = disCal.yardsCal(converted4);
                            distanceResult = "Distance:\n" + answer4;
                            break;
                        case 5: // Miles
                            double converted5 = Double.parseDouble(distanceConverts);
                            String answer5 = disCal.milesCal(converted5);
                            distanceResult = "Distance:\n" + answer5;
                            break;
                        case 6: // Nautical Miles
                            double converted6 = Double.parseDouble(distanceConverts);
                            String answer6 = disCal.nMilesCal(converted6);
                            distanceResult = "Distance:\n" + answer6;
                            break;
                    }
                }catch(NumberFormatException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Function of weight spinner
        spinnerTwo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String weightConverts = weightInput.getText().toString(); // Get inputs from weight text field
                WeightCal wCal = new WeightCal(); // Declaration of wCal as WeightCal
                try {
                    switch (position) {
                        case 0:
                            weightResult = "\n \nPlease choose the weight unit.";
                            break;
                        case 1: // Kilograms
                            double converted1 = Double.parseDouble(weightConverts); // Convert String input into double value
                            String answer1 = wCal.kgCal(converted1); // Return calculated value from DistanceCal class
                            weightResult = "\n \nWeight:\n" + answer1; // Set weightResult as output from calculated answers
                            break;
                        case 2: // Ounces
                            double converted2 = Double.parseDouble(weightConverts);
                            String answer2 = wCal.ouncesCal(converted2);
                            weightResult = "\n \nWeight:\n" + answer2;
                            break;
                        case 3: // Pounds
                            double converted3 = Double.parseDouble(weightConverts);
                            String answer3 = wCal.poundsCal(converted3);
                            weightResult = "\n \nWeight:\n" + answer3;
                            break;
                        case 4: // Troy Pounds
                            double converted4 = Double.parseDouble(weightConverts);
                            String answer4 = wCal.tPoundsCal(converted4);
                            weightResult = "\n \nWeight:\n" + answer4;
                            break;
                        case 5: // Stones
                            double converted5 = Double.parseDouble(weightConverts);
                            String answer5 = wCal.stonesCal(converted5);
                            weightResult = "\n \nWeight:\n" + answer5;
                            break;
                        case 6: // Short Tons
                            double converted6 = Double.parseDouble(weightConverts);
                            String answer6 = wCal.sTonsCal(converted6);
                            weightResult = "\n \nWeight:\n" + answer6;
                            break;
                        case 7: // Long Tons
                            double converted7 = Double.parseDouble(weightConverts);
                            String answer7 = wCal.lTonsCal(converted7);
                            weightResult = "\n \nWeight:\n" + answer7;
                            break;
                    }
                }catch(NumberFormatException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Function of volume spinner
        spinnerThree.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String volumeConverts = volumeInput.getText().toString(); // Get inputs from volume text field
                VolumeCal volCal = new VolumeCal(); // Declaration of volCal as VolumeCal
                try {
                    switch (position) {
                        case 0:
                            volumeResult = "\n \nPlease choose the volume unit.";
                            break;
                        case 1: // Liters
                            double converted1 = Double.parseDouble(volumeConverts); // Convert String input into double value
                            String answer1 = volCal.litersCal(converted1); // Return calculated value from VolumeCal class
                            volumeResult = "\n \nVolume:\n" + answer1; // Set volumeResult as output from calculated answers
                            break;
                        case 2: // Fluid ounces
                            double converted2 = Double.parseDouble(volumeConverts);
                            String answer2 = volCal.fOuncesCal(converted2);
                            volumeResult = "\n \nVolume:\n" + answer2;
                            break;
                        case 3: // Quarts
                            double converted3 = Double.parseDouble(volumeConverts);
                            String answer3 = volCal.quartsCal(converted3);
                            volumeResult = "\n \nVolume:\n" + answer3;
                            break;
                        case 4: // Gallons
                            double converted4 = Double.parseDouble(volumeConverts);
                            String answer4 = volCal.gallonsCal(converted4);
                            volumeResult = "\n \nVolume:\n" + answer4;
                            break;
                        case 5: // Imperial gallons
                            double converted5 = Double.parseDouble(volumeConverts);
                            String answer5 = volCal.iGallonsCal(converted5);
                            volumeResult = "\n \nVolume:\n" + answer5;
                            break;
                    }
                }catch(NumberFormatException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void displayResult(View view){
        displayData.setText(distanceResult + weightResult + volumeResult);
    }

    public void resetResult(View view){
        displayData.setText("");
        distanceInput.setText("");
        weightInput.setText("");
        volumeInput.setText("");
    }
}
