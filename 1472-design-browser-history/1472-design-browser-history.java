class PageNode {
    String url;
    PageNode prev;
    PageNode next;

    public PageNode(String url) {
        this.url = url;
    }
}

public class BrowserHistory {
    private PageNode currentPage;

    public BrowserHistory(String homepage) {
        this.currentPage = new PageNode(homepage);
    }
    
    public void visit(String url) {
        PageNode newPage = new PageNode(url);
        currentPage.next = newPage;
        newPage.prev = currentPage;
        currentPage = newPage;
    }
    
    public String back(int steps) {
        while (steps > 0 && currentPage.prev != null) {
            currentPage = currentPage.prev;
            steps--;
        }
        return currentPage.url;
    }
    
    public String forward(int steps) {
        while (steps > 0 && currentPage.next != null) {
            currentPage = currentPage.next;
            steps--;
        }
        return currentPage.url;
    }
}