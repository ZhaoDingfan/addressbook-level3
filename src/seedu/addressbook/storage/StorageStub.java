package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.storage.jaxb.AdaptedAddressBook;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import StorageFile.StorageOperationException;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StorageStub extends Storage {
    
    public StorageStub() {
        
    }
    
    /**
     * Loads data from this storage file.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data from file.
     * @return nothing, which means that the method has empty body.
     */ 
    @Override
    public AddressBook load() throws StorageOperationException {
        return null;
    }
    
    /**
     * @return nothing.
     */
    @Override
    public abstract String getPath() {
        return null;
    }
    
    /**
     * Saves all data to this storage file.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to file.
     */
    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        // do nothing
    }
    
}
