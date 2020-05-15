package tugas.uas.ngodingyuks;

import java.util.ArrayList;

public class    DataBahasa {
    private static String[] namaBahasa = {
            "Bahasa Pemrograman Java",
            "Bahasa Pemrograman C",
            "Bahasa Pemrograman PHP",
            "Bahasa Pemrograman Visual Basic",
            "Bahasa Pemrograman Python",
            "Bahasa Pemrograman C++",
            "Bahasa Pemrograman Javascript",
            "Bahasa Pemrograman C#",
            "Bahasa Pemrograman Ruby",
            "Bahasa Pemrograman Golang"
    };

    private static String[] detailBahasa = {
            "Java merupakan bahasa pemrograman yang dapat dijalankan di berbagai platform, dari mulai PC sampai perangkat mobile. Bahasa pemrograman ini awalnya dikembangkan pada The Green Project pada tahun 1991 oleh Sun Microsystem yang kemudian dilepas pada Oracle. Nama Java sendiri dipilih karena salah seorang pendiri Java, James Gosling, sangat menyukai kopi murni yang langsung digiling dari mesin giling (kopi tubruk) dimana kopi jenis ini berasal dari pulau Jawa di Indonesia.",
            "Bahasa C ini termasuk bahasa pemrograman tertua yang pernah ada. Bahasa pemrograman C ini dikembangkan dari sekitar tahun 70-an. Pembuat bahasa C adalah Dennis Ritchie. Bahasa C menjadi bahasa pemrograman yang populer di Indonesia karena hampir sebagian besar perguruan tinggi jurusan IT ataupun lembaga kursus pemrograman menggunakan bahasa ini untuk dipelajari pertama kali sebelum mempelajari bahasa pemrograman yang lain.",
            "PHP (PHP Hypertext Pre-processor) merupakan bahasa pemrograman yang paling banyak digunakan di Indonesia. Selain karena gratis, PHP banyak digunakan karena bahasa pemrograman ini merupakan server side scripting yang memang dirancang untuk membangun website dinamis. ",
            "Visual Basic merupakan bahasa pemrograman yang dikembangkan oleh Microsoft. Bahasa pemrograman ini menawarkan IDE visual dalam pembuatan software, dan bahasa pemrograman ini dikembangkan untuk membuat software-software berbasis sistem operasi Windows. VisualBasic sendiri adalah keturunan dari bahasa pemrograman BASIC.",
            "Dalam tingkatan bahasa pemrograman, Python termasuk bahasa tingkat tinggi. Python menjadi salah satu bahasa pemrograman yang dapat membangun aplikasi, baik itu berbasis web ataupun berbasis mobile. Bahasa phyton ini termasuk kedalam bahasa pemorgraman yang cukup mudah bagi pemula, karena bahasa tersebut mudah untuk dibaca dengan syntax yang mudah untuk dipahami juga.",
            "C++ merupakan bahasa pemrograman pengembangan dari bahasa C. C++ dan C memiliki sintaks penulisan yang hampir sama, meski begitu kedua bahasa pemrograman ini memiliki perbedaan pada penyelesaian masalahnya.",
            "JavaScript adalah bahasa pemrograma yang dikembangkan oleh Netscape. Penggunaan JavaScript saat ini kebanyakan terdapat pada pengembangan web.",
            "C# atau yang dibaca C sharp adalah bahasa pemrograman sederhana yang digunakan untuk tujuan umum, dalam artian bahasa pemrograman ini dapat digunakan untuk berbagai fungsi misalnya untuk pemrograman server-side pada website, membangun aplikasi desktop ataupun mobile, pemrograman game dan sebagainya.",
            "Ruby adalah bahasa pemrograman dinamis berbasis skrip yang berorientasi objek. Tujuan dari ruby adalah menggabungkan kelebihan dari semua bahasa-bahasa pemrograman skrip yang ada di dunia. ",
            "Go atau bisa disebut GoLang. Golang adalah bahasa pemrograman yang dibuat oleh Google dan tim pengembangnya pada tahun 2009. Golang merupakan bahasa pemrograman yang sifatnya open-source dan gratis, saat ini golang dikelola oleh Google. ",
    };

    private static int[] gambarBahasa = {
            R.drawable.java,
            R.drawable.c,
            R.drawable.php,
            R.drawable.visual_basic,
            R.drawable.python,
            R.drawable.bahasa_cplus,
            R.drawable.javascript,
            R.drawable.bahasa_csharp,
            R.drawable.ruby,
            R.drawable.golang
    };

    static ArrayList<Bahasa> getListData() {
        ArrayList<Bahasa> list = new ArrayList<>();
        for (int position = 0; position < namaBahasa.length; position++) {
            Bahasa bahasa = new Bahasa();
            bahasa.setNama_bahasa(namaBahasa[position]);
            bahasa.setDetail_bahasa(detailBahasa[position]);
            bahasa.setPhoto(gambarBahasa[position]);
            list.add(bahasa);
        }
        return list;
    }
}
