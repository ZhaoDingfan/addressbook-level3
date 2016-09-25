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

public abstract class Storage {
    
    /**
     * Loads data from this storage file.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data from file.
     */    
    public abstract AddressBook load() throws StorageOperationException;
    
    /**
     * @return the path of this storage file.
     */
    public abstract String getPath();
    
    /**
     * Saves all data to this storage file.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to file.
     */
    public abstract void save(AddressBook addressBook) throws StorageOperationException;
    
}
