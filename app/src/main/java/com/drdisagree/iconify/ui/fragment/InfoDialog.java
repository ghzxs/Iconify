package com.drdisagree.iconify.ui.fragment;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.drdisagree.iconify.R;

public class InfoDialog extends AppCompatActivity {
    Context context;
    Dialog dialog;

    public InfoDialog(Context context) {
        this.context = context;
    }

    public void show(String title, String description) {
        if (dialog != null)
            dialog.dismiss();

        dialog = new Dialog(context);
        dialog.setContentView(R.layout.info_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true);
        dialog.setOnCancelListener(null);
        dialog.setCanceledOnTouchOutside(true);

        TextView text = dialog.findViewById(R.id.title);
        text.setText(title);

        TextView desc = dialog.findViewById(R.id.description);
        desc.setText(description);

        dialog.create();
        dialog.show();

        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialog.getWindow().setAttributes(layoutParams);
    }

    public void hide() {
        if ((dialog != null) && dialog.isShowing())
            dialog.dismiss();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (dialog != null && !isFinishing()) {
            dialog.dismiss();
        }
    }
}
