package com.lojagraphql.lojagraphql.category;

import com.lojagraphql.lojagraphql.modules.category.domain.CategoryInput;
import com.lojagraphql.lojagraphql.modules.category.model.Category;
import com.lojagraphql.lojagraphql.modules.category.repository.CategoryRepository;
import com.lojagraphql.lojagraphql.modules.category.service.CategoryService;
import com.lojagraphql.lojagraphql.modules.category.translator.CategoryTranslator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class CategoryServiceTest {
    @Test
    void should_return_null_if_repository_does_not_return_data(){
        UUID mockUUID = UUID.randomUUID();
        Optional<Category> categoryEmpty = Optional.empty();

        CategoryRepository mockCategoryRepository = Mockito.mock(CategoryRepository.class);
        Mockito.when(mockCategoryRepository.findById(mockUUID)).thenReturn(categoryEmpty);

        CategoryTranslator mockCategoryTranslator = Mockito.mock(CategoryTranslator.class);

        CategoryService service = new CategoryService(mockCategoryRepository, mockCategoryTranslator);
        assertEquals(service.getCategoryById(mockUUID),null);
    }

    @Test
    void should_return_a_category(){
        UUID mockUUID = UUID.randomUUID();
        Category category = new Category();
        Optional<Category> categoryMock = Optional.of(category);

        CategoryRepository mockCategoryRepository = Mockito.mock(CategoryRepository.class);
        Mockito.when(mockCategoryRepository.findById(mockUUID)).thenReturn(categoryMock);

        CategoryTranslator mockCategoryTranslator = Mockito.mock(CategoryTranslator.class);
        Mockito.when(mockCategoryTranslator.translate(category)).thenReturn(
                new com.lojagraphql.lojagraphql.modules.category.domain.Category(mockUUID, "categoryTest"));

        CategoryService service = new CategoryService(mockCategoryRepository, mockCategoryTranslator);
        assertEquals(service.getCategoryById(mockUUID).getName(),"categoryTest");
    }

    @Test
    void should_insert_and_return_a_category(){
        UUID mockUUID = UUID.randomUUID();
        CategoryInput categoryInput = new CategoryInput();
        Category categoryModel = new Category();

        CategoryRepository mockCategoryRepository = Mockito.mock(CategoryRepository.class);
        Mockito.when(mockCategoryRepository.save(categoryModel)).thenReturn(categoryModel);

        CategoryTranslator mockCategoryTranslator = Mockito.mock(CategoryTranslator.class);

        Mockito.when(mockCategoryTranslator.translateBack(categoryInput)).thenReturn(categoryModel);


        Mockito.when(mockCategoryTranslator.translate(categoryModel)).thenReturn(
                new com.lojagraphql.lojagraphql.modules.category.domain.Category(mockUUID, "categoryTest"));

        CategoryService service = new CategoryService(mockCategoryRepository, mockCategoryTranslator);
        assertEquals(service.createCategory(categoryInput).getName(),"categoryTest");
        Mockito.verify(mockCategoryTranslator, Mockito.times(1)).translate(categoryModel);
        Mockito.verify(mockCategoryTranslator, Mockito.times(1)).translateBack(categoryInput);
    }
}
