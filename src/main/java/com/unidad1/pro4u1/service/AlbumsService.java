package com.unidad1.pro4u1.service;

import com.unidad1.pro4u1.domain.Albums;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AlbumsService {
    public List<Albums> buscarAlbums(){
        List<Albums> miMusica = new ArrayList<>();
        miMusica.add(new Albums("Kill 'Em All",
                "Primer álbum de Metallica, publicado por el sello independiente Megaforce Records.",
                "https://cdn.media.amplience.net/i/metallica/kill-em-all_cover"));

        
        miMusica.add(new Albums("Cigarettes After Sex",
                "Álbum debut homónimo de la banda de dream pop de El Paso, publicado en 2017 por Partisan Records.",
                "https://images.squarespace-cdn.com/content/v1/5f4a6763a23dbb3ab86255f7/1716304736578-WK60OMSBVH190ATLYNSO/7.png"));

        miMusica.add(new Albums("Cry",
                "Segundo álbum de estudio de Cigarettes After Sex, lanzado el 25 de octubre de 2019 y grabado en Mallorca.",
                "https://images.squarespace-cdn.com/content/v1/5f4a6763a23dbb3ab86255f7/1716304736578-WK60OMSBVH190ATLYNSO/7.png"));

        miMusica.add(new Albums("X's",
                "Tercer álbum de estudio de Cigarettes After Sex, publicado en julio de 2024.",
                "https://images.squarespace-cdn.com/content/v1/5f4a6763a23dbb3ab86255f7/1716304736578-WK60OMSBVH190ATLYNSO/7.png"));

        miMusica.add(new Albums("Hielo Ardiente",
                "Banda salvadoreña de rock, referente de la escena nacional de la posguerra.",
                "https://m.media-amazon.com/images/I/61xNFuDEC6L.jpg"));

        miMusica.add(new Albums("Siembra",
                "Álbum de Willie Colón y Rubén Blades (1978), uno de los discos de salsa más vendidos de la historia, con \"Pedro Navaja\".",
                "https://tse2.mm.bing.net/th/id/OIP.5iVKuoMORN3beDFDoGxVkwHaHa?r=0&rs=1&pid=ImgDetMain&o=7&rm=3"));

        miMusica.add(new Albums("Lo Mato",
                "Álbum de Willie Colón con Héctor Lavoe (1973), clásico de la salsa dura del sello Fania.",
                "https://tse3.mm.bing.net/th/id/OIP.M2ylZ-8FTqLH0OHch90gfQHaEK?r=0&rs=1&pid=ImgDetMain&o=7&rm=3"));

        miMusica.add(new Albums("Cielo de Tambores",
                "Álbum de Grupo Niche (1990), cumbre de la salsa colombiana con \"Cali Pachanguero\" y \"Una Aventura\".",
                "https://is1-ssl.mzstatic.com/image/thumb/Music126/v4/4b/cb/8f/4bcb8f42-4e4a-fcc8-b528-92d25dc76bea/888831916512.png/1200x1200bf-60.jpg"));

        return miMusica;
    }

}
