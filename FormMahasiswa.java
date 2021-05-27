package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMahasiswa {
    private JTextField textNama;
    private JTextField textNIM;
    private JTextField textJP;
    private JTextField textTM;
    private JTextField textFakultas;
    private JTextField textJurusan;
    private JTextField textJK;
    private JTextField textNU;
    private JButton ButtonSave;
    private JPanel rootPanel;
    private JLabel labelhasil;

    public FormMahasiswa() {
        ButtonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String nim = textNIM.getText();
                String jenjangpendidikan = textJP.getText();
                String tahunmasuk = textTM.getText();
                String fakultas = textFakultas.getText();
                String jurusan = textJurusan.getText();
                String jeniskelamin = textJK.getText();
                String nomorurut = textNU.getText();

                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNIM(nim);
                mhs.setJenjangPendidikan(jenjangpendidikan);
                mhs.setTahunMasuk(tahunmasuk);
                mhs.setFakultas(fakultas);
                mhs.setJurusan(jurusan);
                mhs.setJenisKelamin(jeniskelamin);
                mhs.setNomorUrut(nomorurut);
                labelhasil.setText(mhs.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
