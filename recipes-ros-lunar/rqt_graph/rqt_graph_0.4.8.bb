# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_graph provides a GUI plugin for visualizing the ROS
      computation graph."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin python-rospkg python_qt_binding qt_dotgraph rosgraph rosgraph_msgs roslib rosnode rospy rosservice rostopic rqt_gui rqt_gui_py"
SRC_URI = "https://github.com/ros-gbp/rqt_graph-release/archive/release/lunar/rqt_graph/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b91d0e006bfe43c88c05c02e79ee85af"
SRC_URI[sha256sum] = "113bb8298af2e3fb3513171f895a8c540daf405f30736fde0787f3847a7c9531"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
