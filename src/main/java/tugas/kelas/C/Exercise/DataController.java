/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.kelas.C.Exercise;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author asus
 */
@Controller
//@ResponseBody
public class DataController 
{
    @RequestMapping("/list_data")
    public String listData(Model model){
        DataNama  Data = new DataNama();
        List<Data> DataList = Data.getDataList();
        
        model.addAttribute("Data", DataList);
        
        return "Data";
    }

}
