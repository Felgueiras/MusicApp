package app.felgueiras.musicapp.contracts

import android.app.Activity
import android.location.Location
import app.felgueiras.musicapp.api.Track


/**
 * Methods to be implemented in Splash Screen.
 */
interface SplashScreenContract {

    /**
     * Operations offered from View to Presenter
     */
    interface View {

        fun goToSongsList(tracks: ArrayList<Track>, countryName: String)

        fun waitingLocation()

        fun showCountryInfo(countryFlagURL: String, countryName: String)

        fun showNetworkError()

        fun showLocationDisabledError()

        fun getViewActivity(): Activity

    }

    /**
     * Operations offered from Presenter to View
     */
    interface Presenter {

        fun startIntentService(lastLocation: Location)

        fun onLocationPermissionsResult()

        fun requestLocationPermission()

    }
}
