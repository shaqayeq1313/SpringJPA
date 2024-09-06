package ir.freeland.springboot.corruptedItem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ir.freeland.springboot.corruptedItem.CorruptedItem;
import ir.freeland.springboot.corruptedItem.repository.CorruptedItemRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CorruptedItemService {

    @Autowired
    private CorruptedItemRepository corruptedItemRepository;

    public List<CorruptedItem> getAllCorruptedItems() {
        return corruptedItemRepository.findAll();
    }

    public Optional<CorruptedItem> getCorruptedItemById(Long id) {
        return corruptedItemRepository.findById(id);
    }

    public CorruptedItem createCorruptedItem(CorruptedItem corruptedItem) {
        return corruptedItemRepository.save(corruptedItem);
    }

    public void deleteCorruptedItem(Long id) {
        corruptedItemRepository.deleteById(id);
    }
}
