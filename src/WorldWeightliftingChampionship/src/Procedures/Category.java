package Procedures;

public class Category {

    String category;
    CategoryType categoryType;

    public Category(String category, CategoryType categoryType) {
        setCategory(category);
        setCategoryType(categoryType);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }
}
