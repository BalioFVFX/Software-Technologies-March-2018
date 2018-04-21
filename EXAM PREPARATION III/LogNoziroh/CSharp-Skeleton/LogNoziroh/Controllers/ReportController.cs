namespace LogNoziroh.Controllers
{
    using Microsoft.AspNetCore.Mvc;
    using Models;
    using System.Collections.Generic;
    using System.Linq;

    public class ReportController : Controller
    {
        private readonly LogNozirohDbContext dbContext;

        public ReportController(LogNozirohDbContext dbContext)
        {
            this.dbContext = dbContext;
        }

        [HttpGet]
        [Route("")]
        public IActionResult Index()
        {
            List<Report> reports = dbContext.Reports.ToList();

            return View(reports);
        }

        [HttpGet]
        [Route("details/{id}")]
        public IActionResult Details(int id)
        {
            return View(dbContext.Reports.Find(id));
        }

        [HttpGet]
        [Route("create")]
        public IActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public IActionResult Create(Report report)
        {
            dbContext.Reports.Add(report);
            dbContext.SaveChanges();

            return RedirectToAction("Index");
        }

        [HttpGet]
        [Route("delete/{id}")]
        public IActionResult Delete(int id)
        {
            return View(dbContext.Reports.Find(id));
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public IActionResult DeleteConfirm(Report reportModel)
        {
            dbContext.Reports.Remove(reportModel);
            dbContext.SaveChanges();

            return RedirectToAction("Index");
        }
    }
}
