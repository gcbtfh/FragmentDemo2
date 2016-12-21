package android.demo.fpt.fragmentdemo2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Hung on 29-Aug-16.
 */
public class TopFragment extends android.support.v4.app.Fragment {
    private EditText et1, et2;
    private Button btn;
    private MainActivity mMainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        et1 = (EditText) view.findViewById(R.id.editTextName);
        et2 = (EditText) view.findViewById(R.id.editTextCareer);
        btn = (Button) view.findViewById(R.id.buttonApply);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendText();
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof MainActivity){
            mMainActivity = (MainActivity) context;
        }
    }

    public void sendText(){
        String text1 = et1.getText().toString();
        String text2 = et2.getText().toString();

        mMainActivity.showText(text1, text2);
    }
}
