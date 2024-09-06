package ir.freeland.springboot.corruptedItem.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ir.freeland.springboot.corruptedItem.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
	Item findItemByName(String name);
    Optional<Item> findById(Long id);

}

