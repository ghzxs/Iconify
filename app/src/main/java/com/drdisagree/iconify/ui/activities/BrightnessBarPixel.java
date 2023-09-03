package com.drdisagree.iconify.ui.activities;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.drdisagree.iconify.R;
import com.drdisagree.iconify.databinding.ActivityBrightnessBarsPixelBinding;
import com.drdisagree.iconify.ui.adapters.BrightnessBarAdapter;
import com.drdisagree.iconify.ui.models.BrightnessBarModel;
import com.drdisagree.iconify.ui.utils.ViewBindingHelpers;
import com.drdisagree.iconify.ui.views.LoadingDialog;

import java.util.ArrayList;

public class BrightnessBarPixel extends BaseActivity {

    private ActivityBrightnessBarsPixelBinding binding;
    private LoadingDialog loadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBrightnessBarsPixelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Header
        ViewBindingHelpers.setHeader(this, binding.header.toolbar, R.string.activity_title_brightness_bar);

        // Loading dialog while enabling or disabling pack
        loadingDialog = new LoadingDialog(this);

        // RecyclerView
        binding.brightnessBarPixelContainer.setLayoutManager(new LinearLayoutManager(this));
        binding.brightnessBarPixelContainer.setAdapter(initQsShapeItems());
        binding.brightnessBarPixelContainer.setHasFixedSize(true);
    }

    private BrightnessBarAdapter initQsShapeItems() {
        ArrayList<BrightnessBarModel> bb_list = new ArrayList<>();

        bb_list.add(new BrightnessBarModel("Rounded Clip", R.drawable.bb_roundedclip_pixel, R.drawable.auto_bb_roundedclip_pixel));
        bb_list.add(new BrightnessBarModel("Rounded Bar", R.drawable.bb_rounded_pixel, R.drawable.auto_bb_rounded_pixel));
        bb_list.add(new BrightnessBarModel("Double Layer", R.drawable.bb_double_layer_pixel, R.drawable.auto_bb_double_layer_pixel));
        bb_list.add(new BrightnessBarModel("Shaded Layer", R.drawable.bb_shaded_layer_pixel, R.drawable.auto_bb_shaded_layer_pixel));
        bb_list.add(new BrightnessBarModel("Outline", R.drawable.bb_outline_pixel, R.drawable.auto_bb_outline_pixel));
        bb_list.add(new BrightnessBarModel("Leafy Outline", R.drawable.bb_leafy_outline_pixel, R.drawable.auto_bb_leafy_outline_pixel));
        bb_list.add(new BrightnessBarModel("Neumorph", R.drawable.bb_neumorph_pixel, R.drawable.auto_bb_neumorph_pixel));
        bb_list.add(new BrightnessBarModel("Inline", R.drawable.bb_inline_pixel, R.drawable.auto_bb_rounded_pixel));
        bb_list.add(new BrightnessBarModel("Neumorph Outline", R.drawable.bb_neumorph_outline_pixel, R.drawable.auto_bb_neumorph_outline_pixel));
        bb_list.add(new BrightnessBarModel("Neumorph Thumb", R.drawable.bb_neumorph_thumb_pixel, R.drawable.auto_bb_neumorph_thumb_pixel));
        bb_list.add(new BrightnessBarModel("Blocky Thumb", R.drawable.bb_blocky_thumb_pixel, R.drawable.auto_bb_blocky_thumb_pixel));
        bb_list.add(new BrightnessBarModel("Comet Thumb", R.drawable.bb_comet_thumb_pixel, R.drawable.auto_bb_comet_thumb_pixel));
        bb_list.add(new BrightnessBarModel("Minimal Thumb", R.drawable.bb_minimal_thumb_pixel, R.drawable.auto_bb_minimal_thumb_pixel));
        bb_list.add(new BrightnessBarModel("Old School Thumb", R.drawable.bb_oldschool_thumb_pixel, R.drawable.auto_bb_oldschool_thumb_pixel));
        bb_list.add(new BrightnessBarModel("Gradient Thumb", R.drawable.bb_gradient_thumb_pixel, R.drawable.auto_bb_gradient_thumb_pixel));
        bb_list.add(new BrightnessBarModel("Lighty", R.drawable.bb_lighty_pixel, R.drawable.auto_bb_lighty_pixel));
        bb_list.add(new BrightnessBarModel("Semi Transparent", R.drawable.bb_semi_transparent_pixel, R.drawable.auto_bb_semi_transparent_pixel));
        bb_list.add(new BrightnessBarModel("Thin Outline", R.drawable.bb_thin_outline_pixel, R.drawable.auto_bb_thin_outline_pixel));
        bb_list.add(new BrightnessBarModel("Purfect", R.drawable.bb_purfect_pixel, R.drawable.auto_bb_purfect_pixel));
        bb_list.add(new BrightnessBarModel("Translucent Outline", R.drawable.bb_translucent_outline_pixel, R.drawable.auto_bb_translucent_outline_pixel));

        return new BrightnessBarAdapter(this, bb_list, loadingDialog, "BBP");
    }

    @Override
    public void onDestroy() {
        loadingDialog.hide();
        super.onDestroy();
    }
}