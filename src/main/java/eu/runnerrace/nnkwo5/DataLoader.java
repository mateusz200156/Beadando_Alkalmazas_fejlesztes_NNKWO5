package eu.runnerrace.nnkwo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import eu.runnerrace.nnkwo5.entry.EredmenyEntry;
import eu.runnerrace.nnkwo5.entry.VersenyEntry;
import eu.runnerrace.nnkwo5.entry.VersenyzoEntry;
import eu.runnerrace.nnkwo5.repository.EredmenyRepository;
import eu.runnerrace.nnkwo5.repository.VersenyRepository;
import eu.runnerrace.nnkwo5.repository.VersenyzoRepository;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private EredmenyRepository eredmenyRepository;
    @Autowired
    private VersenyRepository versenyRepository;
    @Autowired
    private VersenyzoRepository versenyzoRepository;

    @Override
    public void run(String... args) throws Exception {
        //Versenyek
        VersenyEntry v1 = new VersenyEntry();
        v1.setNev("Elso verseny");
        v1.setTavolsag(10);
        versenyRepository.save(v1);

        VersenyEntry v2 = new VersenyEntry();
        v2.setNev("Masodik verseny");
        v2.setTavolsag(2);
        versenyRepository.save(v2);

        //Versenyzők
        VersenyzoEntry vz1 = new VersenyzoEntry();
        vz1.setNev("Béla");
        vz1.setKor(27);
        vz1.setIsFerfi(true);
        versenyzoRepository.save(vz1);

        VersenyzoEntry vz2 = new VersenyzoEntry();
        vz2.setNev("Maria");
        vz2.setKor(18);
        vz2.setIsFerfi(false);
        versenyzoRepository.save(vz2);

        VersenyzoEntry vz3 = new VersenyzoEntry();
        vz3.setNev("Jozsef");
        vz3.setKor(42);
        vz3.setIsFerfi(true);
        versenyzoRepository.save(vz3);

        VersenyzoEntry vz4 = new VersenyzoEntry();
        vz4.setNev("Huan");
        vz4.setKor(28);
        vz4.setIsFerfi(true);
        versenyzoRepository.save(vz4);

        //Eredmények
        EredmenyEntry e1 = new EredmenyEntry();
        e1.setIdo(15);
        e1.setVerseny(v1);
        e1.setVersenyzo(vz1);
        eredmenyRepository.save(e1);

        EredmenyEntry e2 = new EredmenyEntry();
        e2.setIdo(22);
        e2.setVerseny(v1);
        e2.setVersenyzo(vz2);
        eredmenyRepository.save(e2);

        EredmenyEntry e3 = new EredmenyEntry();
        e3.setIdo(24);
        e3.setVerseny(v1);
        e3.setVersenyzo(vz3);
        eredmenyRepository.save(e3);

        EredmenyEntry e4 = new EredmenyEntry();
        e4.setIdo(8);
        e4.setVerseny(v1);
        e4.setVersenyzo(vz4);
        eredmenyRepository.save(e4);

        EredmenyEntry e5 = new EredmenyEntry();
        e5.setIdo(35);
        e5.setVerseny(v2);
        e5.setVersenyzo(vz2);
        eredmenyRepository.save(e5);

        EredmenyEntry e6 = new EredmenyEntry();
        e6.setIdo(17);
        e6.setVerseny(v2);
        e6.setVersenyzo(vz3);
        eredmenyRepository.save(e6);
    }

}
