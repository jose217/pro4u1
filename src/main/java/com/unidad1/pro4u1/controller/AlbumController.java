package com.unidad1.pro4u1.controller;

import com.unidad1.pro4u1.domain.Albums;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.unidad1.pro4u1.service.AlbumsService;
import java.util.List;
import org.springframework.ui.Model;

/**
 *
 * @author gabriela.dominguez
 */

@Controller
public class AlbumController {
    
    private final AlbumsService albumService;

    public AlbumController(AlbumsService albumService) {
        this.albumService = albumService;
    }
    
    @RequestMapping("/")
    public String buscarAlbums(Model modelo){
        List<Albums> albums =albumService.buscarAlbums();
        modelo.addAttribute("yes", albums);
        return "home";
    }
    
}
