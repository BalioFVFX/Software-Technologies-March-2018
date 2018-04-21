package shoppinglist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import shoppinglist.bindingModel.ProductBindingModel;
import shoppinglist.entity.Product;
import shoppinglist.repository.ProductRepository;

import java.util.List;

@Controller
public class ProductController {

	private final ProductRepository productRepository;

	@Autowired
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@GetMapping("/")
	public String index(Model model) {

		List<Product> products = this.productRepository.findAll();

		model.addAttribute("view", "product/index");
		model.addAttribute("products", products);

		return "base-layout";
	}

	@GetMapping("/create")
	public String create(Model model) {

		model.addAttribute("view", "product/create");

		return "base-layout";
	}

	@PostMapping("/create")
	public String createProcess(Model model, ProductBindingModel productBindingModel) {

		Product productEntity = new Product(productBindingModel.getPriority(), productBindingModel.getName(), productBindingModel.getQuantity(), productBindingModel.getStatus());
		this.productRepository.saveAndFlush(productEntity);

		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable int id) {

		model.addAttribute("product", this.productRepository.findOne(id));
		model.addAttribute("view", "product/edit");

		return "base-layout";
	}

	@PostMapping("/edit/{id}")
	public String editProcess(Model model, @PathVariable int id, ProductBindingModel productBindingModel) {

		Product productEntity = this.productRepository.findOne(id);
		productEntity.setPriority(productBindingModel.getPriority());
		productEntity.setName(productBindingModel.getName());
		productEntity.setQuantity(productBindingModel.getQuantity());
		productEntity.setStatus(productBindingModel.getStatus());
		this.productRepository.saveAndFlush(productEntity);

		return "redirect:/";
	}
}
