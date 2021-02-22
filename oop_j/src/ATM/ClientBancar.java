package ATM;

import java.util.ArrayList;
import java.util.List;

public class ClientBancar {
    private String nume;
    private String prenume;
    private String cnp;
    private String username;
    private String password;
    private List<Cont> contList = new ArrayList<Cont>();

    public ClientBancar(String nume, String prenume, String cnp, String username, String password){
        this.nume=nume;
        this.prenume=prenume;
        this.cnp=cnp;
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void adaugaCont(Cont cont){
        contList.add(cont);
    }

    public List<Cont> getContList() {
        return contList;
    }
}

