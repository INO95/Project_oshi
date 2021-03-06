package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*import action.Action;
import action.BestListAction;
import action.BoardMainAction;
import action.BoardRegisterBoardContentAction;
import action.ContentAction;
import action.DeclarationAction;
import action.DeclarationCheckAction;
import action.DuplicateCheckAction;
import action.LikeCheckAction;
import action.ListAction;
import action.MemberRegisterAction;
import action.MemberRegisterProcAction;
import action.RecommandListAction;
import action.RecommandReadAction;
import action.RecommandUpdateAction;
import action.RecommandWriteAction;
import action.RecommandWriteProcAction;
import action.UpdateAction;
import action.UpdateProcAction;
import action.WriteAction;
import action.WriteProcAction;
import action.YoutuberRegisterAction;
import action.YoutuberRegisterProcAction;
import action.BoardMainAction;
import action.loginProcAction;
import action.logoutProcAction;
import action.mainAction;
import action.memberDeleteAction;
import action.memberDeleteProcAction;
import action.memberModifyAction;
import action.memberModifyProcAction;
import action.testAction;*/
import action.*;
import vo.ActionForward;



@WebServlet("*.oshi")
public class OshiFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
		Action action = null;
		ActionForward forward = null;
		
		
		
		//url??? ?????? ??????
		switch (command) {
		case "/main.oshi":
			action = new MainAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		case "/memberRegister.oshi":
			action = new MemberRegisterAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
			
		case "/memberRegisterProc.oshi":
			action = new MemberRegisterProcAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		case "/loginProc.oshi":
			action = new LoginProcAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		case "/logoutProc.oshi":
			action = new LogoutProcAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		case "/memberModify.oshi":
			action = new MemberModifyAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		case "/memberModifyProc.oshi":
			action = new MemberModifyProcAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		
		case "/memberDelete.oshi":
			action = new MemberDeleteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		case "/memberDeleteProc.oshi":
			action = new MemberDeleteProcAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}			
		break;
		
	
		
		case "/individual_read.oshi":   //??????
			action = new ContentAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		case "/duplicateCheck.oshi":
			action = new DuplicateCheckAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		
		case "/likeCheck.oshi":
			action = new LikeCheckAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		
		case "/individual_write.oshi":    //??????
			action = new WriteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		
		case "/writeProc.oshi":   //??????
			action = new WriteProcAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		case "/updateProc.oshi":   //??????
			action = new UpdateProcAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		case "/update.oshi":    //??????
			action = new UpdateAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		case "/boardMain.oshi":
			action = new BoardMainAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		break;
		
		
		//4.23 ?????????
        case "/recommandUpdateProc.oshi":
           action = new RecommandUpdateProcAction();
           try {
              forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
           break;
           
        case "/recommandDelete.oshi":
           action = new RecommandDeleteAction();
           try {
              forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
           break;
           
        case "/adminMain.oshi":
           action = new AdminMainAction();
           try {
              forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
           break;
           
        case "/adminNotice.oshi":
           action = new AdminNoticeAction();
           try {
              forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
           break;
           
        case "/adminAuthority.oshi":
           action = new AdminAuthorityAction();
           try {
              forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
           break;
        case "/adminReport.oshi":
           action = new AdminReportAction();
           try {
              forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
           break;
        case "/adminBoardRegister.oshi":
           action = new AdminBoardRegisterAction();
           try {
              forward = action.execute(request, response);
           } catch (Exception e) {
              e.printStackTrace();
           }
           break;
		
           
        case "/deletePro.oshi":
            action = new DeleteProcAction();
            try {
               forward = action.execute(request, response);
            } catch (Exception e) {
               e.printStackTrace();
            }
            
         break;
         
         case "/delete.oshi":
            action = new DeleteAction();
            try {
               forward = action.execute(request, response);
            } catch (Exception e) {
               e.printStackTrace();
            }
            
         break;
		
		  case "/recommand.oshi":
		         action = new RecommandListAction();
		         try {
		            forward = action.execute(request, response);
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
		      break;
		      //??????????????????-?????????
		      case "/recommandWrite.oshi":
		         action = new RecommandWriteAction();
		         try {
		            forward = action.execute(request, response);
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
		      break;
		      //??????????????????-?????????2
		      case "/recommandWriteProc.oshi":
		         action = new RecommandWriteProcAction();
		         try {
		            forward = action.execute(request, response);
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
		      break;
		      //??????????????????-??????
		      case "/recommandRead.oshi":
		         action = new RecommandReadAction();
		         try {
		            forward = action.execute(request, response);
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
		      break;
		      //??????????????????-??????
		      case "/recommandUpdate.oshi":
		         action = new RecommandUpdateAction();
		         try {
		            forward = action.execute(request, response);
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
		      break;
		
		      
		      
		   // ?????? ????????? - ??????
		      case "/individual_board.oshi":
		         action = new ListAction();
		         try {
		            forward = action.execute(request, response);
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
		         
		      break;

		// ????????? - ??????
		      case "/individual_best_board.oshi":
		         action = new BestListAction();
		         try {
		            forward = action.execute(request, response);
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
		         
		      break;
		      
		      // ???????????????????????? ????????? ????????? ???????????? - ??????
		      case "/youtuberRegister.oshi":
		         action = new YoutuberRegisterAction();
		         try {
		            forward = action.execute(request, response);
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
		         
		      break;
		      
		      //????????? ?????? ????????? ?????????
		      case "/youtuberRegisterProc.oshi":
		         action = new YoutuberRegisterProcAction();
		         try {
		            forward = action.execute(request, response);
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
		         
		      break;
		      
		      
		   // ???????????????????????? ????????? ????????? ???????????? - ??????
		      case "/adminRegister.oshi":
		         action = new AdminRegisterAction();
		         try {
		            forward = action.execute(request, response);
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
		         
		      break;
		      
		      //????????? ?????? ????????? ?????????
		      case "/adminRegisterProc.oshi":
		         action = new AdminRegisterProcAction();
		         try {
		            forward = action.execute(request, response);
		         } catch (Exception e) {
		            e.printStackTrace();
		         }
		         
		      break;
		      
		      
		      
		      
		      
		      
		      case "/BoardInfoUpdate.oshi":
					action = new BoardInfoUpdateAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				
				//????????? ?????? - ??????
				case "/BoardInfoUpdateProc.oshi":
					action = new BoardInfoUpdateProcAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				//?????????????????? -??????
				case "/NoticeList.oshi":
					action = new NoticeListAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				//?????????????????? -??????
				case "/NoticeWrite.oshi":
					action = new NoticeWriteAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;

				
				//?????????????????? ?????? -??????
				case "/NoticeWriteProc.oshi":
					action = new NoticeWriteProcAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				//????????? ?????? -??????
				case "/NoticeRead.oshi":
					action = new NoticeReadAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;


		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      //?????? ??????
		      case "/declaration.oshi":
		          action = new DeclarationAction();
		          try {
		             forward = action.execute(request, response);
		          } catch (Exception e) {
		             e.printStackTrace();
		          }
		          
		       break;   
		       
		       case "/declarationCheck.oshi":
		          action = new DeclarationCheckAction();
		          try {
		             forward = action.execute(request, response);
		          } catch (Exception e) {
		             e.printStackTrace();
		          }
		          
		       break;   
		     //??????(?????? ??????)
	             case "/insertCommentsCheck.oshi":
	                   action = new CommentsProcAction();
	                   try {
	                      forward = action.execute(request, response);
	                   } catch (Exception e) {
	                      e.printStackTrace();
	                   }
	                   
	          //??????(?????? ??????)
	             case "/deleteCommentsProc.oshi":
	                   action = new DeleteCommentsProcAction();
	                   try {
	                      forward = action.execute(request, response);
	                   } catch (Exception e) {
	                      e.printStackTrace();
	                   }
	                       
	                break; 
		       //??????(????????????)
	             case "/favoriteCheck.oshi":
	                   action = new FavoriteAction();
	                   try {
	                      forward = action.execute(request, response);
	                   } catch (Exception e) {
	                      e.printStackTrace();
	                   }
	                       
	                break;   
		     //?????? (????????? ?????? ????????? ???)
				case "/boardRegisterBoard.oshi":
					action = new BoardRegisterBoardAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				
				
				
				//?????? (????????? ?????? ????????? ??? ???)
				case "/boardRegisterBoardForm.oshi":
					action = new BoardRegisterBoardFormAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				
				//??????(????????????????????????)
				case "/deleteFav.oshi":
					action = new DeleteFavAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				
				//??????(????????? ?????? ????????? ??? ????????????)
				case "/boardRegisterBoardFormProc.oshi":
					action = new BoardRegisterBoardFormProcAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				//??????(????????? ?????? ????????? ?????? ??????)
				case "/boardRegisterBoardContent.oshi":
					action = new BoardRegisterBoardContentAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				//??????(????????? ?????? ????????? ?????? ??????)
				case "/boardRegisterBoardContentCommentProc.oshi":
					action = new BoardRegisterBoardContentProcAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;

				//??????(????????? ?????? ????????? ????????? ??????)
				case "/boardRegisterBoardRecommendProc.oshi":
					action = new BoardRegisterBoardRecommendProcAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				//??????(????????? ?????? ????????? ????????? ??????)
				case "/boardRegisterBoardDeleteProc.oshi":
					action = new BoardRegisterBoardDeleteProcAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				//??????(????????? ?????? ????????? ????????? ?????? ???)
				case "/boardRegisterBoardModify.oshi":
					action = new BoardRegisterBoardModifyAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				
				//??????(????????? ?????? ????????? ????????? ??????)
				case "/boardRegisterBoardFormModifyProc.oshi":
					action = new BoardRegisterBoardModifyProcAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				
				//??????(?????? ?????? ??????)
				case "/boardRegisterBoardContentCommentDeleteProc.oshi":
					action = new BoardRegisterBoardContentCommentDeleteProc();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				

				//??????(????????? ????????? ?????? ?????? ?????? ??????)
				case "/adminBoardRegisterProc.oshi":
					action = new AdminBoardRegisterProc();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				case "/recommandCommentsProc.oshi":
					action = new RecommandCommentsProcAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				case "/recommandDeleteCommentsProc.oshi":
					action = new RecommandDeleteCommentsProcAction();
					try {
						forward = action.execute(request, response);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				break;
				
				
				
		
		
		default:
			break;
		}
		
		
		//?????? ?????????, ???????????????
		if(forward != null) {
			if(forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			}else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
		
	}
}
