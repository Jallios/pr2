package com.example.pr2.Controllers;


import com.example.pr2.CRUD;
import com.example.pr2.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Главная");
        return "home";
    }
    @Autowired
    private CRUD<Car> CarService;

    @GetMapping("/Car/index")
    public String carIndex(@ModelAttribute("car") Car car,
                           Model model) {
        model.addAttribute("title", "Машины главная");
        model.addAttribute("cars", CarService.index());
        return "/Car/index";
    }

    @PostMapping("/Car/index")
    public String createCar(@ModelAttribute("car") Car car) {
        CarService.save(car);
        return "redirect:/Car/index";
    }

    @GetMapping("/Car/index/{id}")
    public String deleteCar(@PathVariable("id") Long id) {
        CarService.delete(id);
        return "redirect:/Car/index";
    }

    @GetMapping("/Car/update/{id}")
    public String editCar(Model model, @PathVariable("id") Long id) {
        model.addAttribute("car", CarService.show(id));
        return "/Car/update";
    }

    @PostMapping("/Car/update/{id}")
    public String updateCar(@ModelAttribute("car") Car car, @PathVariable("id") Long id) {
        CarService.update(id, car);
        return "redirect:/Car/index";
    }

    @Autowired
    private CRUD<Cat> CatService;

    @GetMapping("/Cat/index")
    public String catIndex(@ModelAttribute("cat") Cat cat,
                           Model model) {
        model.addAttribute("title", "Коты главная");
        model.addAttribute("cats", CatService.index());
        return "/Cat/index";
    }

    @PostMapping("/Cat/index")
    public String createCat(@ModelAttribute("cat") Cat cat) {
        CatService.save(cat);
        return "redirect:/Cat/index";
    }

    @GetMapping("/Cat/index/{id}")
    public String deleteCat(@PathVariable("id") Long id) {
        CatService.delete(id);
        return "redirect:/Cat/index";
    }

    @GetMapping("/Cat/update/{id}")
    public String editCat(Model model, @PathVariable("id") Long id) {
        model.addAttribute("cat", CatService.show(id));
        return "/Cat/update";
    }

    @PostMapping("/Cat/update/{id}")
    public String updateCat(@ModelAttribute("cat") Cat cat, @PathVariable("id") Long id) {
        CatService.update(id, cat);
        return "redirect:/Cat/index";
    }

    @Autowired
    private CRUD<House> HouseService;
    @GetMapping("/House/index")
    public String houseIndex(@ModelAttribute("house") House house,
                           Model model) {
        model.addAttribute("title", "Дома главная");
        model.addAttribute("houses", HouseService.index());
        return "/House/index";
    }

    @PostMapping("/House/index")
    public String createHouse(@ModelAttribute("house") House house) {
        HouseService.save(house);
        return "redirect:/House/index";
    }

    @GetMapping("/House/index/{id}")
    public String deleteHouse(@PathVariable("id") Long id) {
        HouseService.delete(id);
        return "redirect:/House/index";
    }

    @GetMapping("/House/update/{id}")
    public String editHouse(Model model, @PathVariable("id") Long id) {
        model.addAttribute("house", HouseService.show(id));
        return "/House/update";
    }

    @PostMapping("/House/update/{id}")
    public String updateHouse(@ModelAttribute("house") House house, @PathVariable("id") Long id) {
        HouseService.update(id, house);
        return "redirect:/House/index";
    }

    @Autowired
    private CRUD<User> UserService;
    @GetMapping("/User/index")
    public String userIndex(@ModelAttribute("user") User User,
                           Model model) {
        model.addAttribute("title", "Машины главная");
        model.addAttribute("users", UserService.index());
        return "/User/index";
    }

    @PostMapping("/User/index")
    public String createUser(@ModelAttribute("user") User user) {
        UserService.save(user);
        return "redirect:/User/index";
    }

    @GetMapping("/User/index/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        UserService.delete(id);
        return "redirect:/User/index";
    }

    @GetMapping("/User/update/{id}")
    public String editUser(Model model, @PathVariable("id") Long id) {
        model.addAttribute("user", UserService.show(id));
        return "/User/update";
    }

    @PostMapping("/User/update/{id}")
    public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") Long id) {
        UserService.update(id, user);
        return "redirect:/User/index";
    }

    @Autowired
    private CRUD<Work> WorkService;

    @GetMapping("/Work/index")
    public String workIndex(@ModelAttribute("work") Work work,
                           Model model) {
        model.addAttribute("title", "Машины главная");
        model.addAttribute("works", WorkService.index());
        return "/Work/index";
    }

    @PostMapping("/Work/index")
    public String createWork(@ModelAttribute("work") Work work) {
        WorkService.save(work);
        return "redirect:/Work/index";
    }

    @GetMapping("/Work/index/{id}")
    public String deleteWork(@PathVariable("id") Long id) {
        WorkService.delete(id);
        return "redirect:/Work/index";
    }

    @GetMapping("/Work/update/{id}")
    public String editWork(Model model, @PathVariable("id") Long id) {
        model.addAttribute("work", WorkService.show(id));
        return "/Work/update";
    }

    @PostMapping("/Work/update/{id}")
    public String updateWork(@ModelAttribute("work") Work work, @PathVariable("id") Long id) {
        WorkService.update(id, work);
        return "redirect:/Work/index";
    }
}
