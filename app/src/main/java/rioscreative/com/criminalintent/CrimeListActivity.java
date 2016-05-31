package rioscreative.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Turego on 5/31/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
