# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An rqt-based tool that assists monitoring tasks
   for  motion planner
   develo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=56fd1e911d46560b6e3a84ffc07a0117"

DEPENDS = "catkin python_qt_binding rosnode rospy rostopic rqt_gui rqt_gui_py rqt_py_common rqt_topic sensor_msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_moveit-release/archive/release/lunar/rqt_moveit/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c8fbc4e03d9f259ede69c49d91b11977"
SRC_URI[sha256sum] = "c32768d2983be346e38ed35ae186cdddee7bb42caf03df027064974d0e3fa5af"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
