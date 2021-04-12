package ro.pub.cs.systems.eim.Colocviu1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Colocviu1_2MainActivity extends AppCompatActivity {
    private Button addButton;
    private Button computeButton;
    private TextView allTermsTv;
    private EditText nextTermTextEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_2_main);

        addButton = (Button)findViewById(R.id.add_button);
        addButton.setOnClickListener(addButtonClickListener);
        computeButton = (Button)findViewById(R.id.compute_button);
        computeButton.setOnClickListener(computeButtonClickListener);
        allTermsTv = (TextView)findViewById(R.id.all_terms_tw);
        nextTermTextEdit = (EditText)findViewById((R.id.next_term_edit_text));
    }

    private AddButtonClickListener addButtonClickListener = new AddButtonClickListener();
    private class AddButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (nextTermTextEdit.getText().length() != 0)
            {
                try {
                    int n = Integer. parseInt(nextTermTextEdit.getText().toString());
                } catch (NumberFormatException e) {
                    // edit text value is Nan.
                    return;
                }
                if (allTermsTv.getText().length() == 0)
                {
                    allTermsTv.setText(nextTermTextEdit.getText());
                } else {

                    allTermsTv.setText(allTermsTv.getText() + " + " + nextTermTextEdit.getText());
                }
                nextTermTextEdit.setText("");
            }

        }
    }

    private ComputeButtonClickListener computeButtonClickListener = new ComputeButtonClickListener();
    private class ComputeButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
        }
    }
}