package com.example.bigshort

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.MainThread
import com.example.bigshort.interactor.ClearbitInterator
import com.example.bigshort.model.CompanyModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    val tag: String = "MainActivity"

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ClearbitInterator.instance().clearbitRequestService.getCompanyShortDetails("wework.com", "Bearer sk_81912104bdfcc0ff20a06fa5b228c432")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { company: CompanyModel? ->
                    Log.i(tag, company.toString())
                },
                { error: Throwable ->
                    Log.e(tag, error.toString())
                })
    }
}
