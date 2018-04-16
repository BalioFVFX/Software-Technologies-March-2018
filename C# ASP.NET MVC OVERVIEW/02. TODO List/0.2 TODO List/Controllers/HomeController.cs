using Microsoft.AspNetCore.Mvc;
using System.Linq;
using TODOLIST.Models;

namespace _0._2_TODO_List.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            using (var db = new TaskDbContext())
            {
                var tasks = db.tasks.ToList();

                return View(tasks);
            }
        }

      
        public IActionResult Details(int id)
        {
            using (var db = new TaskDbContext())
            {
                var task = db.tasks.Find(id);

                return View(task);
            }
        }

        public IActionResult Edit(int id)
        {
            using (var db = new TaskDbContext())
            {
                var task = db.tasks.Find(id);

                return View(task);
            }
        }

    }
}
