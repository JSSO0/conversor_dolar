package com.joelysousasilvasapplication.app.modules.iphone1415proone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.joelysousasilvasapplication.app.modules.iphone1415proone.`data`.model.Iphone1415ProOneModel
import org.koin.core.KoinComponent

class Iphone1415ProOneVM : ViewModel(), KoinComponent {
  val iphone1415ProOneModel: MutableLiveData<Iphone1415ProOneModel> =
      MutableLiveData(Iphone1415ProOneModel())

  var navArguments: Bundle? = null
}
