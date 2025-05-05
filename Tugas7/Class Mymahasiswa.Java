public class Mymahasiswa <K, V, C> {

    public static void main(String[] args) {
        Mymahasiswa<String, String, Integer> m = new Mymahasiswa<>();
        m.setNama("Agung");
        m.setNim("20230040073");
        m.setKelas(23);

        System.out.println(m.getNama());
        System.out.println(m.getNim());
        System.out.println(m.getKelas());
    }
    private K nama;
    private V nim;
    private C kelas;

    public void setNama(K nama) {
        this.nama = nama;
    }

    public void setNim(V nim) {
        this.nim = nim;
    }

    public void setKelas(C kelas) {
        this.kelas = kelas;
    }

    public K getNama() {
        return nama;
    }

    public V getNim() {
        return nim;
    }

    public C getKelas() {
        return kelas;
    }
}