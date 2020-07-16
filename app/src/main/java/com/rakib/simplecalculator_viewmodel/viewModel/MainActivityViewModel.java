package com.rakib.simplecalculator_viewmodel.viewModel;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    public boolean Add = true, Sub = true, Mul = true, Div = true, deci = true;
    public double _input_one = 0, _input_tow = 0, final_output = 0;

    public void addBtnAction(double first_input){
        Add = true;
        deci = false;
        _input_one = first_input;
    }
    public void subBtnAction(double first_input){
        Sub = true;
        deci = false;
        _input_one = first_input;
    }
    public void mulBtnAction(double first_input){
        Mul = true;
        deci = false;
        _input_one = first_input;
    }
    public void divBtnAction(double first_input){
        Div = true;
        deci = false;
        _input_one = first_input;
    }
    public void divBtnPoint(double first_input){
        if (deci){

        }else {
            deci = true;
        }
    }

    public String equalBtnAction(float second_input){
        _input_tow = second_input;

        if (Add){
            final_output = _input_one + _input_tow;
            Add = false;
        }
        if (Sub){
            final_output = _input_one - _input_tow;
            Sub = false;
        }
        if (Mul){
            final_output = _input_one * _input_tow;
            Mul = false;
        }
        if (Div){
            final_output = _input_one / _input_tow;
            Div = false;
        }

        return String.valueOf(final_output);
    }

    public void deleteBtnAction(){
        _input_one = 0.0;
        _input_tow = 0.0;
    }
}
