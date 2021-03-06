package ir.maktab.hibernate.projects.article.features.tagmanagement.impls;

import ir.maktab.hibernate.projects.article.model.Tag;
import ir.maktab.hibernate.projects.article.features.tagmanagement.usecases.DeleteTagUseCase;

public class DeleteTagUseCaseImpl implements DeleteTagUseCase {

    @Override
    public Boolean delete(Tag tagToDelete) {
        if (tagToDelete == null) {
            System.out.println("\t\u274c Failed to Delete Tag! Tag Error.\n");
            return false;
        }

        tagRepository.removeDb2(tagToDelete);
        tagRepository.removeDb(tagToDelete);

        if (!tagRepository.findAll().contains(tagToDelete)) {
            System.out.println("\t\u274c Failed to Delete Tag! This Tag doesn't Exist.\n");
            return false;
        }

        Tag deletedTag = tagRepository.findById(tagToDelete.getId());
        if (deletedTag == null) {
            System.out.println("\t\u2714 Tag successfully Deleted.\n");
            return true;
        }
        else
            System.out.println("\t\u274c Failed to Delete Tag!\n");
        return false;
    }
}
