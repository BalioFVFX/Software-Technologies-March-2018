using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using TODOLIST.Models;

namespace _0._2_TODO_List.Controllers
{
    public class TaskController : Controller
    {
        [HttpPost]
        public IActionResult Create(Task task)
        {
            if(task == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {
                db.tasks.Add(task);
                db.SaveChanges();
            }
            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public ActionResult Delete(int? id)
        {
            if(id == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {

                var task = db.tasks.Find(id);

                if(task == null)
                {
                    return RedirectToAction("Index", "Home");
                }

                db.tasks.Remove(task);
                db.SaveChanges();
            }

            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {
                var task = db.tasks.Find(id);

                if (task == null)
                {
                    return RedirectToAction("Index", "Home");
                }

                return RedirectToAction("Details", "Home", new { id });
            } 
        }
    }
}