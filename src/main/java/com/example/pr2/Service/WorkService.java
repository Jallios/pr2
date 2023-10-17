package com.example.pr2.Service;

import com.example.pr2.CRUD;
import com.example.pr2.Models.Cat;
import com.example.pr2.Models.User;
import com.example.pr2.Models.Work;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkService implements CRUD<Work> {

    private static long WORK_COUNT;
    private final List<Work> workList;
    {
        workList = new ArrayList<>();

        workList.add(new Work(++WORK_COUNT, "ул.Тестовая д.404","БЕЗ404",70000.00f));
    }
    @Override
    public List<Work> index() {
        return workList;
    }

    @Override
    public Work show(Long id) {
        return workList.stream().filter(work -> work.getId_work() == id).findAny().orElse(null);
    }

    @Override
    public void save(Work work) {
        work.setId_work(++WORK_COUNT);
        workList.add(work);
    }

    @Override
    public void update(Long id, Work work) {
        Work workToUpdate = show(id);

        workToUpdate.setAddress(work.getAddress());
        workToUpdate.setCompany_name(work.getCompany_name());
        workToUpdate.setSalary(work.getSalary());
    }

    @Override
    public void delete(Long id) {
        workList.removeIf(p -> p.getId_work() == id);
    }
}
