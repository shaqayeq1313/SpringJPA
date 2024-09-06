package ir.freeland.springboot.corruptedItem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ir.freeland.springboot.corruptedItem.CorruptedItem;
import ir.freeland.springboot.corruptedItem.service.CorruptedItemService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/corrupted-items")
public class CorruptedItemController {

    @Autowired
    private CorruptedItemService corruptedItemService;

    public CorruptedItemController(CorruptedItemService corruptedItemService) {
		this.corruptedItemService = corruptedItemService;
	}

	@GetMapping
    public List<CorruptedItem> getAllCorruptedItems() {
        return corruptedItemService.getAllCorruptedItems();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CorruptedItem> getCorruptedItemById(@PathVariable Long id) {
        Optional<CorruptedItem> corruptedItem = corruptedItemService.getCorruptedItemById(id);
        return corruptedItem.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<CorruptedItem> createCorruptedItem(@RequestBody CorruptedItem corruptedItem) {
        CorruptedItem newCorruptedItem = corruptedItemService.createCorruptedItem(corruptedItem);
        return new ResponseEntity<>(newCorruptedItem, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCorruptedItem(@PathVariable Long id) {
        corruptedItemService.deleteCorruptedItem(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
