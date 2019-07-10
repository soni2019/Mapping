package com.hcl.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dto.CategoryDto;
import com.hcl.entity.Category;
import com.hcl.entity.Product;
import com.hcl.repository.IProductRepo;
import com.hcl.repository.IUserServiceRepo;
import com.hcl.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService  {
	@Autowired
	IUserServiceRepo userServiceRepo;
	@Autowired
	IProductRepo productRepo;

	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	@Override
	public CategoryDto addProduct(CategoryDto category)
	{
		/*
		 * Registration oldUser=userServiceRepo.getOne(userId); CategoryDto regDto=null;
		 * if(oldUser.getUserType().equalsIgnoreCase(userStatus)) { Category product =
		 * productRepo.save(category); regDto= new CategoryDto();
		 * BeanUtils.copyProperties(product, regDto); } else {
		 * logger.info("Unable to find product category:" + category.getCategoryId()+
		 * " OR invalid user"); throw new DataNotFoundException("No Record Avaliable");
		 * }
		 */
		Product  product =new Product();
		Category category2=new Category();
		category2.setCategoryId(category.getCategoryId());
		
		BeanUtils.copyProperties(category, product);
		product.setCategory(category2);
		productRepo.save(product);
		
		return category;
	}
	/*
	 * @Override public CategoryDto productByCategory(Long categoryId) { CategoryDto
	 * regDto=null; if(categoryId!=null) { Optional<Category>
	 * product=productRepo.findById(categoryId); regDto= new CategoryDto();
	 * BeanUtils.copyProperties(product, regDto); }else { throw new
	 * DataNotFoundException("No Record Avaliable"); } return regDto;
	 * 
	 * }
	 * 
	 * @Override public List<Category> products() { List<Category> products =
	 * productRepo.findAll(); return products; }
	 */

	@Override
	public CategoryDto productByCategory(Long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> products() {
		// TODO Auto-generated method stub
		return null;
	}

}
