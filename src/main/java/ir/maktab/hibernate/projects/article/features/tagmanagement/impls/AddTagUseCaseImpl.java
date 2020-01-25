package ir.maktab.hibernate.projects.article.features.tagmanagement.impls;

import ir.maktab.hibernate.projects.article.model.Tag;
import ir.maktab.hibernate.projects.article.features.tagmanagement.usecases.AddTagUseCase;

import java.util.ArrayList;

public class AddTagUseCaseImpl implements AddTagUseCase {
    @Override
    public Tag add(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("\t\u274c Failed to Add Tag! Title Error.\n");
            return null;
        }
        if (tagRepository.findAll().stream().anyMatch(tag -> tag.getTitle().equals(title))) {
            System.out.println("\t\u274c Failed to Add Tag! this Tag exists.\n");
            return null;
        }
        Tag tagToAdd = new Tag( title , new ArrayList<>());

        tagRepository.saveDb2(new Tag( title , new ArrayList<>()));

        tagToAdd.setId(tagRepository.saveDb(tagToAdd));

        Tag addedTag = tagRepository.findById(tagToAdd.getId());
        if (addedTag != null)
            System.out.println("\t\u2714 Tag successfully Added.\n");
        else
            System.out.println("\t\u274c Failed to Add Tag!\n");
        return addedTag;
    }
}
