package tugas.uas.ngodingyuks;

import android.os.Parcel;
import android.os.Parcelable;

public class Bahasa implements Parcelable {
    private String nama_bahasa;
    private String detail_bahasa;
    private int photo;

    public Bahasa() {

    }

    public String getNama_bahasa() {
        return nama_bahasa;
    }

    public void setNama_bahasa(String nama_bahasa) {
        this.nama_bahasa = nama_bahasa;
    }

    public String getDetail_bahasa() {
        return detail_bahasa;
    }

    public void setDetail_bahasa(String detail_bahasa) {
        this.detail_bahasa = detail_bahasa;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama_bahasa);
        parcel.writeString(detail_bahasa);
        parcel.writeInt(photo);
    }

    protected Bahasa(Parcel in) {
        nama_bahasa = in.readString();
        detail_bahasa = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Bahasa> CREATOR = new Creator<Bahasa>() {
        @Override
        public Bahasa createFromParcel(Parcel in) {
            return new Bahasa(in);
        }

        @Override
        public Bahasa[] newArray(int size) {
            return new Bahasa[size];
        }
    };
}
