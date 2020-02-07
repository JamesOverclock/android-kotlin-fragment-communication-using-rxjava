package com.l3ios.fragmentcommunicationusingrxjava.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.l3ios.fragmentcommunicationusingrxjava.R
import com.l3ios.fragmentcommunicationusingrxjava.helpers.RxBus
import io.reactivex.Observer
import kotlinx.android.synthetic.main.fragment_second.*
import io.reactivex.disposables.Disposable

class SecondFragment : Fragment() {

    fun newInstance(): SecondFragment {
        return SecondFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // listen RxJava event
        RxBus.instance.listen().subscribe(getInputObserver())
    }

    private fun getInputObserver(): Observer<String> {
        return object : Observer<String> {

            override fun onSubscribe(d: Disposable) {}

            override fun onNext(s: String) {
                txtName.text = s
            }

            override fun onError(e: Throwable) {}

            override fun onComplete() {}
        }
    }


}
