package guru.stefma.shareviahttp.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import guru.stefma.shareviahttp.R;

public class RoundedImageButtonWithTextView extends RelativeLayout {

    public RoundedImageButtonWithTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.obtainStyledAttributes(attrs,
                R.styleable.RoundedImageButtonWithTextView, 0, 0);
        int imageRessource = typedArray.getInteger(R.styleable.RoundedImageButtonWithTextView_imageSrc, 0);
        String text = typedArray.getString(R.styleable.RoundedImageButtonWithTextView_text);
        typedArray.recycle();

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.rounded_image_button_with_text_view, this, true);

        ImageButton imageButton = (ImageButton) getChildAt(0);
        imageButton.setImageResource(imageRessource);

        TextView textView = (TextView) getChildAt(1);
        textView.setText(text);
    }
}
