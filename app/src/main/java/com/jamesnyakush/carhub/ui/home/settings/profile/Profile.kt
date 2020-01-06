package com.jamesnyakush.carhub.ui.home.settings.profile

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.github.dhaval2404.imagepicker.ImagePicker

import com.jamesnyakush.carhub.R
import com.jamesnyakush.carhub.databinding.ProfileActivityBinding
import com.jamesnyakush.carhub.util.toast
import kotlinx.android.synthetic.main.profile_activity.*
import java.io.File

class Profile : Fragment() {

    private lateinit var viewModel: ProfileViewModel
    private lateinit var binding: ProfileActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.profile_activity, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ProfileViewModel::class.java)

        picker.setOnClickListener {
            ImagePicker.with(this)
                .crop()
                .compress(1024)
                .maxResultSize(1080, 1080)
                .start()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (resultCode) {
            Activity.RESULT_OK -> {
                val fileUri = data?.data
                iv_profile_photo.setImageURI(fileUri)

                val file: File? = ImagePicker.getFile(data)
                context?.toast(file.toString())

                val filePath: String? = ImagePicker.getFilePath(data)
                context?.toast(filePath.toString())
            }
            ImagePicker.RESULT_ERROR -> context?.toast(ImagePicker.getError(data))
            else -> context?.toast("Task Cancelled")
        }
    }

}
