package android.demo.fpt.fragmentdemo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Hung on 29-Aug-16.
 */
public class BottomFragment extends android.support.v4.app.Fragment {
    private TextView tv1, tv2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        tv1 = (TextView) view.findViewById(R.id.textViewName);
        tv2 = (TextView) view.findViewById(R.id.textViewCareer);

        return view;
    }

    public void showText(String text1, String text2){
        tv1.setText(text1);
        tv2.setText(text2);
    }
}
