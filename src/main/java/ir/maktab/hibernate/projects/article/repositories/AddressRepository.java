package ir.maktab.hibernate.projects.article.repositories;

import ir.maktab.hibernate.projects.article.core.config.hibernate.repository.CrudRepository;
import ir.maktab.hibernate.projects.article.model.Address;

public class AddressRepository extends CrudRepository<Address , Long> {

    private static AddressRepository addressRepository;

    private AddressRepository() {
    }

    public static AddressRepository getInstance(){
        if (addressRepository == null)
            addressRepository = new AddressRepository();
        return addressRepository;
    }

    @Override
    protected Class<Address> getEntityClass() {
        return Address.class;
    }
}
