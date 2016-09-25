package seedu.addressbook.commands;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.*;
import seedu.addressbook.data.tag.Tag;
import seedu.addressbook.data.tag.UniqueTagList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Edits the information of some person in address book.
 */
public class EditCommand {
    private String type;
    private String value;
    
    public static final String COMMAND_WORD = "edit";
    
    public static final String 
    
    public static final String MESSAGE_EDIT_PERSON_SUCCESS = "Editted Person: %1$s";    
    
    public EditCommand(int targetVisibleIndex, String type, String value) {
        super(targetVisibleIndex);
        this.type = type;
        this.value = value;
    }
    
    @Override
    public CommandResult execute() {
        try {
            final Person target = getTargetPerson();
            if (type == "Email") {
                target = new Person(
                        new Name(target.getName()),
                        new Phone(target.getPhone(), target.getPhone().isPrivate()),
                        new Email(value, target.getEmail().isPrivate()),
                        new Address(target.getAddress(), target.getAddress().isPrivate()),
                        new UniqueTagList(tagSet)
                );
            } else if (type == "Phone") {
                target = new Person(
                        new Name(target.getName()),
                        new Phone(value, target.getPhone().isPrivate()),
                        new Email(target.getEmail(), target.getEmail().isPrivate()),
                        new Address(target.getAddress(), target.getAddress().isPrivate()),
                        new UniqueTagList(tagSet)
            } else if (type == "Address") {
                target = new Person(
                        new Name(target.getName()),
                        new Phone(target.getPhone(), target.getPhone().isPrivate()),
                        new Email(target.getEmail(), target.getEmail().isPrivate()),
                        new Address(value, target.getAddress().isPrivate()),
                        new UniqueTagList(tagSet)
            }
            // addressBook.removePerson(target);
            return new CommandResult(String.format(MESSAGE_EDIT_PERSON_SUCCESS, target));

        } catch (IndexOutOfBoundsException ie) {
            return new CommandResult(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        } catch (PersonNotFoundException pnfe) {
            return new CommandResult(Messages.MESSAGE_PERSON_NOT_IN_ADDRESSBOOK);
        }
    }
}
