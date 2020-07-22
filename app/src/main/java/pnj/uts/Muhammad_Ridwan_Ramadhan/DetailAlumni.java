package pnj.uts.Muhammad_Ridwan_Ramadhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailAlumni extends AppCompatActivity {
    TextView detailNim, detailNama, detailTempat, detailTanggal, detailAlamat, detailAgama, detailTlp, detailMasuk, detailLulus, detailPekerjaan, detailJabatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_alumni);

        detailNim = findViewById(R.id.detailNim);
        detailNama = findViewById(R.id.detailNama);
        detailTempat = findViewById(R.id.detailTempat);
        detailTanggal = findViewById(R.id.detailTanggal);
        detailAlamat = findViewById(R.id.detailAlamat);
        detailAgama = findViewById(R.id.detailAgama);
        detailTlp = findViewById(R.id.detailTlp);
        detailMasuk = findViewById(R.id.detailMasuk);
        detailLulus = findViewById(R.id.detailLulus);
        detailPekerjaan = findViewById(R.id.detailPekerjaan);
        detailJabatan = findViewById(R.id.detailJabatan);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            detailNim.setText("NIM : "+extras.getString("nim", ""));
            detailNama.setText("Nama : "+extras.getString("nama", ""));
            detailTempat.setText("Tempat Lahir : "+extras.getString("tempat", ""));
            detailTanggal.setText("Tanggal Lahir : "+extras.getString("tanggal", ""));
            detailAlamat.setText("Alamat : "+extras.getString("alamat", ""));
            detailAgama.setText("Agama : "+extras.getString("agama", ""));
            detailTlp.setText("Nomor Telepon : "+extras.getString("tlp", ""));
            detailMasuk.setText("Tahun Masuk : "+extras.getString("masuk", ""));
            detailLulus.setText("Tahun Lulus : "+extras.getString("lulus", ""));
            detailPekerjaan.setText("Pekerjaan : "+extras.getString("pekerjaan", ""));
            detailJabatan.setText("Jabatan : "+extras.getString("jabatan", ""));
        }
    }
}
