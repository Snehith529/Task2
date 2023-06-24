package com.example.task2_kongara;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.task2_kongara.databinding.FragmentSecondBinding;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
//import com.google.api.services.drive.Drive;


public class SecondFragment extends Fragment {
    private static final String TAG = "GoogleDriveUpload";
    private static final int REQUEST_CODE_SIGN_IN = 1;
    private static final String MIME_TYPE_CSV = "text/csv";

    private GoogleSignInClient googleSignInClient;
   // private Drive driveService;

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {


        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
//                GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(requireContext());
//                initializeDriveService(account);

            }
        });
    }

//    private void initializeDriveService(GoogleSignInAccount account) {
//        Intent signInIntent = googleSignInClient.getSignInIntent();
//        GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(signInIntent);
//        uploadCsvToDrive();
//    }
//
//
//    private void uploadCsvToDrive() {
//        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
//        intent.setType("text/csv");
//
//    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}