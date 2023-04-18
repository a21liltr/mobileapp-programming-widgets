package com.example.widgets;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.widgets.databinding.ActivityMainBinding;

public class MyListener implements View.OnClickListener{
    ActivityMainBinding binding;
    String input;

    public MyListener(String editName) {
        System.out.println("Something was clicked");
        input = editName;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.buttonNo:
                if (input.equals("")) {
                    System.out.println("Blank");
                    break;
                }
                binding.editName.getText().clear();
                System.out.println("111");
                break;
            case R.id.buttonYes:
                if (input.equals("")) {
                    System.out.println("Input is blank");
                    return;
                }
                binding.textView.setText("Hello " + input + "!");
                binding.editName.setVisibility(View.GONE);
                binding.buttonYes.setVisibility(View.GONE);
                binding.buttonNo.setVisibility(View.GONE);
                System.out.println("222");
                break;
            default:
                System.out.println("Something went wrong!");

                Context context;
                context = view.getContext();
                CharSequence text = "Something went wrong!";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
        }
    }
}
