package com.rakib.simplecalculator_viewmodel.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.rakib.simplecalculator_viewmodel.R;
import com.rakib.simplecalculator_viewmodel.viewModel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel viewModel;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        display = findViewById(R.id.displayTV);


        (findViewById(R.id.btnOne)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
            }
        });
        (findViewById(R.id.btnTwo)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });
        (findViewById(R.id.btnThree)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });
        (findViewById(R.id.btnFour)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });
        (findViewById(R.id.btnFive)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });
        (findViewById(R.id.btnSix)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });
        (findViewById(R.id.btnSeven)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });
        (findViewById(R.id.btnEight)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });
        (findViewById(R.id.btnNine)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });
        (findViewById(R.id.btnZero)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });


        ((findViewById(R.id.btnAdd))).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.addBtnAction(Float.parseFloat(display.getText()+""));
                display.setText(null);
            }
        });

        ((findViewById(R.id.btnSub))).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.subBtnAction(Float.parseFloat(display.getText()+""));
                display.setText(null);
            }
        });
        ((findViewById(R.id.btnMul))).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.mulBtnAction(Float.parseFloat(display.getText()+""));
                display.setText(null);
            }
        });
        ((findViewById(R.id.btnDiv))).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.divBtnAction(Float.parseFloat(display.getText()+""));
                display.setText(null);
            }
        });


        ((findViewById(R.id.btnEqual))).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (viewModel.Add || viewModel.Div || viewModel.Mul || viewModel.Sub){
                    display.setText(viewModel.equalBtnAction(Float.parseFloat(display.getText()+"")));
                }
            }
        });

        ((findViewById(R.id.btnDelete))).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
                viewModel.deleteBtnAction();
            }
        });
        ((findViewById(R.id.btnPoint))).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(String.valueOf(display.getText()) + ".");
            }
        });

    }


}