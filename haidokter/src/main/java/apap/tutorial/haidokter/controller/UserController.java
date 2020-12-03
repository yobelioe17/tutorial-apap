package apap.tutorial.haidokter.controller;

import apap.tutorial.haidokter.model.UserModel;
import apap.tutorial.haidokter.service.RoleService;
import apap.tutorial.haidokter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    private String addUserSubmit(@ModelAttribute UserModel user){
        userService.addUser(user);
        return "redirect:/";
    }

    @PostMapping(value = "/update-password")
    private String formChangePasswordSubmit(
            @RequestParam String username, String passwordOld, String passwordNew, String passwordConfirm, Model model) {
        UserModel user = userService.getUserByUsername(username);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        if(encoder.matches(passwordOld, user.getPassword())){
            if(passwordNew.equals(passwordConfirm)){
                userService.updatePassword(user, passwordNew);
                model.addAttribute("status", "Selamat, password anda berhasil diubah!");
            }
            else  {
                model.addAttribute("status", "Periksa kembali! Password baru anda tidak sesuai");
            }
        }
        else{
            model.addAttribute("status", "Password lama akun anda masih salah!");
        }

        return "update-password-success";
    }

    @GetMapping(value = "/update-password")
    private String changePassword(){
        return "update-password";
    }


}