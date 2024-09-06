package ir.freeland.springboot.corruptedItem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ir.freeland.springboot.corruptedItem.CorruptedItem;

public interface CorruptedItemRepository extends JpaRepository<CorruptedItem, Long> {
}
