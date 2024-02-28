package Laborator1;

public class Ex4 {
    public static void main(String[] args) {
        Persoana pers=new Persoana("John","Doe", 123456789);
        System.out.println("Nume: "+pers.getnume());
        System.out.println("Prenume: "+pers.getprneume());
        System.out.println("CNP: "+pers.getCNP());
    }
    
    
    static class Persoana{
        private String nume;
        private String prenume;
        private int CNP;

        public Persoana(String nume,String prenume,int CNP)
        {
            this.nume=nume;
            this.prenume=prenume;
            this.CNP=CNP;
        }

        public String getnume()
        {
            return nume;
        }

        public String getprneume()
        {
            return prenume;

        }

        public int getCNP()
        {
            return CNP;
        }
        public void setnume(String nume)
        {
            this.nume=nume;
        }

        public void setprenume(String prenume)
        {
            this.prenume=prenume;
        }

        public void setCNP(int CNP)
        {
            this.CNP=CNP;
        }

    }
  
}
