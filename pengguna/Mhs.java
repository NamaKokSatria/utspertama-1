package pengguna;

public class Mhs extends User {
    
    public class Mhs extends User {
        private String nama;
        private String nim;
        private int smt;
    
        public Mhs (String username, String password) {
          super("ini_username", "ini_password");  
        }    
        public void setNama(String nama) {
            this.nama = nama;
        }
        public String getNama() {
            return this.nama = nama;
        }
        public void setNim(String nim) {
            this.nim = nim;
        }
        public String getNim() {
            return this.nim = nim;
        }
        public void setSmt(int smt) {
            this.smt = smt;
        }
        public int getSmt() {
            return this.smt = smt;
        }
}    