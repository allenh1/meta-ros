# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This rqt plugin ROS package provides easy view of .launch files.
  User can also"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python_qt_binding roslaunch rospy rqt_console rqt_gui rqt_gui_py rqt_py_common"
SRC_URI = "https://github.com/ros-gbp/rqt_launch-release/archive/release/lunar/rqt_launch/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7e2fe0cff89161923f8778faf40c0189"
SRC_URI[sha256sum] = "5dd7364599b1dca58adf893b2b068320fd49cfc70838d4837ead7d7917da1c1a"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
