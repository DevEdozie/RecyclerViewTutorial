package com.hfad.recyclerviewtutorial;

public class Book {

    private String[] titles = {"Chapter One",
            "Chapter Two",
            "Chapter Three",
            "Chapter Four",
            "Chapter Five",
            "Chapter Six"
    };

    private String[] details = {"Item one details",
            "Item two details", "Item three details",
            "Item four details", "Item five details",
            "Item six details"
    };

    private int[] images = {R.drawable.cappuccino,
            R.drawable.diavolo, R.drawable.filter,
            R.drawable.funghi, R.drawable.latte,
            R.drawable.restaurant
    };

    public String[] getTitles() {
        return titles;
    }

    public String[] getDetails() {
        return details;
    }

    public int[] getImages() {
        return images;
    }
}
