package com.l3ios.fragmentcommunicationusingrxjava.helpers

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

class RxBus private constructor() {

    private val publisher = PublishSubject.create<String>()

    internal fun publish(event: String) {
        publisher.onNext(event)
    }

    // Listen should return an Observable
    internal fun listen(): Observable<String> {
        return publisher
    }

    companion object {
        private var mInstance: RxBus? = null
        val instance: RxBus
            get() {
                if (mInstance == null) {
                    mInstance = RxBus()
                }
                return mInstance as RxBus
            }
    }
}