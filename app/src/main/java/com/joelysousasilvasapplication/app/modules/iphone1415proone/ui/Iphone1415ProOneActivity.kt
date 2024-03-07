package com.joelysousasilvasapplication.app.modules.iphone1415proone.ui

import androidx.activity.viewModels
import com.joelysousasilvasapplication.app.R
import com.joelysousasilvasapplication.app.appcomponents.base.BaseActivity
import com.joelysousasilvasapplication.app.databinding.ActivityIphone1415ProOneBinding
import com.joelysousasilvasapplication.app.modules.iphone1415proone.`data`.viewmodel.Iphone1415ProOneVM
import kotlin.String
import kotlin.Unit

class Iphone1415ProOneActivity :
    BaseActivity<ActivityIphone1415ProOneBinding>(R.layout.activity_iphone_14_15_pro_one) {
  private val viewModel: Iphone1415ProOneVM by viewModels<Iphone1415ProOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone1415ProOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE1415PRO_ONE_ACTIVITY"

  }
}
