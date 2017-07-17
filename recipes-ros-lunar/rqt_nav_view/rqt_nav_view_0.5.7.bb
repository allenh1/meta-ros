# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_nav_view provides a gui for viewing navigation maps and paths."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=9501164cba4e4d9d3ef034fd9a0ca032"

DEPENDS = "catkin geometry_msgs nav_msgs python_qt_binding qt_gui rospy rqt_gui rqt_gui_py rqt_py_common tf"
SRC_URI = "https://github.com/ros-gbp/rqt_nav_view-release/archive/release/lunar/rqt_nav_view/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a0df8cf971823e29376dbea50e242de9"
SRC_URI[sha256sum] = "20aa0131afe3ea6f00e8dc41e6a5a1e9f4b79c9b477ab922d1dc99499c41a0f2"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
