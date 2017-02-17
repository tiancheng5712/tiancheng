package com.hp.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hp.springmvc.domain.Product;
import com.hp.springmvc.form.ProductForm;
import com.hp.springmvc.service.ProductService;
@Controller
public class ProductController {

	private static final Logger logger=Logger.getLogger(ProductController.class);
	@Autowired
	private ProductService productService;
	@RequestMapping(value="/product_input")
	public String InputProduct(){
		logger.info("inputProduct �����ã�");	
	return "ProductForm";
	}
	@RequestMapping(value="/product_save",method=RequestMethod.POST)
	public String saveProduct(ProductForm productForm,RedirectAttributes redirectAttributes){
		logger.info("saveProduct ������");
		 Product product=new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
	try {
		product.setPrice(Double.parseDouble(productForm.getPrice()));
	} catch (Exception e) {
		e.printStackTrace();
	}
	//add product
	Product saveProduct= productService.add(product);
	redirectAttributes.addFlashAttribute("message", "The product was sucessfully added!");
	return "redirect:/product_view/"+saveProduct.getId()+".action";
	}
	@RequestMapping(value="/product_view/{id}")
	public String viewProduct(@PathVariable Long id,Model model){
		Product product=productService.get(id);
		model.addAttribute("product", product);
		return "ProductView";
	}
	@RequestMapping(value="/product_retrieve")
	public String sendProduct(@RequestParam Long id,Model model){
		Product product =productService.get(id);
		model.addAttribute("product", product);
		return "ProductView";
	}
}
