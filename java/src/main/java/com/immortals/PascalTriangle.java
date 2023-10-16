package com.immortals;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        int rowIndex = 4; // Replace this with the desired row index
        List<Integer> result = pascalTriangle.getRow(rowIndex);

        System.out.println(result);
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        if (rowIndex < 0)
            return row;

        for (int i = 0; i <= rowIndex; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
        }

        return row;
    }
}
